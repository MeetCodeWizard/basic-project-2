package com.royal.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String gender = request.getParameter("gender");
		String city = request.getParameter("city");
		String[] hobbies = request.getParameterValues("hobbies");
		
		boolean isError = false;
		
		if(firstName == null || firstName.trim().length() == 0) {
			isError = true;
			request.setAttribute("firstNameError", "Please Enter First Name");
		}else {
			request.setAttribute("firstNameValue", firstName);
		}
		
		if(gender == null) {
			isError = true;
			request.setAttribute("genderError", "Please Select Gender");
		}else {
			request.setAttribute("genderValue", gender);
		}
		
		if(city.equals("-1")) {
			isError = true;
			request.setAttribute("cityError", "Please Select City");
		}else {
			request.setAttribute("cityValue", city);
		}
		
		if(hobbies == null) {
			isError = true;
			request.setAttribute("hobbyError", "Please Select any one Hobby");
		}else {
			request.setAttribute("hobbyValues", hobbies);
		}
		
		if(isError) {
			RequestDispatcher rd = request.getRequestDispatcher("Registration.jsp");
			rd.forward(request, response);
		}else {
			request.setAttribute("firstName", firstName);
			RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
			rd.forward(request, response);
		}
	}
}
