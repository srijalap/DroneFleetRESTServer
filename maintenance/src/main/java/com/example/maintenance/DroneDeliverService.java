package com.example.maintenance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DroneDeliverService {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DroneDeliverService.class, args);
		System.out.println("This is Drone Deliver Service.");



	}
}
