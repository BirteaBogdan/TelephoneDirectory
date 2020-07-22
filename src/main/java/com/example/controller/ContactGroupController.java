package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.ContactGroup;
import com.example.service.ContactGroupService;

@Controller
public class ContactGroupController {
	
	@Autowired
	ContactGroupService contactGroupService;
	
	

	@RequestMapping(value = "/groupOverview", method = RequestMethod.GET)
	public ModelAndView groupOverviewRequestMapping(Model model) {
		ModelAndView mav = new ModelAndView();

		List<ContactGroup> contactGroupList = contactGroupService.getContactGroupList();
		
		model.addAttribute("contactGroupList", contactGroupList);
		
		mav.setViewName("contactGroupOverview");
		return mav;

	}
}
