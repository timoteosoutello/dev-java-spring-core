package com.github;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.github.dao.UserDAOImpl;
import com.github.model.User;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserDAOImpl userRepository = context.getBean(UserDAOImpl.class);
		List<User> users = userRepository.getAllUsers1();
		List<User> users2 = userRepository.getAllUsers2();
	}

}
