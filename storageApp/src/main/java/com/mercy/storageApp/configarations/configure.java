package com.mercy.storageApp.configarations;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.security.Key;

// We need a signing key, so we'll create one just for this example. Usually
// the key would be read from your application configuration instead.
public class configure {
    Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
    String jws = Jwts.builder().setSubject("Joe").signWith(key).compact();
}