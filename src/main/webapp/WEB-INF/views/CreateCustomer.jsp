<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="CreateCustomer" method="post" modelAttribute="customer">


<table align="center" border="2">
<h2 align="center" style="color:blue">!!! Save Report !!!</h2>
<tr>
<th style="color:maroon">Resource Name</th>
<td><form:input type="text" path="resourceName"></form:input></td></tr>
<tr>
<th style="color:maroon">Skill</th>
<td>
<form:select path="resourceSkill">
<form:option value="JAVA">JAVA</form:option>
<form:option value="DOT NET">Dot Net</form:option>
<form:option value="SAP">SAP</form:option>
<form:option value="SFDC">SFDC</form:option>
</form:select>
</td></tr>

<tr style="">
<th style="color:maroon">Date Of Joining[dd-MMM-yyyy]</th>
<td><form:input type="text" path="dateOfJoining"/></td>
</tr>
<tr>
<td align="center">
<input type="submit" value="save"></td>
</tr>
</table><br><br>
<center>
<a href="index.jsp">Home</a>
</center>

</form:form>

</body>
</html>