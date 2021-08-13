package com.hope.mvc.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hope.mvc.models.Book;
import com.hope.mvc.repositories.BookRepository;

@Service
public class MainService {
	 // adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    // bringing book repository into service 
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

//	public Book updateBook(Long book_id, String title, String description, String language, Integer numPages) {
//		// FIND THE BOOK
//		Book editBook = this.findBook(book_id);
//		// UPDATE THE BOOK OBJECT WITH NEW INFO
//		editBook.setTitle(title);
//		editBook.setDescription(description);
//		editBook.setLanguage(language);
//		editBook.setNumberOfPages(numPages);
//		// SAVE THE UPDATED BOOK OBJECT INTO DB
////		return this.createBook(editBook);
//		return bookRepository.save(editBook);
//	}
//
//	public void deleteBook(Long book_id) {
//		bookRepository.deleteById(book_id);
//	}
}
