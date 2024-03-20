package com.mediremind.mediremind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = (SecurityAutoConfiguration.class))
public class MediremindApplication {

	public static void main(String[] args) {
		SpringApplication.run(MediremindApplication.class, args);
	}

}
