package com.hope.mvc.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hope.mvc.models.Book;
import com.hope.mvc.repositories.BookRepository;

@Service
public class MainService {
	// Adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    // Bringing book repository into service 
    public MainService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    // Methods that call upon CRUD functionality that the repository is providing
    
   
    // Returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    
    // Creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    
    // Retrieves a book
    public Book findBook(Long id) {
    	return bookRepository.findById(id).orElse(null);

    }


}
