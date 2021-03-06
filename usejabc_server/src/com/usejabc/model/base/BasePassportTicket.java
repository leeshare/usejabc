package com.usejabc.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BasePassportTicket<M extends BasePassportTicket<M>> extends Model<M> implements IBean {

	public void setAppSigninId(java.lang.String appSigninId) {
		set("APP_SIGNIN_ID", appSigninId);
	}

	public java.lang.String getAppSigninId() {
		return get("APP_SIGNIN_ID");
	}

	public void setSigninId(java.lang.String signinId) {
		set("SIGNIN_ID", signinId);
	}

	public java.lang.String getSigninId() {
		return get("SIGNIN_ID");
	}

	public void setAppId(java.lang.String appId) {
		set("APP_ID", appId);
	}

	public java.lang.String getAppId() {
		return get("APP_ID");
	}

	public void setAppSigninTime(java.util.Date appSigninTime) {
		set("APP_SIGNIN_TIME", appSigninTime);
	}

	public java.util.Date getAppSigninTime() {
		return get("APP_SIGNIN_TIME");
	}

	public void setAppSigninTimeout(java.util.Date appSigninTimeout) {
		set("APP_SIGNIN_TIMEOUT", appSigninTimeout);
	}

	public java.util.Date getAppSigninTimeout() {
		return get("APP_SIGNIN_TIMEOUT");
	}

	public void setAppSigninUrl(java.lang.String appSigninUrl) {
		set("APP_SIGNIN_URL", appSigninUrl);
	}

	public java.lang.String getAppSigninUrl() {
		return get("APP_SIGNIN_URL");
	}

	public void setAppSigninIp(java.lang.String appSigninIp) {
		set("APP_SIGNIN_IP", appSigninIp);
	}

	public java.lang.String getAppSigninIp() {
		return get("APP_SIGNIN_IP");
	}

	public void setAppLogoffUrl(java.lang.String appLogoffUrl) {
		set("APP_LOGOFF_URL", appLogoffUrl);
	}

	public java.lang.String getAppLogoffUrl() {
		return get("APP_LOGOFF_URL");
	}

	public void setDelFlag(java.lang.String delFlag) {
		set("DEL_FLAG", delFlag);
	}

	public java.lang.String getDelFlag() {
		return get("DEL_FLAG");
	}

}
