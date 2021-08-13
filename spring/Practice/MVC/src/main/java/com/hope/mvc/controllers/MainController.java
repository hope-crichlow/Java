package com.hope.mvc.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hope.mvc.models.Book;
import com.hope.mvc.services.MainService;

@RestController
public class MainController {
	// Add service in order to use its methods within the controller
	private final MainService mainServ;
	
	public MainController(MainService mainServ) {
		this.mainServ = mainServ;
	}
	
	
	@GetMapping("/api/books") // Returning raw data
	public List<Book> allBooks() {
		return mainServ.allBooks();
	}
	
	@GetMapping("/api/books/{id}")
		public Book oneBook(
				@PathVariable("id") Long book_id
		) {
			return mainServ.findBook(book_id);
		}
		

}

