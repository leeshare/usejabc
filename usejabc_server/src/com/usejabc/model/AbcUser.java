package com.usejabc.model;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.IAtom;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;
import com.usejabc.config.AppConst;
import com.usejabc.model.base.BaseAbcUser;
import com.usejabc.tool.Str2MD5;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class AbcUser extends BaseAbcUser<AbcUser> {
	public static final AbcUser dao = new AbcUser();
	
	public String currentLoginName = "";
	public String authServer = "";
	
	private String defaultPassword = "a111111";
	
	//通过 Model 修改/添加/删除 数据库
	public void testOperateUser(){
		String md5Pwd = Str2MD5.MD5(defaultPassword, 16);
		dao.set("real_name", "李良").set("password", md5Pwd).save();
		
		dao.deleteById(1760);
		
		dao.findById(1753).set("mobile", "13511112222").update();
		
		AbcUser user = AbcUser.dao.findByIdLoadColumns(1755, "real_name, login_name");
		
		String userRealName = user.getStr("real_name");
		String loginName = user.getStr("login_name");
		
		List<AbcUser> users = AbcUser.dao.find("SELECT * FROM AbcUser WHERE user_id <= 20");
		
		Page<AbcUser> userPage = AbcUser.dao.paginate(1, 10, "SELECT *", "FROM AbcUser WHERE user_id <= ?", 100);
		if(userPage.isFirstPage()){
			
		}
		
	}
	
	//通过 Db + Record 修改/添加/删除 数据库
	public void testOperateRecord(){
		String md5Pwd = Str2MD5.MD5(defaultPassword, 16);
		Record user = new Record().set("real_name", "James.Lee").set("password", md5Pwd);
		Db.save("AbcUser", user);
		
		Db.deleteById("AbcUser", "user_id", 1894);
		
		user = Db.findById("AbcUser", "user_id", 1895).set("login_name", "James");
		Db.update("AbcUser", "user_id", user);
		
		String loginName = user.getStr("login_name");
		String passWrod = user.getStr("password");
		
		List<Record> users = Db.find("SELECT * FROM AbcUser WHERE user_id <= 20");
		
		Page<Record> userPage = Db.paginate(1, 10, "SELECT *", "FROM AbcUser WHERE user_id <= ?", 100);
		if(userPage.isFirstPage()){
			String a = "22";
		}
	}
	
	public String testOperateTransaction(){
		//事务处理
		boolean succeed = Db.tx(new IAtom() {
			
			@Override
			public boolean run() throws SQLException {
				// 表 Site_User 的引擎是 InnoDB 才能使用事务
				int count = Db.update("UPDATE AbcUser SET login_name = 'abcc' WHERE user_id = ?", 1895);
				//count = 1
				int count2 = Db.update("UPDATE AbcUser SET login_name = 'def' WHERE user_id = ?", 1894);
				//count2 = 0
				//如果 表Site_User 的引擎是 MyISAM 则，第一条执行成功了；第二条未找到。
				return count == 1 && count2 == 1;
			}
		});
		
		if(succeed)
			return "success";
		else
			return "failed";
	}
	
	public AbcUser signIn(String loginName, String password){
		String sql = String.format("SELECT * FROM AbcUser WHERE (login_name = '%s' OR mobile = '%s' OR email = '%s')", loginName, loginName, loginName);
		List<AbcUser> users = dao.find(sql);
		if(users.size() >= 1){
			AbcUser user = users.get(0);
			
			boolean isFailedLock = false;
			PassportUseraccesslog log = (new PassportUseraccesslog()).getAccessLog(user.getUserId());
			if(log != null && log.getFailedPasswordAttemptCount() > 0){
				Date now = new Date();
				if(log.getFailedPasswordAttemptCount() > AppConst.LOGIN_FAIL_PWD_MAX_TIME
						&& ((new Date()).getTime() - log.getFailedPasswordAttemptStart().getTime())/(1000*60) <= AppConst.LOGIN_FAIL_PWD_LOCK_PERIOD){
					isFailedLock = true;
				}
			}
			
			String pwd = Str2MD5.MD5(password, 16);
			if(user.getPassword().equals(pwd)){
				if(user.getStatus() == 0){
					//抛出用户状态异常
					//throw
				}else {
					(new PassportUseraccesslog()).dao.saveAccessSucceedLog(user.getUserId());
					return user;
				}
			}else {
				if(!isFailedLock){
					(new PassportUseraccesslog()).dao.saveAccessFailLog(user.getUserId());
					//用户名或密码错误
					//throw
				}else {
					//超过：规定的时间内尝试过多次数
					//throw new Exception();
				}
			}
		}
		return null;
	}
}
