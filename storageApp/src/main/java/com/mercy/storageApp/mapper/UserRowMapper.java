package com.mercy.storageApp.mapper;

import com.mercy.storageApp.queries.User;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
@Service
public class UserRowMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs, int arg1) throws SQLException {

        User user = new User();
        user.setId(rs.getLong("id"));
        user.setUsername(rs.getString("email"));
        user.setEmail(rs.getString("password"));
        user.setPassword(rs.getString("username"));

        return user;
    }
}

