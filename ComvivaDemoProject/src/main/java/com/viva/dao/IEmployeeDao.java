package com.viva.dao;

import java.util.List;

import com.viva.bean.Employee;

public interface IEmployeeDao {
	public Integer saveEmployee(Employee employee);
	public void deleteEmployee(Integer id);
	public Employee getOneEmployee(Integer id);
	public List<Employee> getAllEmployee();
}
