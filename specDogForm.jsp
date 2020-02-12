<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
label{
padding:10px;
}.form{
float:left;
margin-left:200px;
}
</style>
<title>Macro Inc.</title>
</head>
<body>
<center><h1>Specialty Dog</h1></center>
<br><div class="form">
<form action="../DHandS" method="post">
	<label>Name:</label> <input type="text" name="name"><br>
	<label>Owner's Name:</label> <input type="text" name="owner"><br>
	<label>Breed:</label> <input type="text" name="breed"><br>
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
  <br><label>Gender:</label>
  <input type="radio" name="gender" value="Male" checked>Male
  <input type="radio" name="gender" value="Female">Female
  <br><br>
  <center><input type="submit" /></center>
</form>
</div>
</body>
</html>