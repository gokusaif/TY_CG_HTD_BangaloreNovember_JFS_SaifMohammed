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
    <%if(msg!=null && !msg.isEmpty()) { %>
		<%= msg %> 
		<% } %>
  <fieldset>
		<legend>Insert employee details</legend>
		<form action="./insertEmployee" method="post">
			EmployeeId : <input type="number" name="empId" required> <br>
			EmployeeName : <input type="text" name="name" required> <br>
			EmployeeSalary : <input type="number" name="salary" required> <br>
			EmployeeAge : <input type="number" name="age" required> <br>
			EmployeeDesignation : <input type="text" name="designation" required> <br>
			EmployeePassword : <input type="password" name="password" required>
			<br> <input type="submit" value="Add">
		</form>
	</fieldset>
	<a href="./homePage">Home</a>
</body>
</html>