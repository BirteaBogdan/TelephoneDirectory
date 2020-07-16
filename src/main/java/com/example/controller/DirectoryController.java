package com.example.controller;

import java.util.ArrayList;
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

	@RequestMapping(value = "/goodbye", method = RequestMethod.GET)
	public ModelAndView goodbyeRequestMapping(Model model) {
		ModelAndView mav = new ModelAndView();
		System.out.println("Good bye from goodbyeRequestMapping");
		Directory contact = new Directory();
		model.addAttribute("contact", contact);
		mav.setViewName("goodbyePage");
		return mav;
	}
	
	
	@RequestMapping(value="/submitContact", method=RequestMethod.POST)
	public ModelAndView submitContact(@ModelAttribute Directory contact) {
		ModelAndView mav = new ModelAndView();
		System.out.println("Hello from submitContact");
		int result = phonebookService.saveNumbers(contact);
		System.out.println("Result: " + result);
		mav.setViewName("redirect:/PhonebookOverview");
		return mav;
	}
}
