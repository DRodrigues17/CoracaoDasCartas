package com.drodrigues17.coracaodascartas.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.function.Function;

@Service
public class JwtService {

    @Value("CHAVE_SECRETA")
    private String SECRET_KEY;

    public String extrairEmail(String jwt) {
        return extrairDeclaracao(jwt, Claims::getSubject);
    }

    private  <T> T extrairDeclaracao(String token, Function<Claims, T> claimResolver){
        return claimResolver.apply(extrairTodasDeclaracoes(token));
    }

    private Claims extrairTodasDeclaracoes(String token){
        return Jwts
                .parserBuilder()
                .setSigningKey(getSigningKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    private Key getSigningKey() {
        byte [] keyBytes = Decoders.BASE64.decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(keyBytes);
    }
}
