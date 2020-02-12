<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ page import="ca.sheridancollege.Beans.Dog" %>
    <%@ taglib uri="/WEB-INF/mytaglib.tld" prefix="a" %>
<!DOCTYPE html>
<html>
<head>
<style>
table {
    border-collapse: collapse;
    width: 100%;
}

th, td {
    text-align: left;
    padding: 8px;
}

tr:nth-child(even){background-color: #f2f2f2}

th {
    background-color: #4CAF50;
    color: white;
}
</style>
<meta charset="ISO-8859-1">
<title>Search Results</title>
</head>
<body>

<center><a href="http://localhost:8080/Inderpreet_Matharu_Assignment1/dogHandlers/index"><h1>Home</h1></a> <span><a href="http://localhost:8080/Inderpreet_Matharu_Assignment1/Logout"><h1>Logout</h1></a></span></center>



<table border="1">
	<tr>
		<th>ID</th><th>Name</th><th>Owner Name</th><th>Breed</th><th>Group</th><th>Gender</th><th>Type</th><th>Days</th>
	</tr>
	
	<a:View list="${list}"/>
	
</table>

</body>
</html>