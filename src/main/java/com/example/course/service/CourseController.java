package com.example.course.service;

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

import com.example.demo.service.Topic;
import com.example.demo.service.TopicService;
@EnableAutoConfiguration
@RestController
public class CourseController {
	@Autowired
	private TopicService topicService;

	@RequestMapping(value = "/topics", method = RequestMethod.GET)

	public List<Topic> listProducts() {
		return topicService.getAllTopics();

	}

	@RequestMapping("topics/{id}")
	public Topic getTopic(@PathVariable String id,@URL String url) {
		System.out.println("TEsting : "+url);
		return topicService.getTopic(id);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopic(@RequestBody Topic topic) {
	
		topicService.addTopic(topic);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable String id) {
	//	topicService.updateTopic(topic,id);
	}
}