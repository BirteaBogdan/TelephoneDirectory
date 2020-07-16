package com.example.controller;// FIXME All packages should be written with lower case


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Employee;

@Controller
public class DirectoryController {

	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public ModelAndView helloRequestMapping(Model model) {
		ModelAndView mav = new ModelAndView();
		System.out.println("Hello from helloRequestMapping");
		
		// Simple text
		String text = "vreau sa afisez un text";
		model.addAttribute("mytext",text);
		
		// Lista de fructe
		List<String> fructe = new ArrayList<String>();
		fructe.add("Mere");
		fructe.add("Banane");
		fructe.add("Peneni");
		model.addAttribute("listaFructe",fructe);
		
		// Lista pentru angajati
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1,"Popescu","Andrei",6500));
		// Read all employees
		
		model.addAttribute("employeeList",employees);
		
		mav.setViewName("helloPage.html");
		
		return mav;
	}
	
	
	@RequestMapping(value="/goodbye", method=RequestMethod.GET)
	public ModelAndView goodbyeRequestMapping() {
		ModelAndView mav = new ModelAndView();
		System.out.println("Good bye from goodbyeRequestMapping");
		
		mav.setViewName("goodbyePage");
		return mav;
	}
	
	@RequestMapping(value="/employeeForm", method=RequestMethod.GET)
	public ModelAndView employeeForm(Model model) {
		ModelAndView mav = new ModelAndView();
		System.out.println("nimic from employeeFormRequestMapping");
		
		Employee employee=new Employee();
		model.addAttribute("employee",employee);
		
		mav.setViewName("employeeForm");
		return mav;
	}
	
	@RequestMapping(value="/submitEmployee", method=RequestMethod.GET)
	public ModelAndView submitEmployee(@ModelAttribute Employee employee) {
		ModelAndView mav = new ModelAndView();
		System.out.println("salut from submitEmployee");

		//Save employee to database
		
		mav.setViewName("redirect:/hello");
		return mav;
	}
	
}
