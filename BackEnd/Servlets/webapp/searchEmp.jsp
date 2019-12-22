<%@page import="com.cap.webapp.beans.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<% EmployeeInfoBean bean = (EmployeeInfoBean) request.getAttribute("bean"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>Search employee</legend>
		<form action="./getEmployee" method="get">
			EmployeeId : <input type="number" name="empId" required> <br>
			<input type="submit" value="Search">
		</form>
	</fieldset>
	<br><br>
	
	<% if(bean==null) { %>
	<h3 style="color:red;">Employee ID not found</h3>
	<% } else { %>
	<h3 style="color: blue;"> Employee Details of <%= bean.getEmpId()%></h3>
	Employee Name = <%= bean.getName() %>
	 age = <%= bean.getAge() %>
	 salary = <%= bean.getSalary() %>
 designation = <%= bean.getDesignation() %> <br>
	<% } %>
	<a href="./homePage">Home</a>
</body>
</html>