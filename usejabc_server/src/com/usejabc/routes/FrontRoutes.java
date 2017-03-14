package com.usejabc.routes;

import com.jfinal.config.Routes;
import com.usejabc.controller.LoginController;

public class FrontRoutes extends Routes {

	public void config(){
		add("/login", LoginController.class);
	}
}
