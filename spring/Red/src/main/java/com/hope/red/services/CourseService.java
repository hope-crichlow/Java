package com.hope.red.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hope.red.models.Course;
import com.hope.red.repositories.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepo;
	
// -------------------- CRUD COURSES ---------------------------//

	// CREATE NEW COURSE
	public Course saveCourse(Course c) {
		return courseRepo.save(c);
	}
	
	// FIND ALL COURSES 
	public List<Course> allCourses(){
		return courseRepo.findAll();
	}

	// FIND ONE COURSE 
	public Course findOneCourse(Long id) {
		return courseRepo.findById(id).orElse(null);
	}
	
	// DELETE COURSE
		public void deleteCourse(Long id) {
			courseRepo.deleteById(id);
		}
}
