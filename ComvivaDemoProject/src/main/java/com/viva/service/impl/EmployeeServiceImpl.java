package com.viva.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.viva.bean.Employee;
import com.viva.dao.IEmployeeDao;
import com.viva.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDao dao;
	
	@Transactional
	public Integer saveEmployee(Employee employee) {
		return dao.saveEmployee(employee);
	}

	@Transactional
	public void deleteEmployee(Integer id) {
		dao.deleteEmployee(id);
	}

	@Transactional(readOnly=true)
	public Employee getOneEmployee(Integer id) {
		return dao.getOneEmployee(id);
	}

	@Transactional(readOnly=true)
	public List<Employee> getAllEmployee() {
		return dao.getAllEmployee();
	}

}
