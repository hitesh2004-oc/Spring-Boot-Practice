package com.app.util;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtil {

    private static final String SECRET =
            "TestAppOneSampleTestAppOneSample";

    public String generateToken(String username) {

        return Jwts.builder()
                .setSubject(username)
                .setIssuer("HiteshMalviya")
                .setIssuedAt(new Date())
                .setExpiration(
                        new Date(System.currentTimeMillis()
                                + TimeUnit.MINUTES.toMillis(10)))
                .signWith(
                        SignatureAlgorithm.HS256,
                        SECRET.getBytes())
                .compact();
      
    }

    public String extractUsername(String token) {

        Claims claims =
                Jwts.parser()
                        .setSigningKey(SECRET.getBytes())
                        .parseClaimsJws(token)
                        .getBody();

        return claims.getSubject();
    }

    public boolean validateToken(String token) {

        try {

            Jwts.parser()
                    .setSigningKey(SECRET.getBytes())
                    .parseClaimsJws(token);

            return true;

        } catch (Exception e) {

            return false;
        }
    }
}