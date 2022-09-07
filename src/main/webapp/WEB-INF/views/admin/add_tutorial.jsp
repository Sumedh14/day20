<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h5>${requestScope.err_mesg}</h5>
	<form method="post" modelAttribute="tutorial">
		<table style="background-color: lightgray; margin: auto">
			<tr>
				<td>Enter Tutorial Name</td>
				<td><form:input path="tutName" /></td>
			</tr>
			<tr>
				<td>Enter Author Name</td>
				<td><form:input path="author" /></td>
			</tr>
			<tr>
				<td>Content</td>
				<td><form:textarea row="10" path="contents" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add New Tutorial" /></td>
			</tr>
			
		</table>
		</form>
</body>
</html>