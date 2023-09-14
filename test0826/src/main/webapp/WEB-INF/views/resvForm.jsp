<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test</title>
    <!-- Include jQuery -->
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <!-- Include jQuery UI (Datepicker) -->
    <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        <!-- Include Flatpickr CSS and JS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/flatpickr/dist/flatpickr.min.css">
    <script src="https://cdn.jsdelivr.net/npm/flatpickr"></script>
    
    
    
<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/calendar_18/fonts/icomoon/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/calendar_18/css/rome.css">

	<link href='${pageContext.request.contextPath}/resources/calendar_19/fullcalendar/packages/core/main.css' rel='stylesheet' />
    <link href='${pageContext.request.contextPath}/resources/calendar_19/fullcalendar/packages/daygrid/main.css' rel='stylesheet' />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/calendar_18/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/calendar_18/css/style.css">

</head>
<body>
	<%@ include file="top.jsp"%>
	
	
	
	<section class="module pt-0 pb-0">
		<div class="container">
			<div class="row position-relative m-0">
					<div class="row">
						<div class="col-sm-12" style="margin: 0;">
							<h2 class="module-title font-alt align-left"  style="margin: 0;">Reserve a Room</h2>
						</div>
					</div>
				</div>
			</div>
	</section>
	
	
	<section style="padding-top: 0;">
		<div class="container">
			<div class="col-sm-8">
				<div class="content">
					<div id='calendar'></div>
				</div>
			</div>
	
			<div class="content">
				<form class="reservation-form" id="reservationForm" action="" method="post">
					<label for="roomType">Select a Cabin Type:</label>
					<select id="roomType">
						<option value="cabinA">Cabin A</option>
						<option value="cabinB">Cabin B</option>
						<option value="cabinC">Cabin C</option>
					</select>
					<div>
						<span id="singleNightPrice"></span>
					</div>
					<label for="userFirstName"> First Name:</label>
						<input type="text" id="userFirstName" required><br>
					<label for="userLastName"> Last Name:</label>
						<input type="text" id="userLastName" required><br>
					<label for="userBdate"> Birth Date:</label>
						<input type="date" id="userBdate" placeholder="dd/mm/yyyy" required><br>
					<label for="userPhone"> Phone Number:</label>
						<input type="text" id="userPhone" required pattern="[0-9-]+"><br>
					<label for="email">Email:</label>
						<input type="email" id="email" required><br>

					<button id="confirmReservationButton" type="submit">Confirm	Reservation</button>
				</form>						
			</div>
		</div>
		
		
	
		<div class="container" style="padding-top: 0;">				
				<div class="col-sm-6 col-md-3 col-lg-3">
				    <div class="content-box">
				        <div class="content">
				            <div class="container text-left">
				                <div class="row justify-content-center">
				                    <div class="col-md-10 text-center">
				                        <div class="d-flex">
				                            </div>
				                        <form action="#" class="row">
				                            <div class="col-lg-6 mb-4">
				                                <input type="text" class="form-control" id="flatpickr_cal_from" placeholder="Check in">
				                            </div>
				                            <div class="col-lg-6 mb-4">
				                                <input type="text" class="form-control" id="flatpickr_cal_to" placeholder="Check out">
				                            </div>
				                        </form>
				                    </div>
				                </div>
				            </div>
				        </div>
				    </div>
				</div>
		</div>
	</section>
	
	<%@ include file="footer.jsp"%>
	
	
	
	<script>
    // Flatpickr 설정
    flatpickr("#flatpickr_cal_from", {
        minDate: "today",
        maxDate: new Date().fp_incr(90), // 오늘부터 90일 후까지
        dateFormat: "Y-m-d",
        onChange: function(selectedDates) {
            const nextDay = new Date(selectedDates[0]);
            nextDay.setDate(nextDay.getDate() + 1);
            
            const maxDateTo = new Date(nextDay);
            maxDateTo.setDate(maxDateTo.getDate() + 30);

            flatpickr("#flatpickr_cal_to", {
                minDate: nextDay,
                maxDate: maxDateTo,
                dateFormat: "Y-m-d",
                onChange: function(selectedDatesTo) {
                    document.getElementById("result_to").value = selectedDatesTo[0].toLocaleDateString();
                }
            });
            document.getElementById("result_from").value = selectedDates[0].toLocaleDateString();
        }
    });

    flatpickr("#flatpickr_cal_to", {
        minDate: "today",
        maxDate: new Date().fp_incr(30), // 오늘부터 30일 후까지
        dateFormat: "Y-m-d",
        onChange: function(selectedDates) {
            document.getElementById("result_to").value = selectedDates[0].toLocaleDateString();
        }
    });
	</script>


	
	<script src="${pageContext.request.contextPath}/resources/calendar_18/js/jquery-3.3.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/calendar_18/js/popper.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/calendar_18/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/calendar_18/js/rome.js"></script>
    <script src="${pageContext.request.contextPath}/resources/calendar_18/js/main.js"></script>
    
	<script src="${pageContext.request.contextPath}/resources/calendar_19/js/jquery-3.3.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/calendar_19/js/popper.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/calendar_19/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/calendar_19/js/rome.js"></script>
    <script src="${pageContext.request.contextPath}/resources/calendar_19/js/main.js"></script>
    <script src='${pageContext.request.contextPath}/resources/calendar_19/fullcalendar/packages/core/main.js'></script>
    <script src='${pageContext.request.contextPath}/resources/calendar_19/fullcalendar/packages/interaction/main.js'></script>
    <script src='${pageContext.request.contextPath}/resources/calendar_19/fullcalendar/packages/daygrid/main.js'></script>   
	
    
    
	<script>
    document.addEventListener('DOMContentLoaded', function() {
    var calendarEl = document.getElementById('calendar');

    var calendar = new FullCalendar.Calendar(calendarEl, {
      plugins: [ 'interaction', 'dayGrid' ],
      defaultDate: '2023-02-12',
      editable: true,
      eventLimit: true, // allow "more" link when too many events
      events: [
        {
          title: 'All Day Event',
          start: '2023-02-01'
        },
        {
          title: 'Long Event',
          start: '2023-02-07',
          end: '2023-02-10'
        },
        {
          groupId: 999,
          title: 'Repeating Event',
          start: '2023-02-09T16:00:00'
        },
        {
          groupId: 999,
          title: 'Repeating Event',
          start: '2023-02-16T16:00:00'
        },
        {
          title: 'Conference',
          start: '2023-02-11',
          end: '2023-02-13'
        },
        {
          title: 'Meeting',
          start: '2023-02-12T10:30:00',
          end: '2023-02-12T12:30:00'
        },
        {
          title: 'Lunch',
          start: '2023-02-12T12:00:00'
        },
        {
          title: 'Meeting',
          start: '2023-02-12T14:30:00'
        },
        {
          title: 'Happy Hour',
          start: '2023-02-12T17:30:00'
        },
        {
          title: 'Dinner',
          start: '2023-02-12T20:00:00'
        },
        {
          title: 'Birthday Party',
          start: '2023-02-13T07:00:00'
        },
        {
          title: 'Click for Google',
          url: 'http://google.com/',
          start: '2023-02-28'
        }
      ]
    });

    calendar.render();
  });
	</script>

	<script> // 		가격 정보 표시하는 function
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
		const checkInDateInput = document.getElementById("inline_cal_from");
		const checkOutDateInput = document.getElementById("inline_cal_to");
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
//					document.getElementById("totalPrice").textContent = "$" + calPrices.toLocaleString();
				totalPriceElement.innerHTML = "총 가격 $" + calPrices.toLocaleString();
			}
		});
	});
    
</script>
</body>
</html>