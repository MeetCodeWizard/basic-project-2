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
	String firstName = (String) request.getAttribute("firstName");
	String gender = (String) request.getAttribute("gender");
	int age = Integer.parseInt((String)request.getAttribute("age"));
	
	boolean isEligible = false;
	
	if(gender.equals("male") && age > 18){
		isEligible = true;
	}else if(gender.equals("male") && age > 21){
		isEligible = true;
	}
	%>

	<div class="container">
		<div class="row">
			<%=isEligible ? "You are Eligible to Vote" : "You are not Eligible to Vote" %>
		</div>
	</div>
</body>
</html>