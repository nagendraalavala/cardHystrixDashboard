package com.card.cardhystrixDashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrixDashboard
public class CardhystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardhystrixDashboardApplication.class, args);
	}

}
