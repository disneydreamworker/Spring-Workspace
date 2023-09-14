<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>menu header//bootstrap applied</title>
	<!-- ===============================================-->
	<!--    Favicons-->
	<!-- ===============================================-->
	<link rel="apple-touch-icon" sizes="180x180" href="${pageContext.request.contextPath}/resources/majestic/assets/img/favicons/apple-touch-icon.png">
	<link rel="icon" type="image/png" sizes="32x32" href="${pageContext.request.contextPath}/resources/majestic/assets/img/favicons/favicon-32x32.png">
	<link rel="icon" type="image/png" sizes="16x16" href="${pageContext.request.contextPath}/resources/majestic/assets/img/favicons/favicon-16x16.png">
	<link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/resources/majestic/assets/img/favicons/favicon.ico">
	<link rel="manifest" href="${pageContext.request.contextPath}/resources/majestic/assets/img/favicons/manifest.json">
	<meta name="msapplication-TileImage" content="${pageContext.request.contextPath}/resources/majestic/assets/img/favicons/mstile-150x150.png">
	<meta name="theme-color" content="#ffffff">
	<!-- ===============================================-->
	<!--    Favicons-->
	<!-- ===============================================-->	
<%-- 	<link rel="apple-touch-icon" sizes="57x57" href="${pageContext.request.contextPath}/resources/titan/assets/images/favicons/apple-icon-57x57.png">  --%>
<%-- 	<link rel="apple-touch-icon" sizes="60x60" href="${pageContext.request.contextPath}/resources/titan/assets/images/favicons/apple-icon-60x60.png"> --%>
<%-- 	<link rel="apple-touch-icon" sizes="72x72" href="${pageContext.request.contextPath}/resources/titan/assets/images/favicons/apple-icon-72x72.png"> --%>
<%-- 	<link rel="apple-touch-icon" sizes="76x76" href="${pageContext.request.contextPath}/resources/titan/assets/images/favicons/apple-icon-76x76.png"> --%>
<%-- 	<link rel="apple-touch-icon" sizes="114x114" href="${pageContext.request.contextPath}/resources/titan/assets/images/favicons/apple-icon-114x114.png"> --%>
<%-- 	<link rel="apple-touch-icon" sizes="120x120" href="${pageContext.request.contextPath}/resources/titan/assets/images/favicons/apple-icon-120x120.png"> --%>
<%-- 	<link rel="apple-touch-icon" sizes="144x144" href="${pageContext.request.contextPath}/resources/titan/assets/images/favicons/apple-icon-144x144.png"> --%>
<%-- 	<link rel="apple-touch-icon" sizes="152x152" href="${pageContext.request.contextPath}/resources/titan/assets/images/favicons/apple-icon-152x152.png"> --%>
<%-- 	<link rel="apple-touch-icon" sizes="180x180" href="${pageContext.request.contextPath}/resources/titan/assets/images/favicons/apple-icon-180x180.png"> --%>
<%-- 	<link rel="icon" type="image/png" sizes="192x192" href="${pageContext.request.contextPath}/resources/titan/assets/images/favicons/android-icon-192x192.png"> --%>
<%-- 	<link rel="icon" type="image/png" sizes="32x32" href="${pageContext.request.contextPath}/resources/titan/assets/images/favicons/favicon-32x32.png"> --%>
<%-- 	<link rel="icon" type="image/png" sizes="96x96" href="${pageContext.request.contextPath}/resources/titan/assets/images/favicons/favicon-96x96.png"> --%>
<%-- 	<link rel="icon" type="image/png" sizes="16x16" href="${pageContext.request.contextPath}/resources/titan/assets/images/favicons/favicon-16x16.png"> --%>
<!-- 	<link rel="manifest" href="/manifest.json">  -->
<!-- 	<meta name="msapplication-TileColor" content="#ffffff"> -->
<%-- 	<meta name="msapplication-TileImage" content="${pageContext.request.contextPath}/resources/titan/assets/images/favicons/ms-icon-144x144.png"> --%>
<!-- 	<meta name="theme-color" content="#ffffff"> -->
	<!-- ===============================================-->
	<!--    Stylesheets-->
	<!-- ===============================================-->
	<link href="${pageContext.request.contextPath}/resources/majestic/assets/css/theme.css" rel="stylesheet" />
	<!-- ===============================================-->
	<!--    Stylesheets-->
	<!-- ===============================================-->
	<link href="${pageContext.request.contextPath}/resources/titan/assets/lib/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet"> 
	<link href="https://fonts.googleapis.com/css?family=Roboto+Condensed:400,700" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Volkhov:400i" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/resources/titan/assets/lib/animate.css/animate.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/resources/titan/assets/lib/components-font-awesome/css/font-awesome.min.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/resources/titan/assets/lib/et-line-font/et-line-font.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/resources/titan/assets/lib/flexslider/flexslider.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/resources/titan/assets/lib/owl.carousel/dist/assets/owl.carousel.min.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/resources/titan/assets/lib/owl.carousel/dist/assets/owl.theme.default.min.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/resources/titan/assets/lib/magnific-popup/dist/magnific-popup.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/resources/titan/assets/lib/simple-text-rotator/simpletextrotator.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/resources/titan/assets/css/style.css" rel="stylesheet"> 
	<link id="color-scheme" href="${pageContext.request.contextPath}/resources/titan/assets/css/colors/default.css" rel="stylesheet">
</head>


<body>
	<!-- ===============================================-->
	<!--    JavaScripts-->
	<!-- ===============================================-->
	<script src="${pageContext.request.contextPath}/resources/majestic/vendors/@popperjs/popper.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/majestic/vendors/bootstrap/bootstrap.min.js"></script>
	<script	src="${pageContext.request.contextPath}/resources/majestic/vendors/is/is.min.js"></script>
	<script	src="https://polyfill.io/v3/polyfill.min.js?features=window.scroll"></script>
	<script	src="${pageContext.request.contextPath}/resources/majestic/vendors/feather-icons/feather.min.js"></script>
	<script>feather.replace();</script>
	<script	src="${pageContext.request.contextPath}/resources/majestic/assets/js/theme.js"></script>
	<link href="https://fonts.googleapis.com/css2?family=Jost:wght@200;300;400;500;600;700;800;900&amp;display=swap" rel="stylesheet">

	<!-- ===============================================-->
	<!--   NAV-->
	<!-- ===============================================-->
		<nav
			class="navbar navbar-expand-lg navbar-light fixed-top py-3 d-block"
			data-navbar-on-scroll="data-navbar-on-scroll">
			<div class="container">
				<a class="navbar-brand d-inline-flex"
					href='${pageContext.request.contextPath}/main'><img
					class="d-inline-block"
					src="${pageContext.request.contextPath}/resources/majestic/assets/img/gallery/logo.png"
					alt="logo" /><span class="text-1000 fs-0 fw-bold ms-2">Majestic</span></a>
				<button class="navbar-toggler collapsed" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div
					class="collapse navbar-collapse border-top border-lg-0 mt-4 mt-lg-0"
					id="navbarSupportedContent">
					<ul class="navbar-nav me-auto mb-2 mb-lg-0">
						<li class="nav-item px-2"><a
							class="nav-link fw-medium active" aria-current="page"
							href="#categoryWomen">About</a></li>
						<li class="nav-item px-2"><a class="nav-link fw-medium"
							href="#header">Visits</a></li>
						<li class="nav-item px-2"><a class="nav-link fw-medium"
							href="#collection">Events</a></li>
						<li class="nav-item px-2"><a class="nav-link fw-medium"
							href="#outlet">More</a></li>
					</ul>
	            <form class="d-flex"><a class="text-1000" href="#!">
	                <svg class="feather feather-phone me-3" xmlns="http://www.w3.org/2000/svg" width="16" height="16" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
	                  <path d="M22 16.92v3a2 2 0 0 1-2.18 2 19.79 19.79 0 0 1-8.63-3.07 19.5 19.5 0 0 1-6-6 19.79 19.79 0 0 1-3.07-8.67A2 2 0 0 1 4.11 2h3a2 2 0 0 1 2 1.72 12.84 12.84 0 0 0 .7 2.81 2 2 0 0 1-.45 2.11L8.09 9.91a16 16 0 0 0 6 6l1.27-1.27a2 2 0 0 1 2.11-.45 12.84 12.84 0 0 0 2.81.7A2 2 0 0 1 22 16.92z"></path>
	                </svg></a><a class="text-1000" href="#!">
	                <svg class="feather feather-shopping-cart me-3" xmlns="http://www.w3.org/2000/svg" width="16" height="16" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
	                  <circle cx="9" cy="21" r="1"></circle>
	                  <circle cx="20" cy="21" r="1"></circle>
	                  <path d="M1 1h4l2.68 13.39a2 2 0 0 0 2 1.61h9.72a2 2 0 0 0 2-1.61L23 6H6"></path>
	                </svg></a><a class="text-1000" href="#!">
	                <svg class="feather feather-search me-3" xmlns="http://www.w3.org/2000/svg" width="16" height="16" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
	                  <circle cx="11" cy="11" r="8"></circle>
	                  <line x1="21" y1="21" x2="16.65" y2="16.65"></line>
	                </svg></a><a class="text-1000" href="#!">
	                <svg class="feather feather-user me-3" xmlns="http://www.w3.org/2000/svg" width="16" height="16" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
	                  <path d="M20 21v-2a4 4 0 0 0-4-4H8a4 4 0 0 0-4 4v2"></path>
	                  <circle cx="12" cy="7" r="4"></circle>
	                </svg></a><a class="text-1000" href="#!">
	                <svg class="feather feather-heart me-3" xmlns="http://www.w3.org/2000/svg" width="16" height="16" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
	                  <path d="M20.84 4.61a5.5 5.5 0 0 0-7.78 0L12 5.67l-1.06-1.06a5.5 5.5 0 0 0-7.78 7.78l1.06 1.06L12 21.23l7.78-7.78 1.06-1.06a5.5 5.5 0 0 0 0-7.78z"></path>
	                </svg></a></form>
	          </div>
	        </div>
	      </nav>


	<!-- ===============================================-->
    <!--    JavaScripts-->
    <!-- ===============================================-->
    <script src="vendors/@popperjs/popper.min.js"></script>
    <script src="vendors/bootstrap/bootstrap.min.js"></script>
    <script src="vendors/is/is.min.js"></script>
    <script src="https://polyfill.io/v3/polyfill.min.js?features=window.scroll"></script>
    <script src="vendors/feather-icons/feather.min.js"></script>
    <script>feather.replace();</script>
    <script src="${pageContext.request.contextPath}/resources/majestic/assets/js/theme.js"></script>
    <link href="https://fonts.googleapis.com/css2?family=Jost:wght@200;300;400;500;600;700;800;900&amp;display=swap" rel="stylesheet">
    
    <!-- ===============================================-->
    <!--    JavaScripts-->
    <!-- ===============================================-->
	<script src="${pageContext.request.contextPath}/resources/titan/assets/lib/jquery/dist/jquery.js"></script>
	<script src="${pageContext.request.contextPath}/resources/titan/assets/lib/bootstrap/dist/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/titan/assets/lib/wow/dist/wow.js"></script>
	<script	src="${pageContext.request.contextPath}/resources/titan/assets/lib/jquery.mb.ytplayer/dist/jquery.mb.YTPlayer.js"></script>
	<script	src="${pageContext.request.contextPath}/resources/titan/assets/lib/isotope/dist/isotope.pkgd.js"></script>
	<script	src="${pageContext.request.contextPath}/resources/titan/assets/lib/imagesloaded/imagesloaded.pkgd.js"></script>
	<script	src="${pageContext.request.contextPath}/resources/titan/assets/lib/flexslider/jquery.flexslider.js"></script>
	<script	src="${pageContext.request.contextPath}/resources/titan/assets/lib/owl.carousel/dist/owl.carousel.min.js"></script>
	<script	src="${pageContext.request.contextPath}/resources/titan/assets/lib/smoothscroll.js"></script>
	<script	src="${pageContext.request.contextPath}/resources/titan/assets/lib/magnific-popup/dist/jquery.magnific-popup.js"></script>
	<script	src="${pageContext.request.contextPath}/resources/titan/assets/lib/simple-text-rotator/jquery.simple-text-rotator.min.js"></script>
	<script	src="${pageContext.request.contextPath}/resources/titan/assets/js/plugins.js"></script>
	<script	src="${pageContext.request.contextPath}/resources/titan/assets/js/main.js"></script>

</body>
</html>