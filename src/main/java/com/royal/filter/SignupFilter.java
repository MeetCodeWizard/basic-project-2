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

@WebFilter(urlPatterns = {"/OddEvenServlet", "/ServletLifeCycle"})
public class SignupFilter implements Filter{

	public void destroy() {
		System.out.println("SignupFilter::destroy()");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("SignupFilter::doFilter()");
		
		String numString = request.getParameter("num");
		
		boolean isError = false;
		
		if(numString == null || numString.trim().length() == 0) {
			isError = true;
			request.setAttribute("numError", "Please Enter Number");
		}
		
		if(isError) {
			System.out.println("Error");
			RequestDispatcher rd = request.getRequestDispatcher("OddEvenInput.jsp");
			rd.forward(request, response);
		}else {
			System.out.println("SUCCESS");
			chain.doFilter(request, response);
		}
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("SignupFilter::init()");
	}

}
