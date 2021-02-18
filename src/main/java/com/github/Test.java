package com.github;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.github.repository.UserRepository;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserRepository userRepository = context.getBean(UserRepository.class);
		userRepository.findAll();
		System.out.println("Teste");
	}

}
