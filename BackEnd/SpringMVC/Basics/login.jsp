<%@page import="com.cap.springmvc.beans.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<%
	String msg = (String) request.getAttribute("msg");
%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<%
		if (msg != null && !msg.isEmpty()) {
	%>
	<h1 style="color: red"><%=msg%></h1>
	<%
		}
	%>
	<form action="./login" method="post">
		<table>
			<tr>
				<td>User,name:</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td><input type="submit" name="login"></td>
			</tr>
		</table>

	</form>
</body>
</html>