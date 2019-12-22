<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false" %>
<%String msg = (String) request.getAttribute("msg"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>
    <%if(msg!=null && !msg.isEmpty()) { %>
		<%= msg %> 
		<% } %>
	<fieldset>
		<legend> Employee Login </legend>
		<form action="./login2" method="post">
			<table>
				<tr>
					<td>Id :</td>
					<td><input type="number" name="empId" required></td>
				</tr>
				<tr>
					<td>Password :</td>
					<td><input type="password" name="password" required></td>
				</tr>
				<tr>
					<td colspan="3" align="center"><br> <input type="submit"
						value="login"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>