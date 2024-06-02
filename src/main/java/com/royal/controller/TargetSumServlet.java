package com.royal.controller;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TargetSumServlet")
public class TargetSumServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String numberString = request.getParameter("numberString");
		String[] stringArray = numberString.split(",");
		int arrayLength = stringArray.length;
		int[] numberArray = new int[arrayLength];

		for (int i = 0; i < arrayLength; i++) {
			numberArray[i] = Integer.parseInt(stringArray[i]);
		}
		String targetNum = request.getParameter("targetNum");
		int targetSum = Integer.parseInt(targetNum);

		int[] ans = getSumIndex(numberArray, targetSum);
		String ansString = "";

		for (int i : ans) {
			ansString += (i + ",");
		}

		ansString = ansString.substring(0, ansString.length() - 1);

		RequestDispatcher rd = request.getRequestDispatcher("Output.jsp");
		request.setAttribute("numberString", numberString);
		request.setAttribute("targetNum", targetNum);
		request.setAttribute("ansString", ansString);
		rd.forward(request, response);
	}

	public static int[] getSumIndex(int[] arr, int target) {

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i + 1; j < arr.length; j++) {

				sum = arr[i] + arr[j];

				if (sum == target) {
					return new int[] { i, j };
				}
			}
		}

		return new int[] { -1 };
	}
}
