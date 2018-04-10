<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All Vehicles</title>
</head>
<body>
	<c:forEach items="${all}" var="item">
		<table>
			<tr>
				<td>Make</td>
				<td>${item.make}</td>
			</tr>
			<tr>
				<td>Model</td>
				<td>${item.model}</td>
			</tr>
			<tr>
				<td>Description</td>
				<td>${item.description}</td>
			</tr>
			<tr>
				<td>Year</td>
				<td>${item.year}</td>
			</tr>
			<tr>
				<td>MPG</td>
				<td>${item.mpg}</td>
			</tr>
		</table>
		<br />
		<hr style="text-align: left; margin-left: 0; width: 25%">
		<br />
	</c:forEach>
	<a href="form.mvc">Add a vehicle</a>
</body>
</html>