package com.example.course.service;

import org.springframework.data.repository.CrudRepository;

public interface FBUserRepository extends CrudRepository<FacebookUser,String> {
	FacebookUser findByCatalogueNo(int catalogueNo);
	FacebookUser findByGender(String Gender);
	FacebookUser findByName(String name);
}
