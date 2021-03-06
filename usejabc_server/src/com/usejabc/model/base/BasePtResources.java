package com.usejabc.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BasePtResources<M extends BasePtResources<M>> extends Model<M> implements IBean {

	public void setIds(java.lang.String ids) {
		set("ids", ids);
	}

	public java.lang.String getIds() {
		return get("ids");
	}

	public void setVersion(java.lang.Long version) {
		set("version", version);
	}

	public java.lang.Long getVersion() {
		return get("version");
	}

	public void setOsname(java.lang.String osname) {
		set("osname", osname);
	}

	public java.lang.String getOsname() {
		return get("osname");
	}

	public void setIps(java.lang.String ips) {
		set("ips", ips);
	}

	public java.lang.String getIps() {
		return get("ips");
	}

	public void setHostname(java.lang.String hostname) {
		set("hostname", hostname);
	}

	public java.lang.String getHostname() {
		return get("hostname");
	}

	public void setCpunumber(java.lang.Long cpunumber) {
		set("cpunumber", cpunumber);
	}

	public java.lang.Long getCpunumber() {
		return get("cpunumber");
	}

	public void setCpuratio(java.math.BigDecimal cpuratio) {
		set("cpuratio", cpuratio);
	}

	public java.math.BigDecimal getCpuratio() {
		return get("cpuratio");
	}

	public void setPhymemory(java.lang.Long phymemory) {
		set("phymemory", phymemory);
	}

	public java.lang.Long getPhymemory() {
		return get("phymemory");
	}

	public void setPhyfreememory(java.lang.Long phyfreememory) {
		set("phyfreememory", phyfreememory);
	}

	public java.lang.Long getPhyfreememory() {
		return get("phyfreememory");
	}

	public void setJvmtotalmemory(java.lang.Long jvmtotalmemory) {
		set("jvmtotalmemory", jvmtotalmemory);
	}

	public java.lang.Long getJvmtotalmemory() {
		return get("jvmtotalmemory");
	}

	public void setJvmfreememory(java.lang.Long jvmfreememory) {
		set("jvmfreememory", jvmfreememory);
	}

	public java.lang.Long getJvmfreememory() {
		return get("jvmfreememory");
	}

	public void setJvmmaxmemory(java.lang.Long jvmmaxmemory) {
		set("jvmmaxmemory", jvmmaxmemory);
	}

	public java.lang.Long getJvmmaxmemory() {
		return get("jvmmaxmemory");
	}

	public void setGccount(java.lang.Long gccount) {
		set("gccount", gccount);
	}

	public java.lang.Long getGccount() {
		return get("gccount");
	}

	public void setCreatedate(java.util.Date createdate) {
		set("createdate", createdate);
	}

	public java.util.Date getCreatedate() {
		return get("createdate");
	}

}
