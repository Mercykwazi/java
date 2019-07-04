package com.mercy.storageApp.security;

import com.mercy.storageApp.queries.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Component;

@Component
public class JwtValidator {


    private String secret = "youtube";

    public User validate(String token) {

        User jwtUser = null;
        try {
            Claims body = Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token)
                    .getBody();

            jwtUser = new User();
            jwtUser.setUsername(body.getSubject());

            jwtUser.setId(Long.parseLong((String) body.get("userId")));
            jwtUser.setEmail((String) body.get("email"));
        } catch ( Exception e ) {
            System.out.println(e);
        }

        return jwtUser;
    }
}

