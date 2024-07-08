package com.mark.msscurso.hruser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HrUser1Application {

	public static void main(String[] args) {
		SpringApplication.run(HrUser1Application.class, args);
	}
}