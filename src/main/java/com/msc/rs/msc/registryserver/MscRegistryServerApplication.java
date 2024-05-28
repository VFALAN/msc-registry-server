package com.msc.rs.msc.registryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MscRegistryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MscRegistryServerApplication.class, args);
	}

}
