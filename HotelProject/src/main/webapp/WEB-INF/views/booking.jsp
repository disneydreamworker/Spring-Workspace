<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Booking</title>
</head>
<body>
	<%@ include file="top.jsp"%>
	
	<!-- Background image -->
	<div
	  class="bg-image d-flex justify-content-center align-items-center"
	  style="
	    background-image: url('${pageContext.request.contextPath}/resources/assets/banner/banner4.jpg');
	    height: 50vh;
	  "
	>
	  <h1 class="text-white">Reservation</h1>
	</div>
	<!-- Background image -->



	<!-- table starts -->
<div class="container">
	<table class="table">
	  <thead>
	    <tr>
	      <th scope="col">#</th>
	      <th scope="col">First</th>
	      <th scope="col">Last</th>
	      <th scope="col">Handle</th>
	    </tr>
	  </thead>
	  <tbody>
	    <tr>
	      <th scope="row">1</th>
	      <td>Mark</td>
	      <td>Otto</td>
	      <td>@mdo</td>
	    </tr>
	    <tr>
	      <th scope="row">2</th>
	      <td>Jacob</td>
	      <td>Thornton</td>
	      <td>@fat</td>
	    </tr>
	    <tr>
	      <th scope="row">3</th>
	      <td>Larry</td>
	      <td>the Bird</td>
	      <td>@twitter</td>
	    </tr>
	  </tbody>
	</table>
	
	
	<a href="${pageContext.request.contextPath}/booking_new">
	<button type="button" class="btn btn-outline-dark">Reserve Now</button> <!-- 누르면 예약 입력 폼 페이지로 이동 -->
	</a>
</div>


</body>
</html>