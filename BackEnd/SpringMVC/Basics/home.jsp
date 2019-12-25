<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:useBean id="user" class="com.cap.springmvc.beans.User"
	scope="session" />
	<%
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
	<h1 style="color: blue"><%=msg%></h1>
	<%
		}
	%>
<h1> Welcome <%= user.getName() %></h1>
<h1><a href="./logout">Logout</a></h1>
</body>
</html>
