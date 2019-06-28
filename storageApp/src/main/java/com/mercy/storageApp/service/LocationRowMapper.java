package com.mercy.storageApp.service;


import java.sql.ResultSet;
import java.sql.SQLException;

import com.mercy.storageApp.querries.Address;
import org.springframework.jdbc.core.RowMapper;


public class LocationRowMapper implements RowMapper<Address> {

    @Override
    public Address mapRow(ResultSet rs, int arg1) throws SQLException {

        Address loc = new Address();

        loc.setId(rs.getInt("id"));
        loc.setAddress1(rs.getString("address1"));
        loc.setAddress2(rs.getString("address2"));
        loc.setCountry(rs.getString("country"));
        loc.setBusinessId(rs.getInt("businessId"));
        return loc;
    }
}
