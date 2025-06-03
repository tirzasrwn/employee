package com.tirzasrwn.app.employee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(@RequestParam("studentName") String theName, Model model) {
		// convert the data to all caps
		theName = theName.toUpperCase();
		// create the message
		String result = "Yo! " + theName;
		// add message to the model
		model.addAttribute("message", result);
		return "helloworld";

	}
}
