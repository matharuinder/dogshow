<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ page import="ca.sheridancollege.Beans.ShowList" %>
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
<title>Group List</title>
</head>
<body>
<center><a href="http://localhost:8080/Inderpreet_Matharu_Assignment1/home.jsp"><h1>Home</h1></a></center>


<h3>Hounds</h3><br>
<table border="1">
	<tr>
		<th>Number</th><th>Breed</th><th>Male Class</th><th>Female Class</th><th>Male Specialty</th><th>Female Specialty</th>
	</tr>
	
	<a:ViewGroup list="${hlist }"/>
	
</table><br><br>
<h3>Sporting Dogs</h3><br>
<table border="1">
	<tr>
		<th>Number</th><th>Breed</th><th>Male Class</th><th>Female Class</th><th>Male Specialty</th><th>Female Specialty</th>
	</tr>
	
	<a:ViewGroup list="${slist }"/>
	
</table><br><br>
<h3>Working</h3><br>
<table border="1">
	<tr>
		<th>Number</th><th>Breed</th><th>Male Class</th><th>Female Class</th><th>Male Specialty</th><th>Female Specialty</th>
	</tr>
	
	<a:ViewGroup list="${wlist }"/>
	
</table><br><br>
<h3>Terriers</h3><br>
<table border="1">
	<tr>
		<th>Number</th><th>Breed</th><th>Male Class</th><th>Female Class</th><th>Male Specialty</th><th>Female Specialty</th>
	</tr>
	
	<a:ViewGroup list="${tlist }"/>
	
</table><br><br>
<h3>Toys</h3><br>
<table border="1">
	<tr>
		<th>Number</th><th>Breed</th><th>Male Class</th><th>Female Class</th><th>Male Specialty</th><th>Female Specialty</th>
	</tr>
	
	<a:ViewGroup list="${tylist }"/>
	
</table><br><br>
<h3>Non-Sporting</h3><br>
<table border="1">
	<tr>
		<th>Number</th><th>Breed</th><th>Male Class</th><th>Female Class</th><th>Male Specialty</th><th>Female Specialty</th>
	</tr>
	
	<a:ViewGroup list="${nlist }"/>
	
</table><br><br>
<h3>Herding</h3><br>
<table border="1">
	<tr>
		<th>Number</th><th>Breed</th><th>Male Class</th><th>Female Class</th><th>Male Specialty</th><th>Female Specialty</th>
	</tr>
	
	<a:ViewGroup list="${helist }"/>
	
</table>

</body>
</html>