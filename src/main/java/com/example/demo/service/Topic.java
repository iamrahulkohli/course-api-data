package com.example.demo.service;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Topic", schema = "system")
public class Topic {
@Id
private String id;
private String topicName;
private String decript;




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
public Topic() {
	super();
}


public Topic(String id, String topicName, String decript) {
	super();
	this.id = id;
	this.topicName = topicName;
	this.decript = decript;
}

}
