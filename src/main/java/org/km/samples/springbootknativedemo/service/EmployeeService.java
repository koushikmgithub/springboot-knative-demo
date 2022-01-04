package org.km.samples.springbootknativedemo.service;

import org.km.samples.springbootknativedemo.domain.Employee;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public interface EmployeeService {

    Employee saveEmployee(Employee employee);
    Iterable<Employee> getAllEmployee();
    Set<Employee> getEmployeeByAge(int age);
    Set<Employee> getEmployeeByFirstAndLastName(String firstName, String lastName);
    Optional<Employee> getEmployeeById( String id);

}
