package com.example.course.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FBUserService {

	@Autowired
	private FBUserRepository repository;
	
	public FacebookUser checkUserInDB(FacebookUser user) {
//	ArrayList<FacebookUser> userslist=new ArrayList<>();
	FacebookUser userFromDB=new FacebookUser();
		if(user!=null) {
			if(user.getCatalogueNo()!=0) {
			System.out.println(user.getCatalogueNo());
			userFromDB=repository.findByCatalogueNo(user.getCatalogueNo());
			
			}
			if(!(user.getGender().equals("")||user.getGender().equals(null))) {
				userFromDB=repository.findByGender(user.getGender());
			}
			if(!(user.getName().equals("")||user.getName().equals(null))) {
				userFromDB=repository.findByName(user.getName());
			}
			
			
		}
		
		return userFromDB;
	}
}
