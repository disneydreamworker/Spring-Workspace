<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>|CottageStay| 예약하기</title>
<style>
.modal {
	display: none;
	position: fixed;
	z-index: 1;
	left: 0;
	top: 0;
	width: 100%;
	height: 100%;
	overflow: auto;
	background-color: rgba(0, 0, 0, 0.4);
}

.modal-content {
	background-color: white;
	margin: 10% auto;
	padding: 20px;
	border: 1px solid #888;
	width: 60%;
	border-radius: 5px;
	box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0
		rgba(0, 0, 0, 0.19);
}

.close {
	float: right;
	font-size: 28px;
	font-weight: bold;
}

.close:hover, .close:focus {
	color: #000;
	text-decoration: none;
	cursor: pointer;
}
</style>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/my/css/modalResv.css">
<script src="https://cdn.jsdelivr.net/npm/pikaday/pikaday.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.29.1/moment.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="https://cdn.jsdelivr.net/npm/pikaday/css/pikaday.css">
</head>
<body>
	<%@ include file="top.jsp"%>
		<section class="module pt-0 pb-0">
			<div class="row position-relative m-0">
				<div class="col-xs-12 col-md-6 side-image-text">
					<div class="row">
						<div class="col-sm-12">
							<h2 class="module-title font-alt align-left">Reserve a Room</h2>
						</div>
					</div>
					
					
					
					
					<form class="reservation-form" id="reservationForm" action="/newReservation" method="post">
						<label for="roomType">Select a Cabin Type:</label>
						<select
							id="roomType">
							<option value="cabinA">Cabin A</option>
							<option value="cabinB">Cabin B</option>
							<option value="cabinC">Cabin C</option>
						</select>
						<div>
							<span id="singleNightPrice"></span>
						</div>
						<br>
						<label for="checkInDate">Check-In Date:</label>
							<input type="text" id="checkInDate" required>
						<br>
						<br>
						<label for="checkOutDate">Check-Out Date:</label>
							<input type="text" id="checkOutDate" required>
						<br>
						<br>
						<p>
							<span id="totalPrice"></span>
						</p>
						<div class="form-group">
							<button class="btn btn-g btn-round btn-block btn-lg mt-20" id="reserveButton">
								<i class="fa fa-paper-plane-o"></i> Reserve
							</button>
						</div>

				<div class="col-xs-12 col-md-6 col-md-offset-6 side-image restaurant-image-overlay" data-background="${pageContext.request.contextPath}/resources/titan/assets/images/restaurant/reservation.jpg"></div>
					<div id="reservationModal" class="modal">
						<div class="modal-content">
							<span class="close">&times;</span>
							<h2>예약 정보 입력</h2>
							
							<label for="userFirstName"> First Name:</label>
								<input type="text" id="userFirstName" required>
								<br>
							<label for="userLastName"> Last Name:</label>
								<input type="text" id="userLastName" required>
								<br>
							<label for="userBdate"> Birth Date:</label>
								<input type="date" id="userBdate" placeholder="dd/mm/yyyy" required>
								<br>
							<label for="userPhone"> Phone Number:</label>
								<input type="text" id="userPhone" required pattern="[0-9-]+">
								<br>
							<label for="email">Email:</label> <input
								type="email" id="email" required> <br>
							<button id="confirmReservationButton" type="submit">Confirm Reservation</button>
						</div>
					</div>
				</form>
				
				
				
				
				
				</div>
			</div>
	</section>	
			

	<script src="moment.js"></script>
	<script src="pikaday.js"></script>
	<script src="/js/modalResv.js"></script>
	<script>
		// 		가격 정보 표시하는 function
		document.addEventListener("DOMContentLoaded", function() {
			const roomTypeSelect = document.getElementById("roomType");
			const singleNightPriceElement = document.getElementById("singleNightPrice");
			const roomPrices = {
					cabinA: 350, // 가격 정보 설정
			        cabinB: 410,
			        cabinC: 410
				};
			// 가격 정보 초기 표시 함수
			function updatePrice(roomType) {
				const selectedRoomPrice = roomPrices[roomType];
				singleNightPriceElement.innerHTML = "1박 당 $" + selectedRoomPrice.toLocaleString();
			}
			// roomType 옵션 변경 이벤트 핸들러
			roomTypeSelect.addEventListener("change", function() {
            	const selectedRoomType = roomTypeSelect.value;
            	updatePrice(selectedRoomType);
        	});
			// 초기 로딩 시에도 가격 정보 표시
			const defaultRoomType = "cabinA";
			updatePrice(defaultRoomType);
		});
		
		// 		체크인/체크아웃 날짜 기능, 총 가격 계산
		document.addEventListener("DOMContentLoaded", function() {
			const reserveButton = document.getElementById("reserveButton");
			const checkInDateInput = document.getElementById("checkInDate");
			const checkOutDateInput = document.getElementById("checkOutDate");
			const totalPriceElement = document.getElementById("totalPrice");
			let calPrices;
			let stayNights;
			const today = new Date();
			const threeMonthsLater = new Date();
			const twoMonthsLater = new Date();
			const oneMonthsLater = new Date();
			oneMonthsLater.setMonth(today.getMonth() + 1);
			twoMonthsLater.setMonth(today.getMonth() + 2);
			threeMonthsLater.setMonth(today.getMonth() + 3);
			
		    const roomPrices = {
				cabinA: 350, // 가격 정보 설정
		        cabinB: 410,
		        cabinC: 410
			};
		    
			const checkIn = new Pikaday({
				field : checkInDateInput,
				minDate : today,
				maxDate : twoMonthsLater,
				format: "YYYY-MM-DD",
				onSelect : function(date) {
					checkInDateInput.value = moment(date).format("YYYY-MM-DD");
		            const nextDay = new Date(date);
					nextDay.setDate(date.getDate() + 1);
					checkOutDateInput.value = "";
					checkOut.setMinDate(nextDay);
				}
			});

			const checkOut = new Pikaday({
				field : checkOutDateInput,
				minDate : today,
				maxDate : threeMonthsLater,
				format: "YYYY-MM-DD",
				onSelect : function(date) {
					checkOutDateInput.value = moment(date).format("YYYY-MM-DD");
					stayNights = (date - checkIn.getDate()) / (1000 * 60 * 60 * 24); // 체크인과 체크아웃 날짜 차이 계산
					const roomType = document.getElementById("roomType").value;
					const oneNightPrice = roomPrices[roomType]; // 선택한 방 타입의 1박 가격 가져오기
					calPrices = stayNights * oneNightPrice;
// 					document.getElementById("totalPrice").textContent = "$" + calPrices.toLocaleString();
					totalPriceElement.innerHTML = "총 가격 $" + calPrices.toLocaleString();
				}
			});
		});
		
		document.addEventListener("DOMContentLoaded", function() {
		    const reserveButton = document.getElementById("reserveButton");
		    const reservationModal = document.getElementById("reservationModal");
		    const closeButton = document.querySelector(".close");
		    const confirmReservationButton = document.getElementById("confirmReservationButton");
		    const checkInDateInput = document.getElementById("checkInDate");
		    const checkOutDateInput = document.getElementById("checkOutDate");

		    // 예약 버튼 클릭 이벤트 핸들러
		    reserveButton.addEventListener("click", function() {
		        if (checkInDateInput.value === "" || checkOutDateInput.value === "") {
		            alert("체크인/체크아웃 날짜를 입력해주세요.");
		            return;
		        }
		        reservationModal.style.display = "block";
		    });

		    // 모달 닫기 버튼 클릭 이벤트 핸들러
		    closeButton.addEventListener("click", function() {
		        reservationModal.style.display = "none";
		    });
		});
	    
</script>
	<%@ include file="footer.jsp"%>
</body>
</html>
