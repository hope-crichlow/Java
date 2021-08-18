package com.hope.dojosandninjas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.hope.dojosandninjas.models.Dojo;
import com.hope.dojosandninjas.models.Ninja;
import com.hope.dojosandninjas.services.MainService;

@Controller
public class MainController {

	
	@Autowired
	private MainService mainServ;
	
	// INDEX PAGE - MAKE A NEW DOJO, DISPLAY DOJOS
	@GetMapping("/")
	public String index(@ModelAttribute("dojoObj") Dojo emptyDojo,
						Model model) {
		
		// DISPLAY ALL DOJOS 
			// Grab all Dojos from DB
		List<Dojo> allDojos = mainServ.allDojos();
			// Pass list of Dojos to jsp
		model.addAttribute("listOfDojos", allDojos);
		
		return "index.jsp";
	}
	// FORM CREATES NEW DOJO
	@PostMapping("/dojo/new")
	public String createDojo(@ModelAttribute("dojoObj") Dojo filledDojo) {
		mainServ.saveDojo(filledDojo);
		return "redirect:/";
	}
	// URL GIVEN IN ASSIGNMENT REROUTES TO "/"
	@GetMapping("/dojos/new")
	public String newDojo() {
		return "redirect:/";
	}
	
	
	// NEW NINJA PAGE - MAKE A NEW NINJA WITH REFERENCE TO DOJO SELECTED FROM THE PROVIDED LIST
	@GetMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("ninjaObj") Ninja emptyNinja,
							Model model) {
		// DISPLAY ALL DOJOS 
			// Grab all Dojos from DB
		List<Dojo> allDojos = mainServ.allDojos();
			// Pass list of Dojos to jsp
		model.addAttribute("listOfDojos", allDojos);
		
		return "newNinja.jsp";
	}
	
	
}
