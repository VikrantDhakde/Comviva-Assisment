package com.viva.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.viva.bean.Employee;
import com.viva.bean.Project;
import com.viva.dao.IProjectDao;

@Repository
public class ProjectDaoImpl implements IProjectDao{

	@Autowired
	private HibernateTemplate ht;
	
	@Override	
	public Integer saveProject(Project project) {
		return (Integer) ht.save(project);
	}

	@Override
	public List<Project> getAllProject() {
		return ht.loadAll(Project.class);
	}
	
	@Override
	public void deleteProject(Integer id) {
		Project p=new Project();
		p.setProjId(id);
		ht.delete(p);		
	}

	@Override
	public Project getOneProject(Integer id) {
		return ht.get(Project.class, id);
	}
	
}
