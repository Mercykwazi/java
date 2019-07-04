package com.mercy.storageApp.repository;

import com.mercy.storageApp.configuration.Database;
import com.mercy.storageApp.queries.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

//
@Repository
public class UserRepository {
    @Autowired
    private Database db;
   public User saveUser(User user) {
       final String sql = "insert into business_owner(id, email,password,username)"
              + "values(:id,:email,:password,:username)";
//        KeyHolder holder = new GeneratedKeyHolder();
//        SqlParameterSource param = new MapSqlParameterSource()
//                .addValue("id", user.getId())
//                .addValue("email", user.getEmail())
//                .addValue("password", user.getPassword())
//                .addValue("username", user.getUsername());
//        template.update(sql, param, holder);
//    }


    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

            System.out.println("password" + user.getPassword());

            user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));

            try {
        PreparedStatement pstmt = db.connect().prepareStatement(sql,
                Statement.RETURN_GENERATED_KEYS);
        pstmt.setString(1, user.getEmail());
        pstmt.setString(2, user.getPassword());
        pstmt.setString(3, user.getUsername());
        pstmt.executeUpdate();

    } catch (Exception ex) {
        System.out.println(ex.getMessage());
    }

            return this.findUserByUserName(user.getUsername());
}


    public User findUserByUserName(String name) {
        String sql = "SELECT * FROM business_owners WHERE user_name=(?);";
        User newUser = new User();

        try {
            PreparedStatement st = db.connect().prepareStatement(sql);
            st.setString(1, name);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                System.out.println("result " + rs.getInt(1) +  " "+rs.getString(2) +" "  +rs.getString(3)+ "" + rs.getString(4));

                newUser.setId(rs.getInt(1));
                newUser.setEmail(rs.getString(2));
                newUser.setPassword(rs.getString(3));
                newUser.setUsername(rs.getString(4));

            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return newUser;
    }
}



