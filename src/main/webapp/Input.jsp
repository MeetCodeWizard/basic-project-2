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
	<div class="container">
		<div class="row">
			<div class="col-md-3"></div>
			<div class="col-md-6">
				<form action="TargetSumServlet" method="post">
					Input : <input class="form-control" name="numberString" type="text"
						placeholder="Comma Seperated Numbers" /><br> Target : <input
						class="form-control" name="targetNum" type="text"
						placeholder="Target Sum" /><br> <input type="submit"
						class="btn btn-primary" value="Submit" />
				</form>
			</div>
			<div class="col-md-3"></div>
		</div>
	</div>
</body>
</html>