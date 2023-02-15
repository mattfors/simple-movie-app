package com.fors.simplemovieapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fors.simplemovieapi.model.Person;

@Service
public class PersonService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	public Person[] findAll() {
		return restTemplate.getForObject("/person", Person[].class);
	}
	
	public void add(Person person) {
		restTemplate.postForEntity("/person", person, null);
	}
	
	public void delete(int personId) {
		restTemplate.delete("/person/" + personId);
	}

}
