<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<meta name="viewport" content="width=device-width, initial-scale=1">

</head>
<body>

	<%
	String firstNameError = (String) request.getAttribute("firstNameError");
	String genderError = (String) request.getAttribute("genderError");
	String ageError = (String) request.getAttribute("ageError");
	String validAgeError = (String) request.getAttribute("validAgeError");

	String firstNameValue = (String) request.getAttribute("firstNameValue");
	String genderValue = (String) request.getAttribute("genderValue");
	String ageValue = (String) request.getAttribute("ageValue");
	%>

	<div class="container">
		<div class="row">
			<div class="col-md-3"></div>

			<div class="col-md-6">
				<h2>Registration</h2>
				<form action="VotingServlet" method="post">
					First Name : <input type="text" name="firstName"
						class="form-control"
						value="<%=firstNameValue == null ? "" : firstNameValue%>" /><span
						class="text-danger"><%=firstNameError == null ? "" : (firstNameError + "<br>") %></span>
					<br> Gender : Male <input type="radio" value="male"
						<%=genderValue != null && genderValue.equals("male") ? "checked" : ""%>
						class="form-check-input" name="gender" /> Female <input
						type="radio" class="form-check-input" name="gender" value="female"
						<%=genderValue != null && genderValue.equals("female") ? "checked" : ""%> /><span
						class="text-danger"><br><%=genderError == null ? "" : (genderError + "<br>") %></span>
					<br> Age : <input type="text" name="age" class="form-control"
						value="<%=ageValue == null ? "" : ageValue%>"><span
						class="text-danger"><%=ageError == null ? "" : (ageError + "<br>") %></span><span
						class="text-danger"><%=validAgeError == null ? "" : validAgeError + "<br>"%></span>
					<br><input type="submit" value="Submit" class="btn btn-primary" /> <input
						type="button" value="Cancel" class="btn btn-danger" />
				</form>
			</div>

			<div class="col-md-3"></div>
		</div>

	</div>

</body>
</html>