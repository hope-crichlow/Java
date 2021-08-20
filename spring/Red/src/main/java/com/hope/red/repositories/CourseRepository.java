package com.hope.red.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hope.red.models.Course;
import com.hope.red.models.User;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {
	List<Course> findAll();
	
	@Query("SELECT c FROM Course c")
	List<Course> allCourses();
	
	@Query("SELECT c FROM Course c WHERE c.id NOT IN (SELECT uc.course FROM UserCourse uc WHERE uc.user = ?1 ) ")
	List<Course> groupsExcludingUser(User u);
}