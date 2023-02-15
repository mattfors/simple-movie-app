package com.fors.simplemovieapi.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fors.simplemovieapi.mapper.PersonMapper;
import com.fors.simplemovieapi.model.Person;

@RestController
public class PersonController {
	
	@Autowired
	private PersonMapper personMapper;
	
	private Logger logger = LoggerFactory.getLogger(PersonController.class);
	
	@GetMapping(value = "/person", produces = "application/json")
	public List<Person> findAll() {
		return personMapper.findAll();
	}
	
	@PostMapping(value = "/person", consumes = "application/json")
	public void add(@RequestBody Person person) {
		logger.info("Adding a person " + person);
		personMapper.add(person);
	}
	
	@DeleteMapping(value = "/person/{personId}")
	public void add(@PathVariable("personId") int personId) {
		logger.info("Deleting a person, id=" + personId);
		personMapper.delete(personId);
	}

}
