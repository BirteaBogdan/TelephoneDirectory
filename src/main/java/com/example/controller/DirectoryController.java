package com.example.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Directory;
import com.example.service.DirectoryService;

@Controller
public class DirectoryController {

	@Autowired
	public DirectoryService phonebookService;

	@RequestMapping(value = "/PhonebookOverview", method = RequestMethod.GET)
	public ModelAndView phonebookOverviewRequestMapping(Model model) {
		ModelAndView mav = new ModelAndView();
		System.out.println("Hello from phonebookOverviewRequestMapping");

		List<Directory> contacts = phonebookService.getNumbers();
		
		model.addAttribute("numberList", contacts);
		phonebookService.getNumbers();

		mav.setViewName("PhonebookOverview");
		return mav;

	}

	@RequestMapping(value = "/addContact", method = RequestMethod.GET)
	public ModelAndView addContactRequestMapping(Model model) {
		ModelAndView mav = new ModelAndView();
		System.out.println("Hello from addContactRequestMapping");
		Directory contact = new Directory();
		model.addAttribute("contact", contact);
		mav.setViewName("addContact");
		return mav;
	}

	
	
	@RequestMapping(value="/submitContact", method=RequestMethod.POST)
	public ModelAndView submitContact(@ModelAttribute("contact") Directory contact) {
		ModelAndView mav = new ModelAndView();
		System.out.println("Hello from submitContact");
		int result = phonebookService.saveNumbers(contact);
		System.out.println("Result: " + result);
		System.out.println(contact);
		
		mav.setViewName("redirect:/PhonebookOverview");
		return mav;
	}
}
