package com.learningJPA.JpaLearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learningJPA.JpaLearn.entity.User;
import com.learningJPA.JpaLearn.service.UseeDaoService;

@Component 
public class UserDaoServiceCommandLineRunner implements CommandLineRunner{

	private static final Logger log= LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	
	@Autowired
	private UseeDaoService userDaoService;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//save user here
		
		User user = new User("Rahul", "Admin");
		long insert = userDaoService.insert(user);
		log.info("New User is created "+user+"return "+insert);
	}

}
