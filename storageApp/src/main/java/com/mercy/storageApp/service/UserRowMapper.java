package com.mercy.storageApp.service;

import com.mercy.storageApp.querries.Location;
import com.mercy.storageApp.querries.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs, int arg1) throws SQLException {

        User user = new User();
        user.setId(rs.getInt("id"));
        user.setUsername(rs.getString("contact_name"));
        user.setEmail(rs.getString("contact_email"));
        user.setPassword(rs.getString("password"));

        return user;
    }
}

