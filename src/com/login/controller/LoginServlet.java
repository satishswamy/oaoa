package com.login.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.db.DbControl;
import com.login.util.Util;

// Ctrl+shift+o - for import 

public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userId = req.getParameter("userId");
		String password = req.getParameter("password");
		
		System.out.println("UserId --->"+userId+"  Password-->"+password);
		
		/*
		 * Util util = new Util(); boolean result = util.authenticate(userId, password);
		 * if (result) { System.out.println("Login success");
		 * resp.sendRedirect("suc.jsp"); }else { System.out.println("Login Failed");
		 * resp.sendRedirect("fail.jsp"); }
		 */
		
		
		DbControl dbControl = new DbControl();
		dbControl.DbAccess(userId, password);
		
	}

}
