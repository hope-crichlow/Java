package com.hope.red.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hope.red.models.User;
import com.hope.red.services.UserService;
import com.hope.red.validator.UserValidator;

@Controller
public class UserController {
	@Autowired
	private UserService userServ;
	
	@Autowired
	private UserValidator userValidator;
	
	@GetMapping("/registration")
    public String registerForm(@ModelAttribute("userObj") User emptyUser) {
        return "regPage.jsp";
    }
    @GetMapping("/login")
    public String login() {
        return "loginPage.jsp";
    }
    
    
    @PostMapping("/registration")
    public String registerUser(
    		@Valid @ModelAttribute("userObj") User filledUser, BindingResult result, 
    		HttpSession session
    ) {
    	userValidator.validate(filledUser, result);
        // If result has errors, basic errors populate
    	if(result.hasErrors()) {
    		return "regPage.jsp";
    	}
        // Else, save the user in the database, save the user id in session, and redirect them to the /home route
    	else {
    		User newUser = userServ.registerUser(filledUser);
    		session.setAttribute("user_id", newUser.getId());
    		return "redirect:/home";
    	}
    }
    
    @PostMapping("/login")
    public String loginUser(
    		@RequestParam("email") String email, @RequestParam("password") String password, 
    		Model model, 
    		HttpSession session,
    		RedirectAttributes flashMessages
    ) {
        // If the user is authenticated, save their user id and email in session
    	if(userServ.authenticateUser(email, password)) {
    		User loggedUser = userServ.findByEmail(email);
    		session.setAttribute("user_id", loggedUser.getId());
    		return "redirect:/home";
    	}
        // Else, add error messages and return the login page
    	else {
    		flashMessages.addFlashAttribute("error", "Invalid Login");
    		return "redirect:/login";
    	}
    }
   
    @GetMapping("/home")
    public String home(
    		HttpSession session,
    		Model model
    ) {
    	// USE ID STORED IN SESSION TO ACCESS USER OBJECT IN ORDER TO USE PROPERTIES THROUGHOUT APP
    	Long currentUserId = (Long) session.getAttribute("user_id");
    	User currentUser = userServ.findUserById(currentUserId);
    		// Pass user object to JSP 
    	model.addAttribute("currentUser", currentUser);
    	
    	return "index.jsp";
    }
    
    @GetMapping("/logout")
	public String logout(HttpSession session) {
	    session.invalidate();
	    return "redirect:/login";
	}

	
}