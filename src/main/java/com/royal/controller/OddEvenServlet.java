package com.royal.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/OddEvenServlet")
public class OddEvenServlet extends HttpServlet {
	
	public void init() throws ServletException {
		System.out.println("OddEvenServlet::init()");
	}
	
	public void destroy() {
		System.out.println("OddEvenServlet::destroy()");
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String numString = request.getParameter("num");
		int number = Integer.valueOf(numString);
		
		if(number%2 == 0) {
			request.setAttribute("msg", "EVEN");
		}else {
			request.setAttribute("msg", "ODD");
		}
		
		request.setAttribute("number", number);
		
		RequestDispatcher rd = request.getRequestDispatcher("OddEvenOutput.jsp");
		rd.forward(request, response);
	}
}
