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
// COMMENTING CAUSE NEW IMPLEMENTATION DONE
//		
//		User user = new User("Rahul", "Admin");
//		long insert = userDaoService.insert(user);
//		log.info("New User is created "+user+"return "+insert);
//
//		User user1 = new User("Kiran", "User");
//		long insert1 = userDaoService.insert(user1);
//		log.info("New User is created "+user1+"return "+insert1);
//
//		User user2 = new User("Ravikiran", "User");
//		long insert2 = userDaoService.insert(user2);
//		log.info("New User is created "+user2+"return "+insert2);
//
//		User user3 = new User("Thor", "Hero");
//		long insert3 = userDaoService.insert(user3);
//		log.info("New User is created "+user3+"return "+insert3);
//
//		User user4 = new User("CpnAmerica", "Hero");
//		long insert4 = userDaoService.insert(user4);
//		log.info("New User is created "+user4+"return "+insert4);
	}

}
