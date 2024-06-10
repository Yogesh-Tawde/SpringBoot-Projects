package com.yogeshwork.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class MessegeController {
	@GetMapping("/welcome")
	public String getWelcomeMsg(Model model) {
		
		model.addAttribute("msg","Welcome to Thymeleaf App");
		return "index";
		
	}

}
