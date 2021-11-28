<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addEmploy">
		<input type="text" name="eid"> <input type="text" name="ename">
		<input type="text" name="etech"> <input type="submit"
			value="addEmploy">
	</form>
	<form action="getDetails">
		<input type="text" name="eid"> <input type="submit"
			value="getDetails">
	</form>
	</form>
	<form action="getDetailsbyTech">
		<input type="text" name="tech"> <input type="submit"
			value="getDetails">
	</form>
</body>
</html>