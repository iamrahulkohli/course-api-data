package com.example.course.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TopicService  {

	@Autowired
	private TopicRepository topicRepository;

	
	public List<Topic> getAllTopics(){
		//return topics;
		List<Topic> topicsList=new ArrayList<>();
		topicRepository.findAll().forEach(topicsList::add);
		return topicsList;
		}

	public Topic getTopic(String id) {
		List<Topic> topicsList=new ArrayList<>();
		topicRepository.findAll().forEach(topicsList::add);
		return topicsList.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
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
