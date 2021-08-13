package com.hope.mvc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hope.mvc.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{

	// CREATE CUSTOM QUERIES
	
		// FIND ALLL 
	List<Book> findAll();


	
}
