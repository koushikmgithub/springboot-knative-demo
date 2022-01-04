package org.km.samples.springbootknativedemo.controller;

import java.util.Optional;
import java.util.Set;

import org.km.samples.springbootknativedemo.domain.Employee;
import org.km.samples.springbootknativedemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/getEmployeeById")
    public Optional<Employee> getEmployeeById(@RequestParam("id") String id){
           return employeeService.getEmployeeById(id);
    }

    @PostMapping("/saveEmployee")
    public Employee saveEmployee(@RequestBody Employee employee){
           return employeeService.saveEmployee(employee);
    }

    @GetMapping("/getEmployeeByAge")
	public Set<Employee> findByAge(@RequestParam("age") int age) {
		return employeeService.getEmployeeByAge(age);
	}


    @GetMapping("/getAllEmployee")
	public Iterable<Employee> findAll() {
		return employeeService.getAllEmployee();
	}

	

    
}
