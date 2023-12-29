<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.util.ArrayList"%>
<%@ include file="sumnumber.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--  Declarative Tag-->
	<%!String str = "Hello world";%>

	<!-- Scripted tag -->
	<%
	List<String> al = new ArrayList();
	al.add("Name: ");
	%>

	<!-- Scripted Tag -->

	<%
	for (int i = 0; i <= 4; i++) {
	%>

	<!-- Expression Tag -->
	<h1>
		<%=str%></h1>
		<%= sum() %>
	
	<%}%>

	<%
	for (String s : al) {
	%>
	<h1><%=s%></h1>
	<%
	}
	%>



</body>
</html>