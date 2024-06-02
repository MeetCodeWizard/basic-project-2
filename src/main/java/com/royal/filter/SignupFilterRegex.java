package com.royal.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/OddEvenServlet")
public class SignupFilterRegex implements Filter {

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("SignupFilterRegex::doFilter()");
		
		String numString = request.getParameter("num");

		boolean isError = false;

		if (numString.matches("[0-9]+") == false) {
			isError = true;
			request.setAttribute("numError", "Please Enter Valid Number");
		}

		if (isError) {
			System.out.println("Error");
			RequestDispatcher rd = request.getRequestDispatcher("OddEvenInput.jsp");
			rd.forward(request, response);
		} else {
			System.out.println("SUCCESS");
			chain.doFilter(request, response);
		}

	}

	public void init(FilterConfig filterConfig) throws ServletException {

	}

}
