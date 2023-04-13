package com.raja.major;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroServiceEurekServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceEurekServerApplication.class, args);
	}

}
