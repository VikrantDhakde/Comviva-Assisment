package com.viva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.viva.bean.Employee;
import com.viva.bean.Project;
import com.viva.service.IEmployeeService;
import com.viva.service.IProjectService;

@Controller
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	private IEmployeeService service;
	
	@Autowired
	private IProjectService prjService;
	
	@RequestMapping("/reg_emp")
	public String showEmpRegPage(ModelMap map) {
		Employee e=new Employee();
		map.addAttribute("emp",e);
		
		List<Project> prjlist=prjService.getAllProject();
		map.addAttribute("projects",prjlist);
		
		return "EmployeeRegister";
	}
	
	@RequestMapping(value="/save_emp",method=RequestMethod.POST)
	public String saveuser(@ModelAttribute Employee employee,ModelMap map) {
		Integer id=service.saveEmployee(employee);
		
		Employee e=new Employee();
		map.addAttribute("emp",e);
		
		List<Project> prjlist=prjService.getAllProject();
		map.addAttribute("projects",prjlist);
		
		map.addAttribute("message","Employee Register with '"+id+"' Id. ");
		return "EmployeeRegister";
	}
	
	@RequestMapping("/view")
	public String viewOne(@RequestParam Integer id,ModelMap map)
	{
		Employee employee=service.getOneEmployee(id);
		map.addAttribute("emp",employee);
		return "ShowEmployee";
	}
	
	@RequestMapping("/delete")
	public String deleteEmployee(@RequestParam Integer id,ModelMap map) {
		service.deleteEmployee(id);
		map.addAttribute("msg","UOM '"+id+"' Successfully Deleted ");
		List<Employee> list=service.getAllEmployee();
		map.addAttribute("emplist",list);
		return "ShowEmployee";
	}
	@RequestMapping("/viewuom")
	public String getAllUom(ModelMap map) {
		List<Employee> obs=service.getAllEmployee();
		map.addAttribute("emplist",obs);
		System.out.println(obs);
		return "ShowEmployee";
	}
	
	
	
		
}
