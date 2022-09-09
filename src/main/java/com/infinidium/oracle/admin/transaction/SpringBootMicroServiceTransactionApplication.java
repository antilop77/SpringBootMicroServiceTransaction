package com.infinidium.oracle.admin.transaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class SpringBootMicroServiceTransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroServiceTransactionApplication.class, args);
	}

}
