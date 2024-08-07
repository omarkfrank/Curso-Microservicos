package com.mark.msscurso.hruser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableDiscoveryClient
@SpringBootApplication
public class HrUserApplication implements CommandLineRunner {

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(HrUserApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//System.out.println("BCRYPT = " + passwordEncoder.encode("123456")); Aqui esse metodo encode, vai pegar o valor string informado e vai gerar o HashBCrypt dele.
	}
}