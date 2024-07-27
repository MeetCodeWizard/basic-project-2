package com.royal.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/UserNameSessionServlet")
public class UserNameSessionServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("userName");
		
		HttpSession session = request.getSession();
		session.setAttribute("userName", userName);
		session.setMaxInactiveInterval(5);
		response.sendRedirect("SessionHome.jsp");
//		
//		RequestDispatcher rd = request.getRequestDispatcher("SessionHome.jsp");
//		rd.forward(request, response);
	}
}
