package com.learningJPA.JpaLearn;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learningJPA.JpaLearn.entity.User;
import com.learningJPA.JpaLearn.service.UserRepository;

@Component 
public class UserRepositoryCommandLineRunner implements CommandLineRunner{

	private static final Logger log= LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//save user here
		
		//Created users
		
		User user = new User("Rahul", "Admin");
		userRepository.save(user);
		log.info("New User is created "+user);

		User user1 = new User("Kiran", "User");
		userRepository.save(user1);
		log.info("New User is created "+user1);

		User user2 = new User("Ravikiran", "User");
		userRepository.save(user2);
		log.info("New User is created "+user2);

		User user3 = new User("Thor", "Hero");
		userRepository.save(user3);
		log.info("New User is created "+user3);

		User user4 = new User("CpnAmerica", "Hero");
		userRepository.save(user4);
		log.info("New User is created "+user4);
		
		//Read users 
		
		Optional<User> userWithID = userRepository.findById(2L);
		log.info("User of id "+2L+" is "+userWithID);
		
		List<User> all = userRepository.findAll();
		log.info("All Users :"+all);
		
		//Update User
		
		user.setName("Rahul R");
		userRepository.save(user);
		log.info("Updated user 1 name"+user);

		//Delete user
		
		userRepository.delete(user4);
		log.info("Deleted user 4");

	}

}
