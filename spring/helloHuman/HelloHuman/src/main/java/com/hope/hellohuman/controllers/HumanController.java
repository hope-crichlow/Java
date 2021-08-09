package com.hope.hellohuman.controllers;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HumanController {

	@RequestMapping("/")

	public String index() { 
		return "Hello Human!" + "<br><br><br>" + "Welcome to SpringBoot!";
	}

	@RequestMapping("/{name}")
	public String viewName(@PathVariable("name") String name) {
		System.out.println(name);
		return "Hello " + name + " !" +"<br><br><br>" + "Welcome to SpringBoot!" ;
	}

}
