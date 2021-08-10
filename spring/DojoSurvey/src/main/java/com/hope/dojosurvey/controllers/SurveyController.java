package com.hope.dojosurvey.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SurveyController {
	
	@RequestMapping("/")
	public String index(Model model, HttpSession session) {
		
//		Location
		ArrayList<String> cities = new ArrayList<String>();
		cities.add("Vannes");
		cities.add("Nantes");
		cities.add("Plumelec");
		
		model.addAttribute("citiesFromMyController", cities);
			
//		Language
		ArrayList<String> langs = new ArrayList<String>();
		langs.add("Python");
		langs.add("Swift");
		langs.add("Java");
		
		model.addAttribute("langsFromMyController", langs);

		return "index.jsp";
	}
	
	
	@RequestMapping("/result")
	public String result(Model model, HttpSession session) {
		return "result.jsp";
	}
	
	@RequestMapping(value="/process", method=RequestMethod.POST)
	public String process(
		@RequestParam(value="name") String name, 
		@RequestParam(value="city") String city, 
		@RequestParam(value="language") String language, 
		@RequestParam(value="comment") String comment) {
		// ... process information and save it to the session
		
		
//		name = session.setAttribute("name", name); 
			  	System.out.println(language);
		return "redirect:/result.jsp";
	}
	
	
}
