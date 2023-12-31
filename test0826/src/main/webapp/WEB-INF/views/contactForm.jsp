<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>|CottageStay| Contact Us</title>
<style>
#contactFormComment{
	max-height: 150px;
}
</style>
</head>
<body>
	<%@ include file="top.jsp"%>
	<section class="home-section home-full-height">
		<div id="map">
			<script type="text/javascript"
				src="//dapi.kakao.com/v2/maps/sdk.js?appkey=2937028de7c69f52dce0ef3b3b3f4e33"></script>
			<script>
				var container = document.getElementById('map');
				var options = {
					center : new kakao.maps.LatLng(37.69373, 127.6777605),
					level : 2
				};
				var map = new kakao.maps.Map(container, options);
			</script>
		</div>
	</section>
	<div class="main">
		<section class="module" id="contact">
			<div class="container">
				<div class="row">
					<div class="col-sm-6 col-sm-offset-3">
						<h2 class="module-title font-alt">Contact us</h2>
						<div class="module-subtitle font-serif"></div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-8">
						<form id="contactForm" role="form" method="post"
							action="php/contact.php">
							<div class="form-group">
								<label class="sr-only" for="name">Name</label> <input
									class="form-control" type="text" id="contactFormName" name="contactFormName"
									placeholder="Your Name*" required="required"
									data-validation-required-message="Please enter your name." pattern="[A-Za-z가-힣]+" maxlength="10" />
								<p class="help-block text-danger"></p>
							</div>
							<div class="form-group">
								<label class="sr-only" for="email">Email</label> <input
									class="form-control" type="email" id="contactFormEmail" name="contactFormEmail"
									placeholder="Your Email*" required="required"
									data-validation-required-message="Please enter your email address." pattern="[A-Za-z가-힣0-9]+@[A-Za-z가-힣0-9]+\.[A-Za-z가-힣0-9]+"
								maxlength="30"/>
								<p class="help-block text-danger"></p>
							</div>
							<div class="form-group">
								<textarea class="form-control" rows="7" id="contactFormComment"
									name="contactFormComment" placeholder="Your Message*" required="required"
									data-validation-required-message="Please enter your message." pattern="[A-Za-z가-힣0-9]+"
								maxlength="1000"></textarea>
								<p class="help-block text-danger"></p>
							</div>
							<div class="text-center">
								<button class="btn btn-block btn-round btn-d" id="cfsubmit"
									type="submit">Submit</button>
							</div>
						</form>
						<div class="ajax-response font-alt" id="contactFormResponse"></div>
					</div>
					<div class="col-sm-4">
						<div class="alt-features-item mt-0">
							<div class="alt-features-icon">
								<span class="icon-megaphone"></span>
							</div>
							<h3 class="alt-features-title font-alt">Where to meet</h3>
							Cabin Stay<br />23 Greate Street<br />Los Angeles, 12345 LS
						</div>
						<div class="alt-features-item mt-xs-60">
							<div class="alt-features-icon">
								<span class="icon-map"></span>
							</div>
							<h3 class="alt-features-title font-alt">Say Hello</h3>
							Email: cabinstay@naver.com<br />Phone: 02-1000-1000<br />Business
							Hours : Mon - Sun 8am to 8pm
						</div>
					</div>
				</div>
			</div>
		</section>
	</div>
	<%@ include file="footer.jsp"%>
</body>
</html>