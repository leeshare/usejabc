package com.usejabc.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseAbcUser<M extends BaseAbcUser<M>> extends Model<M> implements IBean {

	public void setUserId(java.lang.Integer userId) {
		set("user_id", userId);
	}

	public java.lang.Integer getUserId() {
		return get("user_id");
	}

	public void setLoginName(java.lang.String loginName) {
		set("login_name", loginName);
	}

	public java.lang.String getLoginName() {
		return get("login_name");
	}

	public void setPassword(java.lang.String password) {
		set("password", password);
	}

	public java.lang.String getPassword() {
		return get("password");
	}

	public void setMobile(java.lang.String mobile) {
		set("mobile", mobile);
	}

	public java.lang.String getMobile() {
		return get("mobile");
	}

	public void setEmail(java.lang.String email) {
		set("email", email);
	}

	public java.lang.String getEmail() {
		return get("email");
	}

	public void setRealName(java.lang.String realName) {
		set("real_name", realName);
	}

	public java.lang.String getRealName() {
		return get("real_name");
	}

	public void setTitleName(java.lang.String titleName) {
		set("title_name", titleName);
	}

	public java.lang.String getTitleName() {
		return get("title_name");
	}

	public void setDesc(java.lang.String desc) {
		set("desc", desc);
	}

	public java.lang.String getDesc() {
		return get("desc");
	}

	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}

	public java.lang.Integer getStatus() {
		return get("status");
	}

	public void setPhotoUrl(java.lang.String photoUrl) {
		set("photo_url", photoUrl);
	}

	public java.lang.String getPhotoUrl() {
		return get("photo_url");
	}

	public void setOrgId(java.lang.Integer orgId) {
		set("org_id", orgId);
	}

	public java.lang.Integer getOrgId() {
		return get("org_id");
	}

	public void setDepartmentId(java.lang.Integer departmentId) {
		set("department_id", departmentId);
	}

	public java.lang.Integer getDepartmentId() {
		return get("department_id");
	}

	public void setCreateUser(java.lang.Integer createUser) {
		set("create_user", createUser);
	}

	public java.lang.Integer getCreateUser() {
		return get("create_user");
	}

	public void setCreateDate(java.util.Date createDate) {
		set("create_date", createDate);
	}

	public java.util.Date getCreateDate() {
		return get("create_date");
	}

	public void setUpdateUser(java.lang.Integer updateUser) {
		set("update_user", updateUser);
	}

	public java.lang.Integer getUpdateUser() {
		return get("update_user");
	}

	public void setUpdateDate(java.util.Date updateDate) {
		set("update_date", updateDate);
	}

	public java.util.Date getUpdateDate() {
		return get("update_date");
	}

}