package com.javatpoint.microservices.netflixeurekanamingserver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@SpringBootApplication
@EnableEurekaServer
public class NetflixEurekaNamingServerApplication{
	public static void main(String[] args) {
		SpringApplication.run(NetflixEurekaNamingServerApplication.class, args);
		System.out.println("NetflixEurekaNamingServerApplication start...");
	}
}
//URL
//http://localhost:8761.