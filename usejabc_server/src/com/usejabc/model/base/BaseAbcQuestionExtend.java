package com.usejabc.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseAbcQuestionExtend<M extends BaseAbcQuestionExtend<M>> extends Model<M> implements IBean {

	public void setQuesId(java.lang.Integer quesId) {
		set("ques_id", quesId);
	}

	public java.lang.Integer getQuesId() {
		return get("ques_id");
	}

}
