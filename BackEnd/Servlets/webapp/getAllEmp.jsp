<%@page import="java.util.List"%>
<%@page import="com.cap.webapp.beans.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>

<%
	List<EmployeeInfoBean> l1 = (List<EmployeeInfoBean>) request.getAttribute("all");
	String msg = (String) request.getAttribute("msg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		if (msg != null && !msg.isEmpty()) {
	%>
	<h2> <%=msg%> </h2>	<br>
	<%
		}
	%>
	<br>
	<%
		if (l1 != null) {
	%>
	<table style="border: 2px solid black">
		<tr>
			<th>Emp Id</th>
			<th>Name</th>
			<th>Age</th>
			<th>Salary</th>
			<th>Designation</th>
		</tr>
		<%
			for (EmployeeInfoBean bean : l1) {
		%>
		<tr>
			<td><%=bean.getEmpId()%></td>
			<td><%=bean.getName()%></td>
			<td><%=bean.getAge()%></td>
			<td><%=bean.getSalary()%></td>
			<td><%=bean.getDesignation()%></td>
		</tr>
		<%
			}
		%>
	</table> <br>
	<%
		}
	%>
	<a href="./homePage.jsp">Home</a>
</body>
</html>