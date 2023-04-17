package com.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;

@SpringBootApplication
public class Ex19LoginJoinApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(Ex19LoginJoinApplication.class);
		application.addListeners(new ApplicationPidFileWriter());
		//SpringApplication.run(Ex19LoginJoinApplication.class, args);
		application.run(args);
	}

}
