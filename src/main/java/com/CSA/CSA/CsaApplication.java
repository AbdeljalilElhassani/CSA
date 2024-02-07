package com.CSA.CSA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication(scanBasePackages = {"com.CSA.CSA", "entities"})
@EntityScan(basePackages = {"entities"})
//@EntityScan(basePackages = {"com.CSA.CSA", "entities"})
@EnableJpaRepositories(basePackages = "com.CSA.CSA.Controller")

public class CsaApplication implements WebMvcConfigurer {
	public static void main(String[] args) {
		SpringApplication.run(CsaApplication.class);
	}

}

