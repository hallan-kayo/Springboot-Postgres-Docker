package com.project.springPostgreSQL;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.project.springPostgreSQL.model.User;
import com.project.springPostgreSQL.repositories.UserRepository;

@SpringBootApplication
public class SpringPostgreSqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPostgreSqlApplication.class, args);
	}

	@Bean
	CommandLineRunner run(UserRepository userRepository) {
		return args -> {
			User user = new User();
			user.setName("John Doe");
			user.setEmail("john.doe@example.com");
			userRepository.save(user);
		};
	}

}
