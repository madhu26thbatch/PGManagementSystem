<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="java.util.*" %>
    <%@ page import="com.bean.De" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PG MANAGEMENT SYSTEM</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">PG MANAGEMENT SYSTEM</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="<%=request.getContextPath() %>/list">USERS</a>
        </li></ul></div></div></nav>
        <h1 STYLE="COLOR:blue" align="center">PG MANAGEMENT SYSTEM</h1><hr>
        <div class="container">
        <a href="<%=request.getContextPath()%>/add" class="btn btn-success">ADD DETAILS</a>
        </div><br><br>
        <table class="table table-striped">
        <thead>
        <tr>
       <th>ID</th>
       <th>NAME</th>
       <TH>EMAIL</TH>
       <TH>MOBILE</TH>
       <th>ACTION</th>
       </tr>
       </thead>
        <tbody>
        <%ArrayList<De> u= (ArrayList<De>) request.getAttribute("display"); %>

<%	for(De a:u)
	{
		
	%>
	<tr>
	<td><%=a.getId() %></td>
	<td><%=a.getName() %></td>
	<td><%=a.getEmail() %></td>
	<td><%=a.getMobile()%></td>
	<td><a href="<%=request.getContextPath()%>/delete?id=<%=a.getId()%>">Delete</a>&nbsp;&nbsp;<a href="<%=request.getContextPath()%>/edit?id=<%=a.getId()%>">EDIT</a></td>
	</tr>
	<%
	}
	%>
  </tbody>
       </table>
</body>
</html>