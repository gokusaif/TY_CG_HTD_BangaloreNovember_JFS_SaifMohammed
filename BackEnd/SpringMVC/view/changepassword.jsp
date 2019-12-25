<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./home">Home</a>
	<a href="./logout" style="float: right;">Logout</a>
	<form action="./changepassword" method="post">
		Enter new password: <input type="password" name="password"> <input
			type="submit" value="ChangePassword">
	</form>
</body>
</html>