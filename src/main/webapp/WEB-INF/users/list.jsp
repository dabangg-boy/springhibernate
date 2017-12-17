<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>All Employees</title>
<!-- CSS  -->
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <link href="../css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
  <link href="../css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>
</head>
<body>
<h3>List Employees</h3>
<h5><a href="add">Add More Employee</a></h5>

<c:if test="${!empty users}">
	<table align="left" class="highlight">
		<thead>
		<tr>
			<th>ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>DOB</th>
			<th>Email</th>
			<th>Edit</th>
			<th>Delete</th>
			</tr>
		</thead>

		<c:forEach items="${users}" var="user">
			<tr>
				<td><c:out value="${user.userid}"/></td>
				<td><c:out value="${user.firstname}"/></td>
				<td><c:out value="${user.lastname}"/></td>
				<td><c:out value="${user.dob}"/></td>
				<td><c:out value="${user.email}"/></td>
				<td><a href="<c:url value='/edit/${user.userid}' />" >Edit</a></td>
				<td><a href="<c:url value='/remove/${user.userid}' />">Delete</a></td> 
			</tr>
		</c:forEach>
	</table>
</c:if>
<!--  Scripts-->
  <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
  <script src="../js/materialize.js"></script>
  <script src="../js/init.js"></script>
</body>
</html>