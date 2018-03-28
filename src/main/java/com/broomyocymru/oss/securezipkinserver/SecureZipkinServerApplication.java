package com.broomyocymru.oss.securezipkinserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class SecureZipkinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecureZipkinServerApplication.class, args);
	}
}
