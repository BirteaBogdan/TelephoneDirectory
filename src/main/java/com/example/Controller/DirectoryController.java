package com.example.Controller;// FIXME All packages should be written with lower case

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DirectoryController {

	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public ModelAndView helloRequestMapping() {
		ModelAndView mav = new ModelAndView();
		System.out.println("Hello from helloRequestMapping");
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
	
}
