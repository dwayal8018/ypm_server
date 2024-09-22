package com.bluetech.protech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.bluetech.protech")
public class ProTechApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProTechApplication.class, args);
		System.out.println("Project started");
	}

}
