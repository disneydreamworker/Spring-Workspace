<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reservation Form</title>
</head>
<body>
	<%@ include file="top.jsp"%>

	<!-- Background image -->
	<div class="bg-image d-flex justify-content-center align-items-center"
		style="
	    background-image: url('${pageContext.request.contextPath}/resources/assets/banner/banner4.jpg');
	    height: 50vh;
	  ">
		<h1 class="text-white">Reservation</h1>
	</div>
	<!-- Background image -->


	<div class="container">
		<h2>Reservation Form</h2>
		<form>
			<div class="form-group">
				<div class="row">
					<div class="col">
						<label for="exampleFormControlInput1">예약자 이름</label> <input
							type="text" class="form-control" placeholder="First name"
							required>
					</div>
					<div class="col">
						<label for="exampleFormControlInput1">예약자 성</label> <input
							type="text" class="form-control" placeholder="Last name" required>
					</div>
				</div>
			</div>
			<div class="form-group">
				<label for="exampleFormControlInput1">Email address</label> <input
					type="email" class="form-control" id="exampleFormControlInput1"
					placeholder="name@example.com" required>
			</div>
			<div class="form-group">
				<label for="exampleFormControlSelect1">Example select</label> <select
					class="form-control" id="exampleFormControlSelect1" required>
					<option>Room 1</option>
					<option>Room 2</option>
					<option>Room 3</option>
				</select>
			</div>
			<div class="form-group">
				<label for="exampleFormControlTextarea1">남기실 말</label>
				<textarea class="form-control" id="exampleFormControlTextarea1"
					rows="3"></textarea>
			</div>



			<hr class="mb-4">
			<button class="btn btn-primary btn-lg btn-block" type="submit">Continue
				to checkout</button>

		</form>
	</div>


</body>
</html>