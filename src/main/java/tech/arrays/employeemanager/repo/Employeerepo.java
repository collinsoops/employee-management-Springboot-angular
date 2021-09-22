package tech.arrays.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.arrays.employeemanager.model.Employee;

public interface Employeerepo extends JpaRepository<Employee, Long > {


}
