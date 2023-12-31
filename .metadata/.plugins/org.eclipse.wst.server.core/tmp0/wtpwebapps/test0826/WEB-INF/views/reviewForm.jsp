<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>|CottageStay| Reviews</title>
<style>
    #reviewText {
        max-height: 150px;
    }
</style>

</head>
<body>
	<%@ include file="top.jsp"%>
	<section class="module-small">
		<div class="container">
			<div class="row">
				<div class="comment-form">
					<h4 class="comment-form-title font-alt">Add your review</h4>
					
					<form method="post">
						<div class="form-group">
							<label class="sr-only" for="reservationId">Reservation Id</label>
							<input class="form-control" id="reservationId" type="text"
								name="reservationId" placeholder="Reservation Id" required
								pattern="[0-9]+" maxlength="10" />
						</div>
						<div class="form-group">
							<label class="sr-only" for="email">Email</label> <input
								class="form-control" id="reviewEmail" type="text"
								name="reviewEmail" placeholder="E-mail" required
								pattern="[A-Za-z가-힣0-9]+@[A-Za-z가-힣0-9]+\.[A-Za-z가-힣0-9]+"
								maxlength="30" />
						</div>
						<div class="form-group">
							<textarea class="form-control" id="reviewText" name="reviewText"
								placeholder="Review" required pattern="[A-Za-z가-힣0-9]+"
								maxlength="1000"></textarea>
						</div>
						<button class="btn btn-round btn-d" type="submit">Post
							review</button>
					</form>
				</div>
			</div>
		</div>
	</section>
	<%@ include file="footer.jsp"%>
	
</body>
</html>