package com.mercy.storageApp.repositary;
import com.mercy.storageApp.querries.Location;
import com.mercy.storageApp.service.LocationRowMapper;
import com.mercy.storageApp.service.LocationService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LocationRepositary implements LocationService {

    public LocationRepositary(NamedParameterJdbcTemplate template) {

        this.template = template;
    }
    NamedParameterJdbcTemplate template;

    //  @Override
    public List<Location> findAll() {
       List<Location>  t =template.query("select * from location", new LocationRowMapper());
        System.out.println("wht is tttttt"+ t);
        return template.query("select * from location", new LocationRowMapper());
    }

    //       @Override
    public void insertLocation(Location loc){
        final String sql = "insert into location(id, address1 , address2,country,business_id) " +
                "values(:id,:address1,:address2,:country,:business_id)";
       // System.out.println("what is this string"+ sql);
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