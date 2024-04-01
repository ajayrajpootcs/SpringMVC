package com.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.model.Employee;

@Controller
public class EmployeeController {
	List<Employee> list= new ArrayList<>();
	
	@RequestMapping("/")
	public String message()
	{
		System.out.println("Suceess.....");
		return "index";
	}
	
	@RequestMapping("/searchEmp")
	public String search(@RequestParam String name,Model model ) {
		System.out.println(list);
		System.out.println("called...<hitOfFind>");
		if(list !=null) {
			for(Employee employee : list) {
				if(employee.getName().equals(name)) {
					model.addAttribute("em",employee);
					return "done";
				}	
				
			}
		}
		
		model.addAttribute("em",name);
		return "error";
		
	}
	@RequestMapping("/find")
	public String searchMethod() {
		System.out.println(list);
		System.out.println("called...<find>");
		return "search";

	}
	
	@RequestMapping("/registration-form")
	public String model(Model model) {
		model.addAttribute("emp", new Employee());
		return "registration";
	}

	@RequestMapping("/registerEmp")
	public String registered(@ModelAttribute Employee emp) {
		list.add(emp);
		System.out.println(emp);
		System.out.println();
		return "registered";
	}

}
