<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>|CottageStay| Welcome home</title>

</head>
<body data-spy="scroll" data-target=".onpage-navigation"
	data-offset="60" style="background-color: white;">
	<main>
		<nav>
			<%@ include file="top.jsp"%>
		</nav>
		<section class="home-section home-full-height bg-dark-30" id="home">
			<div class="video-player"
				data-property="{videoURL:'https://www.youtube.com/watch?v=HqgZnlqRrk0', containment:'.home-section', startAt:60, mute:false, autoPlay:true, loop:true, opacity:1, showControls:false, showYTLogo:false, vol:30}"></div>
			<div class="video-controls-box">
				<div class="container">
					<div class="video-controls">
						<a class="fa fa-volume-up" id="video-volume" href="#">&nbsp;</a><a
							class="fa fa-pause" id="video-play" href="#">&nbsp;</a>
					</div>
				</div>
			</div>
			<div class="titan-caption">
				<div class="caption-content">
					<div class="font-alt mb-30 titan-title-size-1">Hello &amp;
						welcome</div>
					<div class="font-alt mb-40 titan-title-size-4">Relax in
						nature</div>
					<a class="section-scroll btn btn-border-w btn-round" href="#about">Learn
						More</a>
				</div>
			</div>
		</section>


		<section class="module" id="about" style="background-color: white;">
			<div class="container">
				<div class="row">
					<div class="col-sm-6 col-sm-offset-3">
						<h2 class="module-title font-alt">자연과 하나 되는 곳, "CABIN STAY"</h2>
						<div class="module-subtitle font-serif">자연을 그대로 느낄 수 있는
							오두막에서의 여행은 잊지 못할 추억이 됩니다. 주변 경관은 아주 멋있습니다. 유명 여행 매거진에서도 소개된 저희
							오두막에서 자연을 온전히 느껴보세요.</div>
						<div class="text-center">
							<a class="btn btn-border-d btn-circle" href="#"
								style="border: 1px solid black;">Contact us : Contact 페이지로 이동</a>
						</div>
					</div>
				</div>
			</div>
		</section>


		<section class="module pt-0 pb-0">
			<div class="row position-relative m-0">
				<div class="col-xs-12 col-md-6 side-image"
					data-background="${pageContext.request.contextPath}/resources/my/img/359588.jpg"></div>
				<div class="col-xs-12 col-md-6 col-md-offset-6 side-image-text">
					<div class="row">
						<div class="col-sm-12">
							<h2 class="module-title font-alt align-left">cabin A</h2>
							<div class="module-subtitle font-serif align-left">잔잔한 호수가
								보이는 cabin A</div>
							<p>잔잔한 호수가 보이는 cabin A 입니다.</p>
							<p>성인 3 명과 아이 1 명까지 수용 가능하며 지금까지 가장 많은 분들께서 이용해주신 객실입니다.</p>
						</div>
					</div>
				</div>
			</div>
		</section>

		<section class="module" style="background-color: white;">
			<div class="container">
				<div class="row">
					<div class="col-sm-12">
						<div class="post-images-slider">
							<ul class="slides">
								<li><img class="center-block"
									src="${pageContext.request.contextPath}/resources/my/img/derevyannyi-kottedzh-v-anglii-pufikhomes-8.jpg"
									alt="Slider Image" /></li>
								<li><img class="center-block"
									src="${pageContext.request.contextPath}/resources/my/img/derevyannyi-kottedzh-v-anglii-pufikhomes-11.jpg"
									alt="Slider Image" /></li>
								<li><img class="center-block"
									src="${pageContext.request.contextPath}/resources/my/img/derevyannyi-kottedzh-v-anglii-pufikhomes-2.jpg"
									alt="Slider Image" /></li>
							</ul>
						</div>
					</div>

					<div class="col-sm-6 col-sm-offset-3">
						<h2 class="module-title font-alt">Calm and Peaceful</h2>
						<div class="module-subtitle font-serif">자유로움을 느낄 수 있는 오두막
							자연과 하나되는 경험 자유로움을 느낄 수 있는 오두막 자연과 하나되는 경험 자유로움을 느낄 수 있는 오두막 자연과
							하나되는 경험</div>
					</div>
					<div class="text-center">
						<a class="btn btn-border-d btn-circle" href="#"
							style="border: 1px solid black;">Find Out More : 예약 페이지 이동</a>
					</div>
				</div>
			</div>
		</section>
		<section class="module pt-0 pb-0">
			<div class="row position-relative m-0">
				<div class="col-xs-12 col-md-6 side-image"
					data-background="${pageContext.request.contextPath}/resources/my/img/c26483e62bea53dbb1906d3dbb6ebf37.jpg"></div>
				<div class="col-xs-12 col-md-6 col-md-offset-6 side-image-text">
					<div class="row">
						<div class="col-sm-12">
							<h2 class="module-title font-alt align-left">cabin B</h2>
							<div class="module-subtitle font-serif align-left">잔잔한 호수가
								보이는 cabin B</div>
							<p>잔잔한 호수가 보이는 cabin B 입니다.</p>
							<p>성인 3 명과 아이 1 명까지 수용 가능하며 지금까지 가장 많은 분들께서 이용해주신 오두막입니다.</p>
						</div>
					</div>
				</div>
			</div>
		</section>


		<section class="module" style="background-color: white;">
			<div class="container">
				<div class="row">
					<div class="col-sm-12">
						<div class="post-images-slider">
							<ul class="slides">
								<li><img class="center-block"
									src="${pageContext.request.contextPath}/resources/my/img/aurora-borealis-1839582_1920.jpg"
									alt="Slider Image" /></li>
								<li><img class="center-block"
									src="${pageContext.request.contextPath}/resources/my/img/olivier-guillard-FKJgBUDoVC0-unsplash.jpg"
									alt="Slider Image" /></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</section>

		<section>
			<div class="container">
				<div class="row landing-image-text">
					<div class="col-sm-6 col-sm-push-6">
						<img class="center-block"
							src="${pageContext.request.contextPath}/resources/my/img/952d3b69da8b8b8cef1de898575db9ee.jpg"
							alt="">
					</div>
					<div class="col-sm-6 col-sm-pull-6">
						<h2 class="font-alt">맑은 하늘 깨끗한 공기</h2>
						<p>가장 높은 평점과 리뷰를 받은 Cabin C입니다. 목가적인 환경으로 맑은 하늘 아래에서 깨끗한 공기를
							마셔보세요. 진정한 휴식이 될 것입니다. 예약하기 전 반드시 아래의 주의 사항을 읽어주세요. 가장 높은 평점과 리뷰를
							받은 Cabin C입니다. 목가적인 환경으로 맑은 하늘 아래에서 깨끗한 공기를 마셔보세요. 진정한 휴식이 될
							것입니다. 예약하기 전 반드시 아래의 주의 사항을 읽어주세요.</p>
						<br> <br> <br> <a
							class="btn btn-border-d btn-circle"
							style="border: 1px solid black;" href="#">find out more : 예약 페이지 이동</a>
					</div>
				</div>
			</div>


		</section>


		<section class="module pt-0 pb-0">
			<div class="row position-relative m-0">
				<div class="col-xs-12 col-md-6 side-image"
					data-background="${pageContext.request.contextPath}/resources/my/img/97077.jpg"></div>
				<div class="col-xs-12 col-md-6 col-md-offset-6 side-image-text">
					<div class="row">
						<div class="col-sm-12">
							<h2 class="module-title font-alt align-left">cabin C</h2>
							<div class="module-subtitle font-serif align-left">잔잔한 호수가
								보이는 cabin C</div>
							<p>잔잔한 호수가 보이는 cabin C 입니다.</p>
							<p>성인 3 명과 아이 1 명까지 수용 가능하며 지금까지 가장 많은 분들께서 이용해주신 오두막입니다.</p>
						</div>
					</div>
				</div>
			</div>
		</section>
		<section class="module" style="background-color: white;">
			<div class="container">
				<div class="row">
					<div class="col-sm-12">
						<div class="post-images-slider">
							<ul class="slides">
								<li><img class="center-block"
									src="${pageContext.request.contextPath}/resources/my/img/99.jfif"
									alt="Slider Image" /></li>
								<li><img class="center-block"
									src="${pageContext.request.contextPath}/resources/my/img/25.jfif"
									alt="Slider Image" /></li>
								<li><img class="center-block"
									src="${pageContext.request.contextPath}/resources/my/img/16.jfif"
									alt="Slider Image" /></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</section>
		
		<section class="module" id="services">
			<div class="container">
				<div class="row">
					<div class="col-sm-2 col-sm-offset-5">
						<div class="alt-module-subtitle">
							<span class="holder-w"></span>
							<h5 class="font-serif">For your comfort</h5>
							<span class="holder-w"></span>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-8 col-sm-offset-2">
						<h2 class="module-title font-alt">Our Services</h2>
					</div>
				</div>
				<div class="row multi-columns-row">
					<div class="col-sm-6 col-md-3 col-lg-3">
						<div class="features-item">
							<div class="features-icon">
								<span class="icon-clock"></span>
							</div>
							<h3 class="features-title font-alt">Opened 24/7</h3>
							Careful attention to detail and clean, well structured code
							ensures a smooth user experience for all your visitors.
						</div>
					</div>
					<div class="col-sm-6 col-md-3 col-lg-3">
						<div class="features-item">
							<div class="features-icon">
								<span class="icon-streetsign"></span>
							</div>
							<h3 class="features-title font-alt">Free parking</h3>
							Careful attention to detail and clean, well structured code
							ensures a smooth user experience for all your visitors.
						</div>
					</div>
					<div class="col-sm-6 col-md-3 col-lg-3">
						<div class="features-item">
							<div class="features-icon">
								<span class="icon-map"></span>
							</div>
							<h3 class="features-title font-alt">Central Location</h3>
							Careful attention to detail and clean, well structured code
							ensures a smooth user experience for all your visitors.
						</div>
					</div>
					<div class="col-sm-6 col-md-3 col-lg-3">
						<div class="features-item">
							<div class="features-icon">
								<span class="icon-heart"></span>
							</div>
							<h3 class="features-title font-alt">High quality</h3>
							Careful attention to detail and clean, well structured code
							ensures a smooth user experience for all your visitors.
						</div>
					</div>
				</div>
			</div>
		</section>
		
		<section>
			<div class="row landing-image-text">
				<div class="col-sm-6">
					<img class="center-block" style="height: 70%;"
						src="${pageContext.request.contextPath}/resources/my/img/fotograaf-tonu-tunnel.jpg">
				</div>
				<div class="col-sm-6">
					<h2 class="font-alt">Cabin Stay</h2>
					<p class="font-serif">Cabin Stay에서는 자연과 함께하는 특별한 경험을 선사합니다</p>
					<ul>
						<li>Cabin Stay의 모든 객실은 자연 속에 위치하고 있습니다.</li>
						<li>세계자연문화유산으로 지정된 국립공원과 산이 근처에 있습니다.</li>
						<li>낮에는 대자연 속에서 하이킹을, 밤에는 머리 위로 떨어지는 별들을 보며 지낼 수 있습니다.</li>
						<li>더 많은 질문이 있으시다면 상단의 전화기 모양 버튼을 눌러 저희에게 연락주세요.</li>
					</ul>
					<br> <br> <br> <a
						class="btn btn-border-d btn-circle" href="#"
						style="border: 1px solid black;">find out more : Contact 페이지로 이동</a>
				</div>
			</div>
		</section>

		<hr class="divider-w">
		<%@ include file="footer.jsp"%>
	</main>
</body>
</html>