package com.guoya;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class post_http extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String login = req.getParameter("login");
		String password = req.getParameter("password");
		
		System.out.println("login:"+login);
		System.out.println("passwoed:"+password);
		
		resp.getWriter().write("success");
		
	}
	
	
}
