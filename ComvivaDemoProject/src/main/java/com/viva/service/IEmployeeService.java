package com.viva.service;

import java.util.List;

import com.viva.bean.Employee;

public interface IEmployeeService {
	public Integer saveEmployee(Employee employee);
	public void deleteEmployee(Integer id);
	public Employee getOneEmployee(Integer id);
	public List<Employee> getAllEmployee();
}
