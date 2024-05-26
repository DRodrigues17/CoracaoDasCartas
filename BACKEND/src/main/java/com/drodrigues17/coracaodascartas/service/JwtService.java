package com.drodrigues17.coracaodascartas.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@Service
public class JwtService {

    @Value("CHAVE_SECRETA")
    private String SECRET_KEY;

    public String extrairNome(String jwt) {
        return extrairDeclaracao(jwt, Claims::getSubject);
    }


    private <T> T extrairDeclaracao(String token, Function<Claims, T> claimResolver) {
        return claimResolver.apply(extrairTodasDeclaracoes(token));
    }

    public String gerarToken(UserDetails userDetails) {
        return gerarToken(new HashMap<>(), userDetails);
    }

    public String gerarToken(Map<String, Object> declaracoesExta, UserDetails userDetails) {
        return Jwts
                .builder()
                .setClaims(declaracoesExta)
                .setSubject(userDetails.getUsername())
                .setIssuedAt(new Date(System.currentTimeMillis()))//momento em que o token foi gerado
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 24))//momento de expiração, nesse caso seria 1 dia inteiro a partir
                .signWith(getSigningKey(), SignatureAlgorithm.HS256)
                .compact();
    }

    public boolean tokenValido(String token, UserDetails userDetails) {
        final String nome = extrairNome(token);
        return nome.equals(userDetails.getUsername()) && !estaExpirado(token);
    }

    private boolean estaExpirado(String token) {
        return extrairDeclaracao(token, Claims::getExpiration).before(new Date());
    }

    private Claims extrairTodasDeclaracoes(String token) {
        return Jwts
                .parserBuilder()
                .setSigningKey(getSigningKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    private Key getSigningKey() {
        byte[] keyBytes = Decoders.BASE64.decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(keyBytes);
    }
}
