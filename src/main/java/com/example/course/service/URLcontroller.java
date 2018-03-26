package com.example.course.service;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class URLcontroller {

	@Autowired
	private FBUserService fbService;

	@RequestMapping(value = "/url/", method = RequestMethod.POST)
	public String findinDB(@RequestBody String Url) {
		// URL url=new URL(Url);
		// System.out.println("URL: "+url.getProtocol()+" "+url.getPath());
		System.out.println(Url);
		FacebookUser u = new FacebookUser();
		u.setCatalogueNo(22521452);
		u.setName("");
		u.setGender("");
		FacebookUser newUser = new FacebookUser();
		StringBuilder urlOfLandingPage=new StringBuilder("https://pe.eaton.com/");
		
		newUser = fbService.checkUserInDB(u);
		if(newUser!=null) {
			if(newUser.getCatalogueNo()!=0) {
				urlOfLandingPage.append("c?="+newUser.getCatalogueNo());
			}
			if(!(newUser.getGender()==null || newUser.getGender().equals(""))) {
				urlOfLandingPage.append("sku."+newUser.getCatalogueNo());
			}
		}
		System.out.println(urlOfLandingPage);
		return urlOfLandingPage.toString();
	}
}