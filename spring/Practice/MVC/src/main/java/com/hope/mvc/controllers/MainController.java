package com.hope.mvc.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hope.mvc.models.Book;
import com.hope.mvc.services.MainService;

@RestController // @RestController annotation as responses will be raw data
public class MainController {
	// Add service in order to use its methods within the controller
	private final MainService mainServ;
	
	public MainController(MainService mainServ) {
		this.mainServ = mainServ;
	}
	
	
	@GetMapping("/api/books") // Returns raw data
	public List<Book> allBooks() {
		return mainServ.allBooks(); // Raw data
	}
	
	@GetMapping("/api/books/{id}")
	public Book oneBook(
			@PathVariable("id") Long book_id
	) {
		return mainServ.findBook(book_id);
	}
		
	@PostMapping("api/books/new")
	public Book createBook(
			@RequestParam("title") String title,
			@RequestParam("description") String description,
			@RequestParam("language") String language,
			@RequestParam("numberOfPages") Integer numberOfPages
	) {
	// Take the form info from user, create a new object	
	Book newBook = new  Book(title, description, language, numberOfPages);
	
	// Pass the object to the service for creation
		return mainServ.createBook(newBook);
	}
	
	@PutMapping("/api/books/{id}")
	public Book updateBook(
			@PathVariable("id") Long book_id,
			@RequestParam("title") String title,
			@RequestParam("description") String description,
			@RequestParam("language") String language,
			@RequestParam("numberOfPages") Integer numberOfPages		
	) {
			
		return mainServ.updateBook(book_id, title, description, language, numberOfPages);
	}
	
	
	@DeleteMapping("/api/books/{id}")
	public void deleteBook(
			@PathVariable("id") Long book_id
	) {
		mainServ.deleteBook(book_id);
	}
	
}

