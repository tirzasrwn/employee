package com.tirzasrwn.app.employee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/date")
	public String date(Model theModel) {
		theModel.addAttribute("theDate", java.time.LocalDateTime.now());

		return "date";
	}

}
