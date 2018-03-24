package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.ws.spi.http.HttpContext;

import org.hibernate.validator.constraints.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpRequest;
import org.springframework.test.web.reactive.server.WebTestClient.RequestBodyUriSpec;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.service.Course;
import com.example.course.service.CourseService;
import com.example.course.service.Topic;
import com.example.course.service.TopicService;
@EnableAutoConfiguration
@RestController
public class CourseController {
	@Autowired
	private CourseService courseService;

	@RequestMapping(value = "/topics/{id}/courses", method = RequestMethod.GET)
	public List<Course> listCourses(@PathVariable String id) {
		return courseService.getAllCourses(id);

	}

	@RequestMapping("/topics/{id}/courses/{courseid}")
	public Course getCourse(@PathVariable String id,@URL String url) {
	
		return courseService.getCourse(id);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/topics/{topicid}/courses")
	public void addCourse(@RequestBody Course course) {
	
		courseService.addCourse(course);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicid}/courses/{id}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable String id) {
	//	topicService.updateTopic(topic,id);
	}
}