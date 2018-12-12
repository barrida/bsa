package com.nhs.bsa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@ComponentScan({"com.nhs.bsa","com.nhs.bsa.controller","com.nhs.bsa.entity","com.nhs.bsa.repository", "com.nhs.bsa.validator"})
public class BsaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BsaApplication.class, args);
	}
}