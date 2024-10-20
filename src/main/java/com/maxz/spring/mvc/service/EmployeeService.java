package com.maxz.spring.mvc.service;

import com.maxz.spring.mvc.entity.Employee;

import java.util.List;

/**
 * @author ZuevMYu
 * @since 25.07.2024
 */
public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);
}
