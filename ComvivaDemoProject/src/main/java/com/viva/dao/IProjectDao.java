package com.viva.dao;

import java.util.List;

import com.viva.bean.Project;

public interface IProjectDao {
	public Integer saveProject(Project project);
	public List<Project> getAllProject();
	public void deleteProject(Integer id);
	public Project getOneProject(Integer id);
}
