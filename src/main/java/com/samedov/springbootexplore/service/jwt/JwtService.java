package com.samedov.springbootexplore.service.jwt;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class JwtService {
	
	private final JwtProperties jwtProperties;
	
	@Autowired
	public JwtService(JwtProperties jwtProperties) {
		this.jwtProperties = jwtProperties;
	}
	
	public String generateToken(String username) {
		return Jwts.builder()
				.setSubject(username)
				.setExpiration(new Date(System.currentTimeMillis() + jwtProperties.getExpirationTime()))
				.signWith(SignatureAlgorithm.HS512, jwtProperties.getSecret())
				.compact();
	}
	
	public String getUsernameFromToken(String token) {
		return Jwts.parser()
				.setSigningKey(jwtProperties.getSecret())
				.parseClaimsJws(token)
				.getBody()
				.getSubject();
	}
	
	public boolean validateToken(String token) {
		try {
			Jwts.parser().setSigningKey(jwtProperties.getSecret()).parseClaimsJws(token);
			return true;
		} catch (JwtException | IllegalArgumentException e) {
			return false;
		}
	}
}
