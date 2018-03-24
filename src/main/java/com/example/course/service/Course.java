package com.example.course.service;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name= "Course", schema = "system")
public class Course {
@Id
private String id;
private String topicName;
private String decript;
@ManyToOne
@JsonBackReference
private Topic topic;
public Course() {
	super();
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getTopicName() {
	return topicName;
}
public void setTopicName(String topicName) {
	this.topicName = topicName;
}
public String getdecript() {
	return decript;
}
public void setdecript(String decript) {
	this.decript = decript;
}


public Topic getTopic() {
	return topic;
}
public void setTopic(Topic topic) {
	this.topic = topic;
}
public Course(String id, String topicName, String decript, String topicid) {
	super();
	this.id = id;
	this.topicName = topicName;
	this.decript = decript;
	this.topic.setId(topicid);}



}
