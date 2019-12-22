<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page session="false" %>
    <%String msg = (String) request.getAttribute("msg"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
		<legend>Delete employee</legend>
		<form action="./deleteEmp1" method="get">
			EmployeeId : <input type="number" name="empId" required> <br>
			<input type="submit" value="Delete">
		</form>
	</fieldset>
	   <%if(msg!=null && !msg.isEmpty()) { %>
		<%= msg %> 
		<% } %> <br>
		<a href="./homePage">Home</a>
</body>
</html>