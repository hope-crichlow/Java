package com.hope.red.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hope.red.models.UserCourse;
import com.hope.red.repositories.UserCourseRepository;

@Service
public class UserCourseService {
	
	@Autowired
	private UserCourseRepository userCourseRepo;
	
	// CREATE NEW USERCOURSE RELATIONSHIP 
	public UserCourse saveUserCourse(UserCourse uc) {
		return userCourseRepo.save(uc);
	}

}
