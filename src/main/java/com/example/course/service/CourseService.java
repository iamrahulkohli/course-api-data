package com.example.course.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CourseService  {

	@Autowired
	private CourseRepository topicRepository;

	
	public List<Course> getAllTopics(){
		//return topics;
		List<Course> topicsList=new ArrayList<>();
		topicRepository.findAll().forEach(topicsList::add);
		return topicsList;
		}

	public Course getTopic(String id) {
		List<Course> topicsList=new ArrayList<>();
		topicRepository.findAll().forEach(topicsList::add);
		return topicsList.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Course topic) {
		//topics.add(topic);
		topicRepository.save(topic);
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
