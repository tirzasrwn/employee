package com.tirzasrwn.app.employee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tirzasrwn.app.employee.model.Student;

@Controller
public class StudentController {

	@GetMapping("/showStudentForm")
	public String showForm(Model model) {
		Student theStudent = new Student();
		model.addAttribute(theStudent);

		return "student-form";
	}

	@PostMapping("/proccessStudentForm")
	public String proccessForm(@ModelAttribute("student") Student theStudent) {
		System.out.println(theStudent);

		return "student-confirmation";
	}

}
