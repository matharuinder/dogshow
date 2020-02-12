<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
label{
padding:10px;
}
div{
float:left;
margin-left:50px;
}
</style>
<meta charset="ISO-8859-1">
<title>Select Days</title>
</head>
<body>
<h1>Select Days to Show your Dog</h1><br><div>
<form action="SelectDays" method="post">
	
	<label>January 4th, Friday:</label> <input type="checkbox" name="fri" values="Friday"><br>
	<label>January 5th, Saturday:</label> <input type="checkbox" name="sat" values="Saturday"><br>
	<label>January 6th, Sunday:</label> <input type="checkbox" name="sun" values="Sunday"><br>
	<input type="submit">
</form></div>

</body>
</html>