<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User registration</title>
</head>
<body>
	<h1>Registration</h1>
	<form action="http://localhost:8080/market-book/UserRegistration" method="POST">
		<label>Name:</label> <input type="text" name="name"/><br/>
		<label>Surname:</label> <input type="text" name="surname"/><br/>
		<label>Email:</label> <input type="email" name="email"/><br/>
		<label>Password:</label> <input type="password" name="password"/><br/>
		<input type="submit" name="Submit"/>
	</form>
	
	
	
	<a href="index.jsp">Main Page</a>
	<br/>
	<a href="Login.jsp">Login</a>


</body>
</html>