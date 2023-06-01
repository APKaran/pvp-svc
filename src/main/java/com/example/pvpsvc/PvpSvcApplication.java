package com.example.pvpsvc;

import com.example.pvpsvc.model.entity.CustomerEntity;
import com.example.pvpsvc.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class PvpSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(PvpSvcApplication.class, args);
	}

	@Bean
	public CommandLineRunner testApp(CustomerRepository repo) {
		return args -> {
			repo.save(new CustomerEntity("Hi", "Hello"));
			repo.save(new CustomerEntity("Hello", "Hi"));
			List<CustomerEntity> allStudents = repo.findAll();
			System.out.println("All students in DB: " + allStudents);
			List<CustomerEntity> james = repo.findByQueContainingIgnoreCase("Hi");
			System.out.println("James: " + james);
		};
	}

}
