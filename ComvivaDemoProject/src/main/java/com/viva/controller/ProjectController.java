package com.viva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.viva.bean.Project;
import com.viva.service.IProjectService;

@Controller
@RequestMapping("/prj")
public class ProjectController {
	@Autowired
	private IProjectService service;
	
	@RequestMapping("/reg_prj")
	public String showProjRegPage(ModelMap map) {
		Project p=new Project();
		map.addAttribute("prj",p);
		return "ProjectRegister";
	}
	
	@RequestMapping(value="/save_prj",method=RequestMethod.POST)
	public String saveProject(@ModelAttribute Project project,ModelMap map) {
		Integer id=service.saveProject(project);
		Project prj=new Project();
		map.addAttribute("prj",prj);
		map.addAttribute("message","Project Register with '"+id+"' Id. ");
		return "ProjectRegister";
	}
	
	
	
	@RequestMapping("/view_prj")
	public String viewOne(@RequestParam Integer id,ModelMap map)
	{
		Project project =service.getOneProject(id);
		map.addAttribute("project",project);
		return "ShowProject";
	}
	
	@RequestMapping("/delete_prj")
	public String deleteProject(@RequestParam Integer id,ModelMap map) {
		service.deleteProject(id);
		map.addAttribute("msg","Project '"+id+"' Successfully Deleted ");
		List<Project> list=service.getAllProject();
		map.addAttribute("projects",list);
		return "ShowProject";
	}
	
	@RequestMapping("/all_prj")
	public String getAllProject(ModelMap map) {
		List<Project> list=service.getAllProject();
		map.addAttribute("list",list);
		return "ShowProject";
	}
	
	
		
}
