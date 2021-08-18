package com.hope.dojosandninjas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
			// Pass list of Dojos to JSP
		model.addAttribute("listOfDojos", allDojos);
		
		return "index.jsp";
	}
	// FORM CREATES A NEW DOJO
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
	// FORM CREATES A NEW NINJA
	@PostMapping("ninja/new")
	public String createNinja(@ModelAttribute("ninjaObj") Ninja filledNinja) {
		mainServ.saveNinja(filledNinja);
		return "redirect:/";
	}
	
	// DOJO PAGE - DISPLAY ALL NINJAS IN THE SPECIFIED DOJO
	@GetMapping("/dojos/{id}")
	public String viewDojo(@PathVariable("id") Long dojo_id,
							Model model) {
		// DISPLAY ONE DOJO
			// Grab Dojo object from DB
		Dojo dojo = mainServ.findOneDojo(dojo_id);
			// pass Dojo object to JSP
		model.addAttribute("dojo", dojo);
		
		// DIPLAY LIST OF NINJAS IN DOJO
			// Grab list of ninjas from dojo object
		List<Ninja> ninjasInDojo = dojo.getNinjas();
			// pass list of ninjas to JSP
		model.addAttribute("listOfNinjas", ninjasInDojo);
		
		
		return "dojoPage.jsp";
	}
	
}
