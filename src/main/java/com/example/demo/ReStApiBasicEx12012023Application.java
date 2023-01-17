package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReStApiBasicEx12012023Application {


private static Integer NOOFTRANSACTIONS=100;

private static final String url = "https://localhost:9890/employee/save";


	public static void main(String[] args) {
		SpringApplication.run(ReStApiBasicEx12012023Application.class, args);
	}

}
