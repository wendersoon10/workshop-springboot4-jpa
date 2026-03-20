package com.wendersondev.springboot_jpa_workshop.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.wendersondev.springboot_jpa_workshop.entities.User;
import com.wendersondev.springboot_jpa_workshop.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Ana", "ana@gmail.com", "987654321","123456");
		User u2 = new User(null, "Alice", "alice@gmail.com", "198765432","123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}

}
