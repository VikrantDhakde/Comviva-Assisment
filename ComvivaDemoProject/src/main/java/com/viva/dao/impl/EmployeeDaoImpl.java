package com.viva.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.viva.bean.Employee;
import com.viva.dao.IEmployeeDao;

@Repository
public class EmployeeDaoImpl implements IEmployeeDao{

	@Autowired
	private HibernateTemplate ht;
	
	@Override	
	public Integer saveEmployee(Employee employee) {
		return (Integer) ht.save(employee);
	}

	@Override
	public void deleteEmployee(Integer id) {
		Employee e=new Employee();
		e.setEmpId(id);
		ht.delete(e);		
	}

	@Override
	public Employee getOneEmployee(Integer id) {
		return ht.get(Employee.class, id);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return ht.loadAll(Employee.class);
	}
	
}
