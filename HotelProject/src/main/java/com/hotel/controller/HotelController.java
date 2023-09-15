package com.hotel.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HotelController {
	
	@RequestMapping(value = "/room_information", method = RequestMethod.GET)
	public String room_information(Locale locale, Model model) {
		return "room_information";
	}
	
	@RequestMapping(value = "/directions", method = RequestMethod.GET)
	public String directions (Locale locale, Model model) {
		return "directions";
	}
	
	@RequestMapping(value = "/booking", method = RequestMethod.GET)
	public String booking (Locale locale, Model model) {
		return "booking";
	}
	
	
	@RequestMapping(value = "/booking_new", method = RequestMethod.GET)
	public String booking_new (Locale locale, Model model) {
		return "booking_new";
	}
}
