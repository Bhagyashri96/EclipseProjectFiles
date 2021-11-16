package com.bhagya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Addcontroller {
	
	@RequestMapping("/add")
	public void add() {
		System.out.println("inside add");
	}

}
