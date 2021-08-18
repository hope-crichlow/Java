package com.hope.dojosandninjas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}

	@GetMapping("/dojos/new")
	public String newDojo() {
		return "redirect:/";
	}
	
	@GetMapping("/ninjas/new")
	public String newNinja() {
		return "newNinja.jsp";
	}
	
	
}
