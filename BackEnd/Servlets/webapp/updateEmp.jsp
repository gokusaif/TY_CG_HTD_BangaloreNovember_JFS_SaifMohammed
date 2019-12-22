<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<% String msg= (String) request.getAttribute("msg"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>
	</h3>
	<%if(msg!=null && !msg.isEmpty()) { %>
	<%= msg %>
	<% } %>
	<fieldset>
		<legend>Insert employee details</legend>
		<form action="./updateEmployee2" method="post">
			EmployeeId : <input type="number" name="empId" required> <br>
			EmployeeName : <input type="text" name="name"> <br>
			EmployeeSalary : <input type="number" name="salary"> <br>
			EmployeeAge : <input type="number" name="age"> <br>
			EmployeeDesignation : <input type="text" name="designation">
			<br> EmployeePassword : <input type="password" name="password">
			<br> <input type="submit" value="Update">
		</form>
	</fieldset>

		<a href="./homePage">Home</a>

</body>
</html>