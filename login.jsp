<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>h1   {color: blue;}</style>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<center><h1>Login Page</h1> </center><br>
<form action="j_security_check" method="post" class="w3-container">
	<center>Username: <input type="text" name="j_username" class="w3-container">
	Password: <input type="password" name="j_password" class="w3-container"></center>
	<br><br><center>
	<input type="submit" value="Login"></center>
</form>
</body>
</html>