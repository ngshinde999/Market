package com.online.veg.market.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping(value="/")
	public String home() {
		return "main";
		
	}
	
	@RequestMapping(value="/login")
	public String login() {
		return "Welcome to Login";
		
	}

}
