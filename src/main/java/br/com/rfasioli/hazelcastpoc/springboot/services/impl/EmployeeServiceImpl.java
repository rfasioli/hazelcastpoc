package br.com.rfasioli.hazelcastpoc.springboot.services.impl;

import br.com.rfasioli.hazelcastpoc.springboot.domains.Employee;
import br.com.rfasioli.hazelcastpoc.springboot.persistence.dao.EmployeeDao;
import br.com.rfasioli.hazelcastpoc.springboot.services.EmployeeService;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CacheConfig(cacheNames = "sb_employees")
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeDao employeeDao;

    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public void insertEmployee(Employee employee) {
        employeeDao.insertEmployee(employee);
    }

    @Override
    public void insertEmployees(List<Employee> employees) {
        employeeDao.insertEmployees(employees);
    }

    @Override
    @Cacheable()
    public List<Employee> getAllEmployees() {
        System.out.println("Inside the service layer");
        return employeeDao.getAllEmployees();
    }

    @Override
    public Employee getEmployeeById(String empId) {
        Employee employee = employeeDao.getEmployeeById(empId);
        System.out.println(employee);
        return employee;
    }
}
