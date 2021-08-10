package com.hope.dojosurvey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SurveyController {
	@RequestMapping("/")
	public String index(Model model) {
		
		model.addAttribute("name", "Sunshine");
		return "index.jsp";
	}
}
