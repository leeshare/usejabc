package com.usejabc.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BasePtRoleoperator<M extends BasePtRoleoperator<M>> extends Model<M> implements IBean {

	public void setIds(java.lang.String ids) {
		set("ids", ids);
	}

	public java.lang.String getIds() {
		return get("ids");
	}

	public void setRoleIds(java.lang.String roleIds) {
		set("roleIds", roleIds);
	}

	public java.lang.String getRoleIds() {
		return get("roleIds");
	}

	public void setOperatorIds(java.lang.String operatorIds) {
		set("operatorIds", operatorIds);
	}

	public java.lang.String getOperatorIds() {
		return get("operatorIds");
	}

}
