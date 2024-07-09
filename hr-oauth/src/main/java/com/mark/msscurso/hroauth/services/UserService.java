package com.mark.msscurso.hroauth.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mark.msscurso.hroauth.entities.User;
import com.mark.msscurso.hroauth.feignclients.UserFeignClient;

@Service
public class UserService {

	// Aqui foi criado esse logger pra facilitar os testes (de qual classe está
	// saindo o log, UserService), visualiza no console se o usuário foi localizado
	// ou não através do e-mail ...
	private static Logger logger = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private UserFeignClient userFeignClient;

	public User findByEmail(String email) {
		User user = userFeignClient.findByEmail(email).getBody();
		if (user == null) {
			logger.error("Email not found: " + email);
			throw new IllegalArgumentException("Email not found");
		}
		logger.info("Email found: " + email);
		return user;
	}
}