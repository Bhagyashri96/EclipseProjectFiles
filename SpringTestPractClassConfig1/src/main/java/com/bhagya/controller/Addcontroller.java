package com.bhagya.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Addcontroller {
	
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response) {
		int i = Integer.parseInt(request.getParameter("t1"));
		int j = Integer.parseInt(request.getParameter("t2"));
	    int k= i+j;
	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("display");
	    mv.addObject("result",k);
		return mv;
	}

}
