package com.tirzasrwn.app.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tirzasrwn.app.employee.model.Student;

@Controller
public class StudentController {
	@Value("${countries}")
	private List<String> countries;

	@Value("${languages}")
	private List<String> languages;

	@GetMapping("/showStudentForm")
	public String showForm(Model theModel) {
		Student theStudent = new Student();
		theModel.addAttribute(theStudent);
		theModel.addAttribute("countries", countries);
		theModel.addAttribute("languages", languages);

		return "student-form";
	}

	@PostMapping("/proccessStudentForm")
	public String proccessForm(@ModelAttribute("student") Student theStudent) {
		System.out.println(theStudent);

		return "student-confirmation";
	}

}
