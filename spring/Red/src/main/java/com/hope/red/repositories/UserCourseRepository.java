package com.hope.red.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hope.red.models.UserCourse;

@Repository
public interface UserCourseRepository extends CrudRepository<UserCourse, Long> {
	List<UserCourse> findAll();
}
