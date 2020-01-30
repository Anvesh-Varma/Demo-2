<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2 align="center" style="color:BlueViolet">!!! Resource Report !!!</h2>

<br>

<table align="center" border="2">
<tr><th style="color:maroon">Resource Id</th><th style="color:maroon">Resource Name</th><th style="color:maroon">Resource Skill</th><th style="color:maroon">Date Of Joining</th></tr>
<c:forEach var="e" items="${resourceBean}">
<tr>
	<td>${e.resourceId}</td>
	<td>${e.resourceName}</td>
	<td>${e.resourceSkill}</td>
	<td>${e.dateOfJoining}</td>
			</tr></c:forEach>
</table>
<br><br>
<center>
<a href="index.jsp">Home</a>
</center>
</body>
</html>