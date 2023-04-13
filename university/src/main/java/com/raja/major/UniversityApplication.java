package com.raja.major;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
//@PropertySources({
//	@PropertySource({"file:D:\\Java SpringBoot EcommProjcet\\university\\src\\main\\resources\\application.properties"})
//})
public class UniversityApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniversityApplication.class, args);
	}

}
