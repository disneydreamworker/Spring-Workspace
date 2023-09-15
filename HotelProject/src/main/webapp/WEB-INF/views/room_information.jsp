<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Room Information</title>
</head>
<body>
<%@ include file="top.jsp"%>

<div class="card-deck">
  <div class="card">
    <img src="${pageContext.request.contextPath}/resources/assets/roomInfo/room1.jfif" class="card-img-top" alt="...">
    <div class="card-body">
      <h5 class="card-title">#1</h5>
      <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
      <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>
    </div>
  </div>
  <div class="card">
    <img src="${pageContext.request.contextPath}/resources/assets/roomInfo/room2.jpg" class="card-img-top" alt="...">
    <div class="card-body">
      <h5 class="card-title">#2</h5>
      <p class="card-text">This card has supporting text below as a natural lead-in to additional content.</p>
      <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>
    </div>
  </div>
  <div class="card">
    <img src="${pageContext.request.contextPath}/resources/assets/roomInfo/51.jfif" class="card-img-top" alt="...">
    <div class="card-body">
      <h5 class="card-title">#3</h5>
      <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This card has even longer content than the first to show that equal height action.</p>
      <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>
    </div>
  </div>
</div>

<div style="height: 50px;"></div>


 <div class="container">
  <div class="py-5 text-center">
    <img class="d-block mx-auto mb-4" src="${pageContext.request.contextPath}/resources/assets/logo/7-1.png" alt="" width="72" height="72">
    <h2>Reserve Now</h2>
    <p class="lead">Below is an example form built entirely with Bootstrap’s form controls. Each required form group has a validation state that can be triggered by attempting to submit the form without completing it.</p>
  	<a href="#" class="btn btn-primary">Go Booking</a>
  </div>
 </div>
  
</body>
</html>