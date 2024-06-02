package com.royal.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/VotingServlet")
public class VotingServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String gender = request.getParameter("gender");
		String age = request.getParameter("age");
		
		String numRegex = "[0-9]+";
		
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
		
		if(age == null) {
			isError = true;
			request.setAttribute("ageError", "Please Enter Age");
		}else if(!age.matches(numRegex)) {
			isError = true;
			request.setAttribute("validAgeError", "Please Enter Valid Age");
		}
		else {
			request.setAttribute("ageValue", age);
		}
		
		if(isError) {
			RequestDispatcher rd = request.getRequestDispatcher("Voting.jsp");
			rd.forward(request, response);
		}else {
			request.setAttribute("firstName", firstName);
			request.setAttribute("gender", gender);
			request.setAttribute("age", age);
			RequestDispatcher rd = request.getRequestDispatcher("Eligibility.jsp");
			rd.forward(request, response);
		}
	}
}
