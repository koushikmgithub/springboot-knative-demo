package org.km.samples.springbootknativedemo.repository;

import org.km.samples.springbootknativedemo.domain.Employee;
import org.springframework.data.repository.CrudRepository;
import java.util.Set;

public interface EmployeeRepository extends CrudRepository <Employee, String>{

    Set<Employee> findByFirstNameAndLastName(String firstName, String lastName);
    Set<Employee> findByAge(int age);
}
    

