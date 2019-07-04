package com.mercy.storageApp.queries;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
//import io.jsonwebtoken.impl.crypto.Mac;
import io.jsonwebtoken.impl.crypto.MacProvider;
import java.security.Key;
public class Jwt {
    Key key =  MacProvider.generateKey();
    String jws = Jwts.builder().setSubject("jjwt").signWith(SignatureAlgorithm.HS512, key).compact();
    public String getJws(){
        return this.jws;
    }

}
