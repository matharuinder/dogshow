<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body{
font-size:16pt;
text-align:center;
}
label{
padding:10px;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br><br><br>
<form action="Search" method="post">
<label>Group:</label><select name="group">
  <option value="-1">Select</option>
    <option value="Sporting Dogs">Sporting Dogs</option>
    <option value="Hounds">Hounds</option>
    <option value="Working Dogs">Working Dogs</option>
    <option value="Terriers">Terriers</option>
    <option value="Toys">Toys</option>
    <option value="Non-Sporting">Non-Sporting</option>
    <option value="Herding">Herding</option>
  </select>
  <br><br>
  <input type="submit">
</form>

</body>
</html>