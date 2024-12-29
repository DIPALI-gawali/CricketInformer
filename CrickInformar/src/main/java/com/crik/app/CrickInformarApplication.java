package com.crik.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.crik.app.Service")
public class CrickInformarApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrickInformarApplication.class, args);
	}

}
