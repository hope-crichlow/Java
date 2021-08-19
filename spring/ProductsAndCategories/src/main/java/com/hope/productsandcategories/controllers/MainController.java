package com.hope.productsandcategories.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.hope.productsandcategories.models.Product;
import com.hope.productsandcategories.services.MainService;

@Controller
public class MainController {

	
	@Autowired
	private MainService mainServ;
	
	@GetMapping("/")
	public String index(
			@ModelAttribute("prodObj") Product emptyObj
			) {
		return "index.jsp";
	}
	
	@PostMapping("/products/new")
	public String newProd(
			@ModelAttribute("prodObj") Product filledObj
			) {
		mainServ.save(filledObj);
		return "redirect:/";
	}
}
