package com.test.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorld {
	
	@RequestMapping("/helloworld")
	public String hello() {
		System.out.println("hello world");
		return "success";
	}

	@RequestMapping("/news")
	public ModelAndView ShowNew(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("news");
		mav.addObject("content", "爱白菜的小昆虫");
		return mav;
	}
}
