package com.hope.productsandcategories.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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

// INDIVIDUAL PRODUCT PAGE
	@GetMapping("/products/{id}")
	public String oneProduct(
			@PathVariable("id") Long prod_id,
			Model model) {
		
		model.addAttribute("product", mainServ.findProduct(prod_id));
		model.addAttribute("categories", mainServ.allCategories());
		
		return "product.jsp";
	}
	
}
