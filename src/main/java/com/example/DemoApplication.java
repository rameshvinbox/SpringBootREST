package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;

@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer {
	
	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	// Override the configure method from the SpringBootServletInitializer class
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DemoApplication.class);
    }
	
    /*
	@Bean
	public CommandLineRunner setup(EmployeeRepository employeeRepository) {
		return (args) -> {
			employeeRepository.save(new Employee("Ramesh", "Venkataramani", true));
			employeeRepository.save(new Employee("Prem", "Nandhi", true));
			employeeRepository.save(new Employee("Hari", "Gantla", true));
			employeeRepository.save(new Employee("Steve", "Morrison", false));
			employeeRepository.save(new Employee("David", "Baluchi", true));
			logger.info("The sample data has been generated");
		};
	}*/
}
