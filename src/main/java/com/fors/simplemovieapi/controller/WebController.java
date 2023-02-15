package com.fors.simplemovieapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.fors.simplemovieapi.model.Person;
import com.fors.simplemovieapi.service.PersonService;

@Controller
public class WebController {
	
	@Autowired
	private PersonService personService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/persons")
	public String persons(Model model) {
		model.addAttribute("persons", personService.findAll());
		model.addAttribute("formData", new Person());
		return "persons";
	}
	
	@GetMapping("/persons/{personId}/delete")
	public String persons(@PathVariable("personId") int personId) {
		personService.delete(personId);
		return "redirect:/persons";
	}
	
	@PostMapping("/persons")
	public String add(@ModelAttribute("formData") Person person) {
		personService.add(person);
		return "redirect:/persons";
	}
}
