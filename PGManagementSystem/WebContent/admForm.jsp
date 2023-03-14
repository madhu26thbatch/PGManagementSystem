<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADMIN FORM</title>
</head>
<body style="background-color:green">
<form action="insertR" method="post">
<div align="center">
 <br>
 <br>
 <br>

<input type="text" name="Rname" placeholder="Eter@Name" required><br><br>
<input type="email" name="Remail" id="Remail"   placeholder="Enter@ EmailId" required/><br><br>
<input type="password" name="Rpsw" id="Rpsw"     placeholder="Enter@ Password" required/><br><br>
<input type="text" name="Rnumber" placeholder="Enter@ Mobile Number" required/><br><br>
<input type="submit" >
</div>
</form> 
</body>
</html>