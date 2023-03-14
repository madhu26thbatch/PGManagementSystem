<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>USER LOGIN PAGE</title>
</head>

<body  style="background-color:green">

<br><br>
<b><marquee  scrollamount="18"    style="color:yellow" > WELCOME TO PG MANAGEMENT SYSTEM </marquee></b>

<form action="userchek" method="post">

<div align="center"><br><br><br><br>

<input type="email" name="email" id="email"  placeholder="Enter@ Email" required><br><br>
<input type="password" name="psw" id="psw"  placeholder="Enter@ Password" required/><br><br>
<input type="submit" value="Login"  style="background-color:yellow" ><br><br>
</div>


</form> 

<form action="AregP" method="post">
<div align="center" >
<input type="submit" value="Registration"  style="background-color:pink"></div>
</form> 



</body>

</html>