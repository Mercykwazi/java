package com.mercy.storageApp.repository;

import com.mercy.storageApp.querries.Address;
import com.mercy.storageApp.service.LocationRowMapper;
import com.mercy.storageApp.service.LocationService;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AddressRepository implements LocationService {

    public AddressRepository(NamedParameterJdbcTemplate template) {

        this.template = template;
    }

    NamedParameterJdbcTemplate template;

    public List<Address> findAll() {

        return template.query("select * from location", new LocationRowMapper());
    }


    public void insertLocation(Address loc) {
        final String sql = "insert into location(id, address1 , address2,country,business_id) " +
                "values(:id,:address1,:address2,:country,:business_id)";
        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("id", loc.getId())
                .addValue("address1", loc.getAddress1())
                .addValue("address2", loc.getAddress2())
                .addValue("country", loc.getCountry())
                .addValue("business_id", loc.getBusinessId());
        template.update(sql, param, holder);
    }

}