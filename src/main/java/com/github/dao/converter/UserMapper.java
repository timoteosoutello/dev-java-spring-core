package com.github.dao.converter;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.github.model.User;

public class UserMapper implements RowMapper<User> {

	private final String FIELD_ID = "id";
	
	@Override
	public User mapRow(ResultSet rs, int i) throws SQLException {
		User user = new User();
		user.setId(rs.getString(FIELD_ID));
		return user;
	}

}
