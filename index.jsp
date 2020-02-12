<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Macro Inc.</title>
<meta charset="ISO-8859-1">
<style>
* {
    box-sizing: border-box;
}

body {
    font-family: Arial, Helvetica, sans-serif;
}

.header {
    background-color: #f1f1f1;
    padding: 10px;
    text-align: center;
}

.column {
    float: left;
    padding: 10px;
    height:300px;
}
.column.side {
    width: 30%;
    align:center;
}
.column.middle {
    width: 60%;
}

.footer {
    background-color: #f1f1f1;
    padding: 10px;
    text-align: center;
}

@media (max-width: 600px) {
    .column.side, .column.middle {
        width: 100%;
    }
}

.logo {
	width:70px;
	height:70px;
}
.form{
	height:300px;
	width:100%;
}
.button {
    background-color: white; /* Green */
    border: 2px solid #4CAF50;
    color: black;
    padding: 10px 20px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 12px;
}
.button:hover {
    box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);
}
.btn:hover {
    box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);
}
.row{
	height:360px;
}
.btn{
background-color: white; /* Green */
    border: 2px solid #4CAF50;
    color: black;
    padding: 10px 20px;
    text-align: center;
    text-decoration: none;
    display: inline;
    font-size: 12px;
}
</style>
</head>
<body>

<div class="header"><a href="http://localhost:8080/Inderpreet_Matharu_Assignment1/">
<img class="logo" alt="Logo" src="logo.jpg"></a>
  <h2>Welcome Dog Handler</h2>
</div><br><br>
<div class="row">
  <div class="column side">
  	<input class="button" value="Register Class Dog" type="button" onclick="document.getElementById('reg').setAttribute('src','cdf')">
  	<br><br>
  	<input class="button" value="Register Specialty Dog" type="button" onclick="document.getElementById('reg').setAttribute('src','sdf')">
  	<br><br>
  	<form action="viewAll">
  	<input class="button" value="View All Dogs" type="submit">
  	<br><br>
  	<a href="http://localhost:8080/Inderpreet_Matharu_Assignment1/Logout"><h1>Logout</h1></a>
  	</form>

  </div>
  <div class="column middle">
  <iframe src="df" class="form" id="reg"></iframe>
  </div>



</body>
</html>