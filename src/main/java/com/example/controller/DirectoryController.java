package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Directory;
import com.example.service.DirectoryService;

@Controller
public class DirectoryController {

	@Autowired
	public DirectoryService directoryService;

	@RequestMapping(value = "/phonebookOverview", method = RequestMethod.GET)
	public ModelAndView phonebookOverviewRequestMapping(Model model) {
		ModelAndView mav = new ModelAndView();

		List<Directory> contactList = directoryService.getContactList();
		
		model.addAttribute("contactList", contactList);
		directoryService.getContactList();
		
		mav.setViewName("phonebookOverview");
		return mav;

	}
	
	@RequestMapping(value = "/deleteContact", method = RequestMethod.POST)
	public ModelAndView deleteContact(@RequestParam("directoryId") int directoryId) {
		ModelAndView mav = new ModelAndView();
		
		directoryService.deleteById(directoryId);
		
		mav.setViewName("redirect:/phonebookOverview");
		return mav;
		
	}

	@RequestMapping(value = "/addContact", method = RequestMethod.GET)
	public ModelAndView addContactRequestMapping(Model model) {
		ModelAndView mav = new ModelAndView();
		
		Directory contact = new Directory();
		model.addAttribute("contact", contact);
		mav.setViewName("addContact");
		return mav;
	}

	
	
	@RequestMapping(value="/submitContact", method=RequestMethod.POST)
	public ModelAndView submitContact(@ModelAttribute("contact") Directory contact) {
		ModelAndView mav = new ModelAndView();
		int result = directoryService.saveContact(contact);
		System.out.println("Result: " + result);
		System.out.println(contact);
		
		mav.setViewName("redirect:/phonebookOverview");
		return mav;
	}
}
