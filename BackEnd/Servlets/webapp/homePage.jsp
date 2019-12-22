<%@page import="com.cap.webapp.beans.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<%
	HttpSession session = request.getSession(false);
	EmployeeInfoBean bean = (EmployeeInfoBean) session.getAttribute("bean");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage</title>
</head>
<body>
	<h3 style="color: blue;">
		Welcome
		<%=bean.getName()%>
	</h3>
	<a href="./insertEmployeeJsp">Add Employee</a>
	<br>
	<a href="./update">Update Employee</a>
	<br>
	<a href="./deleteEmp.jsp">Delete Employee</a>
	<br>
	<a href="./searchEmpJsp">Search Employee</a>
	<br>
	<a href="./getAll">See All Employee</a>
	<br>
	<br>
	<a href="./logout2">Logout</a>
</body>
</html>