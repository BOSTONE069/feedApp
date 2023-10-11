package com.bptn.feedapp.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<UserBean>  {

	@Override
	public UserBean mapRow(ResultSet rs, int rowNum) throws SQLException {

		/* Create a UserBean object*/
		UserBean users = new UserBean();
		
		/* Populates the UserBean object with data from the resultSet */
		users.setUserId(rs.getInt("userId"));
		users.setFirstName(rs.getString("firstName"));
		users.setLastName(rs.getString("lastName"));
		users.setUsername(rs.getString("username"));
		users.setPassword(rs.getString("password"));
		users.setPhone(rs.getString("phone"));
		users.setEmailId(rs.getString("emailId"));
		users.setEmailVerified(rs.getBoolean("emailVerified"));
		users.setCreatedOn(rs.getTimestamp("createdOn"));
		
		/* Return the populated UserBean object */
		return users;
	}

}
