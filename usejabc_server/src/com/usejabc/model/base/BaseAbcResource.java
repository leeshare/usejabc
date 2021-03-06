package com.usejabc.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseAbcResource<M extends BaseAbcResource<M>> extends Model<M> implements IBean {

	public void setResId(java.lang.Integer resId) {
		set("res_id", resId);
	}

	public java.lang.Integer getResId() {
		return get("res_id");
	}

	public void setResName(java.lang.String resName) {
		set("res_name", resName);
	}

	public java.lang.String getResName() {
		return get("res_name");
	}

	public void setResKeyword(byte[] resKeyword) {
		set("res_keyword", resKeyword);
	}

	public byte[] getResKeyword() {
		return get("res_keyword");
	}

	public void setResDesc(java.lang.String resDesc) {
		set("res_desc", resDesc);
	}

	public java.lang.String getResDesc() {
		return get("res_desc");
	}

	public void setResUrl(java.lang.String resUrl) {
		set("res_url", resUrl);
	}

	public java.lang.String getResUrl() {
		return get("res_url");
	}

	public void setResType(java.lang.Integer resType) {
		set("res_type", resType);
	}

	public java.lang.Integer getResType() {
		return get("res_type");
	}

	public void setResStatus(java.lang.Integer resStatus) {
		set("res_status", resStatus);
	}

	public java.lang.Integer getResStatus() {
		return get("res_status");
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
