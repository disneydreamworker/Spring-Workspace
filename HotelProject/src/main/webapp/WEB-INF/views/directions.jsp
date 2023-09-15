<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Directions</title>
</head>
<body>
	<%@ include file="top.jsp"%>
	
		<!-- Background image -->
		<div
		  class="bg-image d-flex justify-content-center align-items-center"
		  style="
		    background-image: url('${pageContext.request.contextPath}/resources/assets/banner/PC.png');
		    height: 50vh;
		  "
		>
		  <h1 class="text-white">Directions</h1>
		</div>
		<!-- Background image -->
	
	
<!-- 		map -->
	<div class="container">
		<div id="map" style="width: 1000px; height: 470px;">
		    <script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=2937028de7c69f52dce0ef3b3b3f4e33"></script>
		    <script>
		        var container = document.getElementById('map');
		        var options = {
		            center: new kakao.maps.LatLng(37.69373, 127.6777605),
		            level: 2
		        };
		        var map = new kakao.maps.Map(container, options);
		    </script>
		</div>
	</div>
	
	
<!-- 	directions -->
<div class = "container">
	<dl class="row">
	  <dt class="col-sm-3">자가용</dt>
	  <dd class="col-sm-9">서울 춘천고속도로 - 남춘천IC(펜션까지 10KM) - 팔봉산 방향 - 팔봉산 우측직진(3KM)</dd>
	
	  <dt class="col-sm-3">Euismod</dt>
	  <dd class="col-sm-9">
	    <p>Vestibulum id ligula porta felis euismod semper eget lacinia odio sem nec elit.</p>
	    <p>Donec id elit non mi porta gravida at eget metus.</p>
	  </dd>
	</dl>	
</div>
	
</body>
</html>