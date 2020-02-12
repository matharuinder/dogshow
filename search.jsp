<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ page import="ca.sheridancollege.Beans.Dog" %>
    <%@ taglib uri="/WEB-INF/mytaglib.tld" prefix="a" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Results</title>
</head>
<body>


<table border="1">
	<tr>
		<th>ID</th><th>Name</th><th>Owner Name</th><th>Breed</th><th>Group</th><th>Gender</th><th>Type</th><th>Days</th>
	</tr>
	
	<a:View list="${list }"/>
	
</table>

</body>
</html>