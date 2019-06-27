package com.mercy.storageApp.repository;

import com.mercy.storageApp.querries.User;
import com.mercy.storageApp.service.UserService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

@Repository
public class UserRopository implements UserService {
    public UserRopository(NamedParameterJdbcTemplate template) {

        this.template = template;
    }
    NamedParameterJdbcTemplate template;



    public void insertOwnerDetails(User user){
        final String sql = "insert into business_owner(id, email,password,username)"
       + "values(:id,:email,:password,:username)";
        // System.out.println("what is this string"+ sql);
        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("id", user.getId())
                .addValue("email", user.getEmail())
                .addValue("password",user.getPassword())
                        .addValue("username",user.getUsername());

      //  System.out.println("waht"+template.update(sql, param, holder));

        template.update(sql, param, holder);
    }
}

