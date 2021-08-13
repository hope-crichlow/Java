package com.hope.mvc.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.hope.mvc.models.Book;
import com.hope.mvc.services.MainService;

@Controller // @Controller annotation as data will be rendered to jsp files
public class BookController {
	// Add service in order to use its methods within the controller
	private final MainService mainServ;
	
	public BookController(MainService mainServ) {
		this.mainServ = mainServ;
	}
		
	// DISPLAY ALL BOOKS
	@GetMapping("/")
	public String index(
			Model model
	) {
		
		// Use the service to grab all books
		List<Book> allBoooks = mainServ.allBooks(); 
		//Use the model to pass data to jsp
		model.addAttribute("books", allBoooks);
		
		
		return "index.jsp";
	}
}
