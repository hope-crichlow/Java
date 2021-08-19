package com.hope.productsandcategories.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.hope.productsandcategories.models.Product;

@Controller
public class MainController {

	@GetMapping("/")
	public String index(
			@ModelAttribute("prodObj") Product emptyObj
			) {
		return "index.jsp";
	}
}
