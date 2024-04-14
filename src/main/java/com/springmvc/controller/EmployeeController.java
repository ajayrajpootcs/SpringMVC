package com.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.model.Employee;
import com.springmvc.service.EmployeeService;

@Controller
public class EmployeeController {
	
	private EmployeeService employeeService;
	private int myID=0;
	@Autowired(required = true)
	@Qualifier(value = "employeeService")
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@RequestMapping("/")
	public String message()
	{
		System.out.println("Suceess.....");
		return "index";
	}
	
	@RequestMapping("/searchEmp")
	public String searchEmployeeByID(@RequestParam int id,Model model ) {
		System.out.println("called...<hitOfFind>");
		Employee emp = employeeService.getEmployeeById(id);
		if(emp!=null) {	
					model.addAttribute("em",emp);
					return "done";			
		}
		
		model.addAttribute("em",id);
		return "error";
		
	}
	
	@RequestMapping("/find")
	public String searchMethod() {
		System.out.println("called...<find>");
		return "search";

	}
	@RequestMapping("/list")
	public String listEmps(Model model) {
		List<Employee> list=employeeService.listEmployees();
		model.addAttribute("list",list);
		return "list";

	}
	@RequestMapping(value="/result/{id}", method=RequestMethod.GET)
	public String updateEmployee(@PathVariable int id, Model model) {
		Employee emp = employeeService.getEmployeeById(id);
		System.out.println(emp);
		model.addAttribute("em", emp);
		System.out.println("called for id=>"+id);
		return "update";
	}
	@RequestMapping(value="/updateform/{id}",method=RequestMethod.GET)
	public String redirect(@PathVariable int id,Model model) {
		Employee emplo = employeeService.getEmployeeById(id);
		myID=id;
		System.out.println(emplo+"....>");
		model.addAttribute("em2", emplo);
		return "update";
	}
	@RequestMapping("/registration-form")
	public String model(Model model) {
		model.addAttribute("emp", new Employee());
		return "registration";
	}

	@RequestMapping("/registerEmp")
	public String registered(@ModelAttribute Employee emp) {
		employeeService.addEmployee(emp);
		System.out.println(emp);
		System.out.println();
		return "registered";
	}
	@RequestMapping(value="/updateform/registerEmp2", method = RequestMethod.POST)
	public String registeredUpdate(@ModelAttribute("emp") Employee emp) {
		System.out.println(emp);
		employeeService.updateEmployee(emp,myID);
//		System.out.println();
		System.out.println("<updated......>");
		return "redirect:/list";
	}
	
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.POST)
	public String deleteEmployee(@PathVariable int id, Model model) {
		
		employeeService.removeEmployee(id);
		
		return "redirect:/list";
	}
	

}
