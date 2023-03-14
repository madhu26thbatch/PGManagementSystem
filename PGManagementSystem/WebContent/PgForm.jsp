<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.bean.De"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
          <a class="nav-link active" aria-current="page" href="<%=request.getContextPath()%>/list">USERS</a>
        </li></ul></div></div></nav>
      
     <c:if test="${lis==null}"> 
 <form action="insert" method="post">
 </c:if>      
 <c:if test="${lis!=null}"> 
 <form action="update" method="post">
 </c:if>
 <h2 align="center">
  <c:if test="${lis==null}">
 ADD DATA
</c:if>
 <c:if test="${lis!=null}">
 EDIT DATA
 </c:if>
 </h2>

        <center>
        <div class="mb-3 container">
  
  <input type="hidden" class="form-control" value="${lis.id}" placeholder="enter@Name"  name="id" style="width:300px" >
</div>
        <div class="mb-3 container">
  <label for="exampleFormControlInput1" class="form-label">NAME</label>
  <input type="TEXT" class="form-control" value="${lis.name}" placeholder="enter@Name"  name="name" style="width:300px" >
</div>
<div class="mb-3 container">
  <label for="exampleFormControlInput1" class="form-label">EMAIL</label>
  <input type="email" class="form-control" id="email" value="${lis.email}" placeholder="enter@Email"  name="email" style="width:300px" >
</div>
<div class="mb-3 container">
  <label for="exampleFormControlInput1" class="form-label">MOBILE</label>
  <input type="TEXT" class="form-control" id="mobile" value="${lis.mobile}"   placeholder="Enter@ Mobile" name="mobile" style="width:300px" >
</div>
<div>
<input type="submit" value="save" class="btn btn-success" style="width:200px"/>
</div>
</center>
</form>

</body>
</html>