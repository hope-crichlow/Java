package com.hope.red.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hope.red.models.Course;
import com.hope.red.models.User;
import com.hope.red.models.UserCourse;
import com.hope.red.services.CourseService;
import com.hope.red.services.UserCourseService;
import com.hope.red.services.UserService;
import com.hope.red.validator.UserValidator;

@Controller
public class MainController {
	@Autowired
	private UserService userServ;
	
	@Autowired
	private CourseService courseServ;
	
	@Autowired
	private UserCourseService userCourseServ;
	
	@Autowired
	private UserValidator userValidator;
	// -------------------- LOGIN & REGISTRATION PAGES ---------------------------//
	
	// REG PAGE
	@GetMapping("/registration")
    public String registerForm(@ModelAttribute("userObj") User emptyUser) {
        return "regPage.jsp";
    }
	// LOGIN PAGE
    @GetMapping("/login")
    public String login() {
        return "loginPage.jsp";
    }
    // BASE ROUTE RENDERS LOGIN PAGE
    @GetMapping("/")
    public String base() {
        return "loginPage.jsp";
    }
    // REG FORM
    @PostMapping("/registration")
    public String registerUser(
    		@Valid @ModelAttribute("userObj") User filledUser, 
    		BindingResult result, 
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
    		return "redirect:/courses";
    	}
    }
    // LOGIN FORM
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
    		return "redirect:/courses";
    	}
        // Else, add error messages and return the login page
    	else {
    		flashMessages.addFlashAttribute("error", "Invalid Login");
    		return "redirect:/login";
    	}
    }
 // -------------------- COURSES ---------------------------//
    
    // DASHBOARD -  LIST  OF COURSES
    @GetMapping("/courses")
    public String home(
    		@ModelAttribute("userCourseObj") UserCourse emptyUserCourse,
    		HttpSession session,
    		Model model
    ) {
    	// USE ID STORED IN SESSION TO ACCESS USER OBJECT IN ORDER TO USE PROPERTIES THROUGHOUT APP
    	Long currentUserId = (Long) session.getAttribute("user_id");
    	User currentUser = userServ.findUserById(currentUserId);
    		// Pass user object to JSP 
    	model.addAttribute("currentUser", currentUser);
    	
    	// DISPLAY ALL COURSES
    		// Grab all Courses from DB
    	List<Course> allCourses = courseServ.allCourses();
    		// Pass list of Courses to JSP 
    	model.addAttribute("listOfCourses", allCourses);
    	
    	return "index.jsp";
    }
    
    // DASHBOARD - JOIN COURSE
    @PostMapping("/join/process")
    public String joinCourse(
    		@ModelAttribute("userCourseObj") UserCourse filledUserCourse,
    		HttpSession session,
    		BindingResult result, 
    		Model model
    		
    ) {
    	Long currentUserId = (Long) session.getAttribute("user_id");
    	User currentUser = userServ.findUserById(currentUserId);
 		// Pass user object to JSP 
    	model.addAttribute("currentUser", currentUser);
    	
    	userCourseServ.saveUserCourse(filledUserCourse);
    	return "redirect:/courses/" + filledUserCourse.getCourse().getId();
    }
    
    // NEW COURSE PAGE
    @GetMapping("/courses/new")
    public String newCourse(
    		@ModelAttribute("courseObj") Course emptyCourse
    ) {
    	return "newCourse.jsp";
    }
    
    // NEW COURSE FORM
    @PostMapping("/courses/new")
    public String createCourse(
    		@Valid @ModelAttribute("courseObj") Course filledCourse,
    		BindingResult result
    ) {
    	if(result.hasErrors()) {
    		return "newCourse.jsp";
    	}
        // Else, save the course in the database
    	else {
    	courseServ.saveCourse(filledCourse);
    	return "redirect:/courses";
    	}
    }
    
    // EDIT COURSE PAGE
    @GetMapping("/courses/{id}/edit")
    public String editCourse(
    		@PathVariable("id") Long id, 
    		Model model
    ) {
    	// GRAB ONE COURSE FROM DB
    	Course oneCourse = courseServ.findOneCourse(id);
    	
    	// PASS COURSE TO THE JSP 
    	model.addAttribute("courseObj", oneCourse);
    	return "editCourse.jsp";
    }
    // EDIT COURSE FORM
    @PutMapping("/courses/{id}/edit")
	public String updateCourse(
			 @Valid @ModelAttribute("courseObj") Course filledCourse, 
			 BindingResult results
	) {
		// VALIDATIONS FAIL, RERENDER THE JSP
		if(results.hasErrors()) {
			return "editCourse.jsp";
		}
		// VALIDATIONS PASS, UPDATE LANGUAGE
		else {
			courseServ.saveCourse(filledCourse);
			return "redirect:/courses";
		}
	 }
    
    // DISPLAY COURSE
    @GetMapping("/courses/{id}")
    public String viewCourse(
    		@PathVariable("id") Long id,
    		Model model
    ) {
    	// GRAB ONE COURSE FROM DB
    	Course oneCourse = courseServ.findOneCourse(id);
    	List<UserCourse> allMembers = oneCourse.getMembers();
    	
    	// PASS COURSE TO THE JSP 
    	model.addAttribute("courseObj", oneCourse);
    	model.addAttribute("listOfMembers", allMembers);
    	System.out.println(oneCourse.getMembers());
    	
    	
    	return "viewCourse.jsp";
    }
    
    // DELETE COURSE
    @GetMapping("/{id}/delete")
    public String deleteCourse(
    		@PathVariable("id") Long id
    ) {
    	// GRAB RELATIONSHIP FROM DB
    	courseServ.deleteCourse(id);
    	
    	return "redirect:/courses";
    }
    
    // REMOVE PERSON FROM COURSE
    @GetMapping("/{id}/remove")
    public String removeStudent(
    		@PathVariable("id") Long id
    ) {
    	// GRAB RELATIONSHIP FROM DB
    	userCourseServ.deleteUC(id);
    	
    	return "redirect:/courses";
    }
    
 // -------------------- LOGOUT FUNCTIONALITY ---------------------------//
    @GetMapping("/logout")
	public String logout(HttpSession session) {
	    session.invalidate();
	    return "redirect:/login";
	}

	
}