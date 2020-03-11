package com.viva.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.viva.bean.Project;
import com.viva.dao.IProjectDao;
import com.viva.service.IProjectService;

@Service
public class ProjectServiceImpl  implements IProjectService{

	@Autowired
	private IProjectDao dao;
	
	@Transactional
	public Integer saveProject(Project project) {
		return dao.saveProject(project);
	}
	
	@Transactional
	public void deleteProject(Integer id) {
		dao.deleteProject(id);
	}

	@Transactional(readOnly=true)
	public Project getOneProject(Integer id) {
		return dao.getOneProject(id);
	}

	
	
	
	
	@Transactional(readOnly=true)
	public List<Project> getAllProject() {
		return dao.getAllProject();
	}

}
