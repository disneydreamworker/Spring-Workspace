package com.kopo.test0826;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kopo.service.TestService;

@Controller
public class PassiveController {

	@Autowired
	private TestService testService;
	
	@GetMapping("/error404")
	public String requestError404() {
		return "error404";
	}
	
	@GetMapping("/top")
	public String requestTop(Model model) {
		int id = 0;
		String res = testService.hi(id);
		model.addAttribute("res", res);
		return "top";
	}
	
	@GetMapping("/main")
	public String requestMain() {
		return "main";
	}
	
	@GetMapping("/cabinA")
	public String requestCabinA() {
		return "cabinA";
	}
	
	@GetMapping("/cabinB")
	public String requestCabinB() {
		return "cabinB";
	}
	
	@GetMapping("/cabinC")
	public String requestCabinC() {
		return "cabinC";
	}
	
	@GetMapping("/directions")
	public String requestLocation() {
		return "LocationDirections";
	}
	
	
	@GetMapping("/sightA")
	public String requestSightA() {
		return "sightA";
	}
	
	@GetMapping("/sightB")
	public String requestSightB() {
		return "sightB";
	}
	
	@GetMapping("/sightC")
	public String requestSightC() {
		return "sightC";
	}
	
	
}
