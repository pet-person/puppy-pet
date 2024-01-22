package com.shop.puppyPet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class PuppyPetApplication {

	public static void main(String[] args) {
		SpringApplication.run(PuppyPetApplication.class, args);
	}

}
