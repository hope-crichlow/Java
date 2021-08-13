package com.hope.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.hope.mvc.services.MainService;

@Controller // @Controller annotation as data will be rendered to jsp files
public class BookController {
	// Add service in order to use its methods within the controller
	private final MainService mainServ;
	
	public BookController(MainService mainServ) {
		this.mainServ = mainServ;
	}
		
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
}
