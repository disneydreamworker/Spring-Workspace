<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>|CottageStay| 찾아오는길</title>
</head>
<body>
	<main>
		<section>
			<%@ include file="top.jsp"%>
		</section>
		<section class="module-small free-trial" style="background-color: black;">
			<div class="container text-center">
				<div class="row">
					<div class="col-sm-8 col-sm-offset-2">
						<h2 class="font-alt">오시는 길</h2>
					</div>
				</div>
			</div>
		</section>

		<section style="position: center;">
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
		</section>
		<section class="module download pb-0">
			<div class="container text-center">
				<ul style="text-align: left;">
					<li>강원도 홍천군 서면 반곡리 66-5 Cabin Stay</li>
					<li>서울 춘천고속도로 - 남춘천IC(펜션까지 10KM) - 팔봉산 방향 - 팔봉산 우측직진(3KM)</li>
					<li>서울춘천고속도로 - 강촌IC(펜션까지 13KM) - 팔봉산 방향 우측 직진(3KM)</li>
					<li>대전 광주-중부고속도로-강일IC-서울춘천 고속도로-남춘천IC(펜션까지 10km) 팔봉산 방향-팔봉산
						우측 직진 (3km)</li>
					<li>부산 대구-중앙고속도로-춘천분기점IC-서울춘천고속도로-남춘천IC(펜션까지 10km)-팔봉산 방향-팔봉산
						우측 직진(3km)</li>
					<li>서울 경기북부-마석-대성리-신청평대교-설악면.모곡유원지-공천서면 사무소(3km)-좌측</li>
					<li>이천-양평-단월명성터널-비발디파크- 팔봉산 관광지 지나서 좌회전 3km 주행 후 우측</li>
				</ul>
			</div>
		</section>
		<section>
			<%@ include file="footer.jsp"%>
		</section>
	</main>
</body>
</html>