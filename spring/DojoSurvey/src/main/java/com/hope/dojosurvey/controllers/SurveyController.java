package com.hope.dojosurvey.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SurveyController {
	
	@RequestMapping("/")
	public String index(Model model) {
		
		String testing = "Sunshine";
		model.addAttribute("test", testing);
		
//		Location
		ArrayList<String> dojos = new ArrayList<String>();
		dojos.add("Vannes");
		dojos.add("Nantes");
		dojos.add("Plumelec");
		
		model.addAttribute("dojosFromMyController", dojos);
		
		
//		String location1 = "Vannes";
//		String location2 = "Nantes";
//		String location3 = "Plumelec";
		
//		model.addAttribute("local1", location1);
//		model.addAttribute("local2", location2);
//		model.addAttribute("local3", location3);
//		
//		Language
		String language1 = "Python";
		String language2 = "Java";
		String language3 = "Swift";
		
		
		model.addAttribute("lang1", language1);
		model.addAttribute("lang2", language2);
		model.addAttribute("lang3", language3);
		
		
		return "index.jsp";
	}
	
}
