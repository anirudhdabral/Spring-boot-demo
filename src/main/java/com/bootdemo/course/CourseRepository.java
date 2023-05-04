package com.bootdemo.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

//@Repository
public interface CourseRepository extends CrudRepository<Course, String> {
	public List<Course> findByTopicId(String topicId);

}
