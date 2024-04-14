package com.mvc.TestMVC.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.TestMVC.modal.Employee;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}

//	@RequestMapping("/registration-form")
//	public String register()
//	{
//		return "registration";
//	}
//	@RequestMapping(value="/registerEmp")
//	public String readRegistration(@RequestParam String name,@RequestParam String gender,@RequestParam int age,@RequestParam int salary) {
//		System.out.println(name);
//		System.out.println(gender);
//		System.out.println(age);
//		System.out.println(salary);
//		return "done";
//	}
	@RequestMapping("/registration-form")
	public String registerByModal(Model modal)
	{
		modal.addAttribute("e", new Employee());
		return "registration";
	}
	@RequestMapping(value="/registerEmp")
	public String readEmpByModal(@ModelAttribute Employee e) {
		System.out.println(e);
		return "done";
	}
	
}
