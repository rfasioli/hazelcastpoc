package br.com.rfasioli.hazelcastpoc.springboot.services;

import br.com.rfasioli.hazelcastpoc.springboot.domains.Employee;

import java.util.List;

public interface EmployeeService {
    void insertEmployee(Employee emp);
    void insertEmployees(List<Employee> employees);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(String empid);
}
