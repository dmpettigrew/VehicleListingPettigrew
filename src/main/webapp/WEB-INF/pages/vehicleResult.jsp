<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri = "http://www.springframework.org/tags/form" prefix="mvc" %>
 <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC From Handling</title>
</head>
<body> <h2>Vehicle List Result</h2>
    <table>
        <tr>
            <td>Make</td>
            <td>${v.make}</td>
        </tr>
        <tr>
            <td>Model</td>
            <td>${v.model}</td>
        </tr>
        <tr>
            <td>Description</td>
            <td>${v.description}</td>
        </tr>
        <tr>
            <td>Year</td>
            <td>${v.year}</td>
        </tr>
        <tr>
            <td>MPG</td>
            <td>${v.mpg}</td>
        </tr>
        </table>
<a href = "viewAll.mvc">View all Vehicles</a>
</body>
</html>