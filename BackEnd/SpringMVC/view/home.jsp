<%@page import="com.cap.empspringmvc.beans.EmployeeBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:useBean id="bean" class="com.cap.empspringmvc.beans.EmployeeBean"
	scope="session" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./changepassword">Change password</a>
	<a href="./logout" style="float: right;">Logout</a>
	<h2>
		Welcome
		<%=bean.getName()%></h2>

	<form action="./search">
		<table>
			<tr>
				<td>Enter key:</td>
				<td><input type="text" name="key"></td>
				<td><input type="submit" value="Search"></td>
			</tr>
		</table>
	</form>
	
	<%
		List<EmployeeBean> list = (List<EmployeeBean>) request.getAttribute("list");
	%>
	<%
		if (list != null) {
	%>
	<%
		if (list.isEmpty()) {
	%>
	<h3>No data</h3>
	<%
		} else {
	%>
	<h2>List of Employees</h2>
	<table>
		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Email</td>
		</tr>
		<%
			for (EmployeeBean employee : list) {
		%>
        <tr>
        <td> <%= employee.getEid() %></td>
        <td> <%= employee.getName() %></td>
        <td> <%= employee.getEmail() %></td>
        </tr>
		<%
			}
		%>
	</table>
	<%
		}
		}
	%>
</body>
</html>