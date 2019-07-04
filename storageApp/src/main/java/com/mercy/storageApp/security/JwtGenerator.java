package com.mercy.storageApp.security;

import com.mercy.storageApp.queries.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
//import org.omg.PortableInterceptor.USER_EXCEPTION;
import org.springframework.stereotype.Component;

@Component
public class JwtGenerator {
//JwtGenerator

    public String generate(User user) {


        Claims claims = Jwts.claims()
                .setSubject(user.getUsername());
        claims.put("userId", user.getId());
        claims.put("email", user.getEmail());


        return Jwts.builder()
                .setClaims(claims)
                .signWith(SignatureAlgorithm.HS512, "youtube")
                .compact();
    }
}




