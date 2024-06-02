<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String numberString = (String) request.getAttribute("numberString");
	String targetNum = (String) request.getAttribute("targetNum");
	String ansString = (String) request.getAttribute("ansString");
	%>

	<h1>
		Input Numbers :
		<%=numberString%><br> Target :
		<%=targetNum%><br> Index :
		<%=ansString%>
	</h1>
</body>
</html>