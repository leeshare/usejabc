package com.usejabc.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BasePtGrouprole<M extends BasePtGrouprole<M>> extends Model<M> implements IBean {

	public void setIds(java.lang.String ids) {
		set("ids", ids);
	}

	public java.lang.String getIds() {
		return get("ids");
	}

	public void setGroupids(java.lang.String groupids) {
		set("groupids", groupids);
	}

	public java.lang.String getGroupids() {
		return get("groupids");
	}

	public void setRoleids(java.lang.String roleids) {
		set("roleids", roleids);
	}

	public java.lang.String getRoleids() {
		return get("roleids");
	}

}