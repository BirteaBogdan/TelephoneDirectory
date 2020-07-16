package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

		List<Directory> numbers = new ArrayList<Directory>();
		numbers.add(new Directory(1, "Andrei", "Popescu", "0711111111", "Str.Cocorului, Nr.23","popescu.andrei@yahoo.com"));
		numbers.add(new Directory(2, "Andreea", "Georgescu", "0755555555", "Str.Dorului, Nr.33","georgescu.andreea@yahoo.com"));
		numbers.add(new Directory(3, "Ion", "Ionescu", "0722222222", "Str.Norului, Nr.12", "ionescu.ion@yahoo.com"));
		numbers.add(new Directory(4, "Cristian", "Ionescu", "0733333333", "Str.Lunga, Nr.6", "ionescu.cristian@yahoo.com"));

		model.addAttribute("numberList", numbers);
		phonebookService.getNumbers();

		mav.setViewName("PhonebookOverview");
		return mav;

	}

	@RequestMapping(value = "/goodbye", method = RequestMethod.GET)
	public ModelAndView goodbyeRequestMapping() {
		ModelAndView mav = new ModelAndView();
		System.out.println("Good bye from goodbyeRequestMapping");
		mav.setViewName("goodbyePage");
		return mav;
	}
}
