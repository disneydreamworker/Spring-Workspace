package com.kopo.test0826;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kopo.service.TestService;

@Controller
public class ResvController {
	@Autowired
	private TestService testService;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "home";
	}
	
	// Create
//	@GetMapping("/resvForm")
//	public String requestNewReservation(@RequestParam("reservationDate") String reservationDate, @RequestParam("reservationRoom") int reservationRoom, Model model) {
//		Reservation reservation = new Reservation();
//		reservation.setReservationDate(reservationDate);
//		reservation.setReservationRoom(reservationRoom);
//		model.addAttribute("newReservation", reservation);
//		model.addAttribute("newReservationTitle", "예약하기");
//
//		return "reservation/newReservation";
//	}
	
//	@PostMapping("/newReservation")
//	public String submitNewReservation() {
//		
//		return "ResvRegistration";
//	}
	
}
