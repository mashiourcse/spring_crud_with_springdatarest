package com.mashcode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.mashcode.entity.Car;
import com.mashcode.entity.Owner;
import com.mashcode.repository.CarRepository;
import com.mashcode.repository.OwnerRepository;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class StarterProjectApplication implements CommandLineRunner{
	
	private static final Logger logger = LoggerFactory.getLogger(StarterProjectApplication.class);
	
	 @Autowired
	  CarRepository carRepository;
	 
	 @Autowired
	 OwnerRepository ownerRepository;

	 
	public static void main(String[] args) {
		SpringApplication.run(StarterProjectApplication.class, args);
		logger.info("Application rolling!!!!!!!");
		
	}
	
	
	public void run(String... args)throws Exception{
		
//		// Add owner objects and save these to db 
//				Owner owner1 = new Owner("John" , "Johnson");
//				Owner owner2 = new  Owner("Mary" , "Robinson");
//				ownerRepository.saveAll(Arrays.asList(owner1,owner2));
//				
//				// Add car object and link to owners and save these to db
//						Car car1 = new Car("Ford", "Mustang", "Red", 
//								"ADF-1121", 2021, 59000, owner1);
//						Car car2 = new Car("Nissan", "Leaf", "White", 
//								"SSJ-3002", 2019, 29000, owner2);
//						Car car3 = new Car("Toyota", "Prius", "Silver", 
//								"KKO-0212", 2020, 39000, owner2);
//						carRepository.saveAll(Arrays.asList(car1, car2, car3));
//				                  
//						for (Car car : carRepository.findAll()) {
//							logger.info(car.getBrand() + " " + car.getModel());
//						}
	}
}
