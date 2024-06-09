package com.royal.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("userName");
		String password = request.getParameter("password");
		
		if(password.equals("admin")) {
			Cookie cookie = new Cookie("userName", username);
			response.addCookie(cookie);
			
			response.sendRedirect("CookieHome.jsp");
		}else {
			response.sendRedirect("CookieLogin.jsp");
		}
	}
}
