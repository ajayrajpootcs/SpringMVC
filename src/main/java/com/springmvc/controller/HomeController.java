package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@ResponseBody
	@RequestMapping("/")
	public String message()
	{
		System.out.println("Suceess.....");
		return "index.jsp";
	}

}
