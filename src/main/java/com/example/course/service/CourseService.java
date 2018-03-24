package com.example.course.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CourseService  {

	@Autowired
	private CourseRepository courseRepository;

	
	public List<Course> getAllCourses(String id){
		//return topics;S
		List<Course> courseList=new ArrayList<>();
		courseRepository.findByTopicId(id).forEach(courseList::add);
		return courseList;
		}

	public Course getCourse(String id) {
		List<Course> courseList=new ArrayList<>();
		courseRepository.findAll().forEach(courseList::add);
		return courseList.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

	public void addCourse(Course course) {
		//topics.add(topic);
		courseRepository.save(course);
	}

	/*public void updateTopic(Topic topic, String id) {
		for (Topic t:topics) {
			if(t.getId().equals(id)) {
				t.setTopicName(topic.getTopicName());//(topic.getdecript());
				t.setId(topic.getId());
				t.setdecript(topic.getdecript());
				return;
			}*/
		//}
		
	//}
	
}
