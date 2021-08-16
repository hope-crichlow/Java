package com.hope.languages.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.hope.languages.models.Language;
import com.hope.languages.services.LanguageService;

@Controller
public class MainController {
	
	@Autowired
	private LanguageService langServ;
	
	// - - - - - - - - - - CREATE - - - - - - - - - - //
	@GetMapping("/")
	public String index(@ModelAttribute("langObj")Language emptyLang) {
		return "index.jsp";
	}
	
	@PostMapping("/languages/new")
	public String create(
			@Valid @ModelAttribute("langObj") Language filledLang, BindingResult results
	) {
		// VALIDATIONS FAIL, RERENDER THE JSP
		if(results.hasErrors()) {
			return "index.jsp";
		}
		// VALIDATIONS PASS, CREATE NEW LANGUAGE
		else {
			langServ.saveLang(filledLang);
			return "redirect:/";
		}
	}
	
	// - - - - - - - - - - CREATE - - - - - - - - - - //
}
   