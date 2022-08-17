<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<h1>User Login</h1>
	<form action="http://localhost:8080/market-book/UserLogin" method="POST">
		<label>Email:</label> <input type="email" name="email"/><br/>
		<label>Password:</label> <input type="password" name="password"/><br/>
		<input type="submit" name="Submit"/>
	</form>
	
	
<a href="index.jsp">Main page</a>
<br/>
<a href="Register.jsp">New Customer?</a>
	
</body>
</html>