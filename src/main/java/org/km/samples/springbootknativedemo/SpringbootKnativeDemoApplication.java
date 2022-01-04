package org.km.samples.springbootknativedemo;

import org.km.samples.springbootknativedemo.domain.Employee;
import org.km.samples.springbootknativedemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class SpringbootKnativeDemoApplication implements ApplicationListener<ApplicationReadyEvent>{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootKnativeDemoApplication.class, args);
	}

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
		if (employeeRepository.count() == 0) {
			employeeRepository.save(new Employee(null, "JERIL", "MANJA", 30, "MUMBAI"));
			employeeRepository.save(new Employee(null, "KOUSHIK", "MAITI", 32, "PUNE"));
			
		}
	}

}
