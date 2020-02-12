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
    width: 15%;
}
.column.middle {
    width: 30%;
}
.column.right{
	width:40%
}
.row:after {
    content: "";
    display: table;
    clear: both;
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
  <h2>Welcome to Macro Dog Show</h2>
</div>

<div class="row">
  <div class="column side">
  	<input class="button" value="Register Class Dog" type="button" onclick="document.getElementById('reg').setAttribute('src','classDogForm.jsp')">
  	<br><br>
  	<input class="button" value="Register Specialty Dog" type="button" onclick="document.getElementById('reg').setAttribute('src','specDogForm.jsp')">
  	<br><br>
  	<form action="AddDummy">
  	<input class="button" value="Add Dummy Records" type="submit">
  	<br><br>
  	</form>
  	<form action="ViewAllDogs">
  	<input class="button" value="View All Dogs" type="submit">
  	<br><br>
  	</form>
  	<form action="ViewListByGroup">
  	<input class="button" value="View Dogs By Group" type="submit">
  	<br><br>
  	</form>

  </div>
  <div class="column middle">
  <iframe src="default.jsp" class="form" id="reg"></iframe>
  </div>
  <div class="column right">
  <iframe src="defaultSearch.jsp" class="form" id="sea"></iframe>
  </div>
  <div class="column right2">
  <input class="btn" value="Search by ID" type="button" onclick="document.getElementById('sea').setAttribute('src','searchById.jsp')">
  	<br><br>
  	<input class="btn" value="Search by Name" type="button" onclick="document.getElementById('sea').setAttribute('src','searchByName.jsp')">
  	<br><br>
  	<input class="btn" value="Search by Owner" type="button" onclick="document.getElementById('sea').setAttribute('src','searchByOwner.jsp')">
  	<br><br>
  	<input class="btn" value="Search by Breed" type="button" onclick="document.getElementById('sea').setAttribute('src','searchByBreed.jsp')">
  	<br><br>
  	<input class="btn" value="Search by Group" type="button" onclick="document.getElementById('sea').setAttribute('src','searchByGroup.jsp')">

  </div>
</div>


<div class="footer">
    	</div>

</body>
</html>