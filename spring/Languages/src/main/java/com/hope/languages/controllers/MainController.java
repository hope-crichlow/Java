package com.hope.languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.hope.languages.models.Language;
import com.hope.languages.services.LanguageService;

@Controller
public class MainController {
	
	@Autowired
	private LanguageService langServ;
	
	// - - - - - - - - - - - - - - - - CREATE - - - - - - - - - - - - - - - - //
	
	@GetMapping("/")
	public String index(
			@ModelAttribute("langObj")Language emptyLang,
			Model model
	) {
		
		// GRAB ALL LANGUAGES FROM DB
		List<Language> allLangs = langServ.allLangs();
		
		// PASS ALL LANGUAGES TO THE JSP
		model.addAttribute("langs", allLangs);
		
		return "index.jsp";
	}
	
	@PostMapping("/languages/new")
	public String create(
			@Valid @ModelAttribute("langObj") Language filledLang, 
			BindingResult results, 
			Model model
	) {
		// VALIDATIONS FAIL, RERENDER THE JSP
		if(results.hasErrors()) {
			
			// GRAB ALL LANGUAGES FROM DB
			List<Language> allLangs = langServ.allLangs();
			
			// PASS ALL LANGUAGES TO THE JSP
			model.addAttribute("langs", allLangs);
			
			return "index.jsp";
		}
		// VALIDATIONS PASS, CREATE NEW LANGUAGE
		else {
			langServ.saveLang(filledLang);
			return "redirect:/";
		}
	}
	
	// - - - - - - - - - - - - - - - - CREATE - - - - - - - - - - - - - - - - //
	
	
	
	// - - - - - - - - - - - - - - - - UPDATE - - - - - - - - - - - - - - - - //
	
	@GetMapping("/languages/edit/{id}")
	 public String edit(
			 @PathVariable("id") Long lang_id,
			 Model model
	) {
		 // GRAB ONE LANGUAGE FROM DB
		 Language oneLang = langServ.findOneLang(lang_id);
		
		 // PASS LANGUAGE TO THE JSP
		 model.addAttribute("langObj", oneLang);
	
		 return "edit.jsp";
	 }
	 			
	 
	@PutMapping("/languages/{id}/edit")
	public String update(
			 @Valid @ModelAttribute("langObj") Language filledLang, 
			 BindingResult results
	) {
		// VALIDATIONS FAIL, RERENDER THE JSP
		if(results.hasErrors()) {
			return "edit.jsp";
		}
		// VALIDATIONS PASS, UPDATE LANGUAGE
		else {
			langServ.saveLang(filledLang);
			return "redirect:/";
		}
	 }
	
	// - - - - - - - - - - - - - - - - UPDATE - - - - - - - - - - - - - - - - //
	
	
	
	// - - - - - - - - - - - - - - - - READ ONE - - - - - - - - - - - - - - - - //
	
	@GetMapping("/languages/{id}")
	public String showLang(
			@PathVariable("id")Long lang_id,
			Model model
	){
		// GRAB ONE LANGUAGE FROM DB
		Language oneLang = langServ.findOneLang(lang_id);
		
		// PASS LANGUAGE TO THE JSP
		model.addAttribute("langObj", oneLang);
		
		return "show.jsp";
	}
	
	// - - - - - - - - - - - - - - - - READ ONE - - - - - - - - - - - - - - - - //
	
	
	// - - - - - - - - - - - - - - - - DELETE - - - - - - - - - - - - - - - - //
	
	@GetMapping("/languages/delete/{id}")
	public String delete(@PathVariable("id") Long lang_id) {
		
		langServ.deleteLang(lang_id);
		
		return "redirect:/";
	}
	// - - - - - - - - - - - - - - - - DELETE - - - - - - - - - - - - - - - - //
	
	
}
   