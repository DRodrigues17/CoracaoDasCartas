package com.drodrigues17.coracaodascartas.config.security;

import com.drodrigues17.coracaodascartas.service.JwtService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
@RequiredArgsConstructor
public class JwtAuthFilter extends OncePerRequestFilter {

    private  final JwtService jwtService;

    @Override
    protected void doFilterInternal(
            @NonNull HttpServletRequest request,
            @NonNull HttpServletResponse response,
            @NonNull FilterChain filterChain
    ) throws ServletException, IOException {
        final String headerAutenticacao = request.getHeader("Authorization");
        final String jwt;
        final String email;

        if (headerAutenticacao == null ||! headerAutenticacao.startsWith("Bearer ")){
            filterChain.doFilter(request, response);
        }
        jwt =  headerAutenticacao.substring(7);
        email = jwtService.extrairEmail(jwt);
    }
}
