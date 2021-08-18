package com.hope.dojosandninjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.hope.dojosandninjas.models.Dojo;
import com.hope.dojosandninjas.services.MainService;

@Controller
public class MainController {

	
	@Autowired
	private MainService mainServ;
	
	@GetMapping("/")
	public String index(@ModelAttribute("dojoObj") Dojo emptyDojo) {
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
