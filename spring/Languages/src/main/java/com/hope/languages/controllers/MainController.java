package com.hope.languages.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.hope.languages.models.Language;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String index(@ModelAttribute("langObj")Language emptyLang) {
		return "index.jsp";
	}
	
	
}
   