package com.usejabc.routes;

import com.jfinal.config.Routes;
import com.usejabc.controller.AdminController;
import com.usejabc.controller.UserController;

public class AdminRoutes extends Routes {

	public void config(){
		add("/admin", AdminController.class);
		add("/admin/user", UserController.class);
	}
	
}
