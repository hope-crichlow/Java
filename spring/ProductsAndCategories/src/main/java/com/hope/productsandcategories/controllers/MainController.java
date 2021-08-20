package com.hope.productsandcategories.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hope.productsandcategories.models.Category;
import com.hope.productsandcategories.models.Product;
import com.hope.productsandcategories.services.MainService;

@Controller
public class MainController {

	
	@Autowired
	private MainService mainServ;
	
// NEW PRODUCT PAGE
	@GetMapping("/")
	public String index(
			@ModelAttribute("prodObj") Product emptyObj){
		return "index.jsp";
	}
// NEW PRODUCT FORM
	@PostMapping("/products/new")
	public String newProd(
			@ModelAttribute("prodObj") Product filledObj
			) {
		mainServ.saveProd(filledObj);
		return "redirect:/";
	}

// NEW CATEGORY PAGE
	@GetMapping("/categories/new")
	public String newCat(
			@ModelAttribute("catObj") Category emptyCat){
		return "newCat.jsp";
	}
// NEW CATEGORY FORM	
	@PostMapping("/categories/new")
	public String createCat(
			@ModelAttribute("catObj") Category filledCat) {
		
		mainServ.saveCat(filledCat);
		return "redirect:/";
	}
// INDIVIDUAL PRODUCT PAGE - CREATING THE RELATIONSHIP
		@GetMapping("/categories/{id}")
		public String oneCategory(
				@PathVariable("id") Long cat_id,
				Model model) {
			
			
			Category oneCategory = mainServ.findCategory(cat_id);
			model.addAttribute("category",oneCategory);
			model.addAttribute("products", mainServ.productsExcludingCategory(oneCategory));
			
			return "category.jsp";
		}


// INDIVIDUAL PRODUCT PAGE - CREATING THE RELATIONSHIP
	@GetMapping("/products/{id}")
	public String oneProduct(
			@PathVariable("id") Long prod_id,
			Model model) {
		
		
		Product oneProduct = mainServ.findProduct(prod_id);
		model.addAttribute("product",oneProduct);
		model.addAttribute("categories", mainServ.categoriesExcludingProduct(oneProduct));
		
		return "product.jsp";
	}
	
	
	@PostMapping("/products/{id}")
	public String addCategoryToProduct(
			@PathVariable("id")Long prod_id,
			@RequestParam("category_id")Long cat_id
			) {
		// USING THE IDS, FIND PRODUCT OBJ AND CATEGORY OBJ 
		Category oneCat = mainServ.findCategory(cat_id);
		Product oneProd = mainServ.findProduct(prod_id);
		
		
		
		// ADDING THE RELATIONSHIP TO THE OBJECT 
		oneCat.getProducts().add(oneProd); // Grab list of products from category object and add new product
//		oneProd.getCategories().add(oneCat);
	
		
		// SAVE THE NEW INFORMATION IN THE DB
		mainServ.saveCat(oneCat);
//		mainServ.saveProd(oneProd);
		
		return "redirect:/products/" + prod_id;
	}
}
