package com.github.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.github.AppConfig;
import com.github.dao.converter.UserMapper;
import com.github.model.User;

@Repository
public class UserDAOImpl {

	private final String SQL_GET_ALL = "select * from user";
	private final AppConfig appConfig;

	@Autowired
	public UserDAOImpl(AppConfig appConfig) {
		this.appConfig = appConfig;
	}

	public List<User> getAllUsers1() {
		return appConfig.getJdbcTemplateDS1().query(SQL_GET_ALL, new UserMapper());
	}

	public List<User> getAllUsers2() {
		return appConfig.getJdbcTemplateDS2().query(SQL_GET_ALL, new UserMapper());
	}

}
