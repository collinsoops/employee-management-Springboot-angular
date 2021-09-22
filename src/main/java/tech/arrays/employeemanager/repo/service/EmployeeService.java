package tech.arrays.employeemanager.repo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.arrays.employeemanager.model.Employee;
import tech.arrays.employeemanager.repo.Employeerepo;

import java.util.UUID;

@Service
public class EmployeeService {
    private  final Employeerepo employeerepo;
    @Autowired
    public EmployeeService(Employeerepo employeerepo) {
        this.employeerepo = employeerepo;
    }
    public Employee addEmployee(Employee employee){
employee.setEmployeecode(UUID.randomUUID().toString() );
  return  employeerepo.save(employee);
    }
}
