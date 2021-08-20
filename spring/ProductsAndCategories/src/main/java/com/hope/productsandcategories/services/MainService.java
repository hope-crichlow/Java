package com.hope.productsandcategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hope.productsandcategories.models.Category;
import com.hope.productsandcategories.models.Product;
import com.hope.productsandcategories.repositories.CategoryRepository;
import com.hope.productsandcategories.repositories.ProductRepository;

@Service
public class MainService {

	@Autowired
	private ProductRepository prodRepo;
	
	@Autowired
	private CategoryRepository catRepo;
	
// ------------------- CRUD PRODUCTS ------------------- //
	
	public List<Product> allProducts(){
		return prodRepo.findAll();
	}
	
	public Product saveProd(Product p) {
		return prodRepo.save(p);
	}
	
	public Product findProduct(Long prod_id) {
		return prodRepo.findById(prod_id).orElse(null);
	}
// ------------------- CRUD PRODUCTS ------------------- //

// ------------------- CRUD CATEGORIES ------------------- //
	public List<Category> allCategories(){
		return catRepo.findAll();
	}
	
	public Category saveCat(Category c) {
		return catRepo.save(c);
	}
	
	public Category findCategory(Long cat_id) {
		return catRepo.findById(cat_id).orElse(null);
	}
	public List<Category> categoriesExcludingProduct(Product p){
		return catRepo.findByProductsNotContains(p);
	}
// ------------------- CRUD CATEGORIES ------------------- //
}
