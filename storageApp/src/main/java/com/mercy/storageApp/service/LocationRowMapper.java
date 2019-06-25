package com.mercy.storageApp.service;


import java.sql.ResultSet;
import java.sql.SQLException;

import com.mercy.storageApp.querries.Location;
import org.springframework.jdbc.core.RowMapper;


public class LocationRowMapper implements RowMapper<Location> {

    @Override
        public Location mapRow(ResultSet rs, int arg1) throws SQLException {

            Location loc = new Location();
            loc.setId(rs.getInt(arg1));
            loc.setAddress1(rs.getString("address1"));
            loc.setAddress2(rs.getString("address2"));
        loc.setCountry(rs.getString("country"));
        loc.setBusinessId(rs.getInt(arg1));
        return loc;
    }
}
