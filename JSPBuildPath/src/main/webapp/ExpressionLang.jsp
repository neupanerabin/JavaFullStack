<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	StringBuilder name = new StringBuilder("Hello World");
	session.setAttribute("name", "java");
	request.setAttribute("owner", "Java");
	out.print("My name is name");
	%>

	<a href="NextPage.jsp">Next Page</a>
	<h1><%=request.getAttribute("owner")%></h1>

	<c:out value="${session.name }"></c:out>
	<c:if test="10>5">
		<c:out value="trueeeeeeeeeeeeeee!!!">true</c:out>
	</c:if>

	<form action="NextPage.jsp" method="get">
		<label> Name: </label> <input type="text" name="value"> <input
			type="submit">
	</form>
</body>
</html>