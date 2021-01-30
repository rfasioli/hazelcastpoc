package br.com.rfasioli.hazelcastpoc.springboot.persistence.dao;

import br.com.rfasioli.hazelcastpoc.springboot.domains.Employee;

import java.util.List;

public interface EmployeeDao {
    void insertEmployee(Employee cus);
    void insertEmployees(List<Employee> employees);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(String empId);
}
