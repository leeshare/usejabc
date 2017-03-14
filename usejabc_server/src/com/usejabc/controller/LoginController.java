package com.usejabc.controller;

import com.jfinal.aop.Before;
import com.jfinal.aop.Clear;
import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;
import com.usejabc.interceptor.ControllerInterceptor;
import com.usejabc.interceptor.ActionInterceptor;
import com.usejabc.model.AbcUser;

@Before(ControllerInterceptor.class)
public class LoginController extends Controller {
	
	//访问路由为 /login
	@Before(ActionInterceptor.class)
	public void index() {
		//renderText("Hello JFinal World.");
		
		//render("login.html");
		
		String result = "renderJson in index";
		renderJson(result);
	}
	
	//访问路由为 /login1
	@ActionKey("/login1")
	public void login(){
		//render("login.html");
		renderText("Hello JFinal World111.");
	}
	
	//访问路由为 /login/login2
	@Clear 
	public void login2(){

		renderText("redisText in login2.");
		
		//getModel(SiteUser.class, "");
		
		//new SiteUser().operateUser();
		//new SiteUser().operateRecord();
		//String result = new SiteUser().operateTransaction();
		//renderText(result);
	}
	
	@Clear(ControllerInterceptor.class)
	@Before(ActionInterceptor.class)
	public void login3(){
		renderText("redisText in login3");
	}
}
