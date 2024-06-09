<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${cookie.userName == null}">
		<c:redirect url="CookieLogin.jsp"></c:redirect>
	</c:if>
	
	<h2>Cookie Home</h2>
	Welcome, ${cookie.userName.value}
	
</body>
</html>