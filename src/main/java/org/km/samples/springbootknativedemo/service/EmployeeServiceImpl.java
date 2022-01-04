package org.km.samples.springbootknativedemo.service;

import org.km.samples.springbootknativedemo.domain.Employee;
import org.km.samples.springbootknativedemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee saveEmployee( Employee employee){
      return employeeRepository.save(employee);

    }

    public Iterable<Employee> getAllEmployee(){
        return employeeRepository.findAll();
  
      }

    public Set<Employee> getEmployeeByAge(int age){
      return employeeRepository.findByAge(age);

    }
    public Set<Employee> getEmployeeByFirstAndLastName(String firstName, String lastName){
        return employeeRepository.findByFirstNameAndLastName(firstName, lastName);
    }

    public Optional<Employee> getEmployeeById(String id){
        return employeeRepository.findById(id);

    }

    
}
