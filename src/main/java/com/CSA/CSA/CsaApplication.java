package com.CSA.CSA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = {"com.CSA.CSA", "entities"})
@EntityScan(basePackages = {"com.CSA.CSA", "entities"})
public class CsaApplication {
	public static void main(String[] args) {
		SpringApplication.run(CsaApplication.class, args);
	}
}
