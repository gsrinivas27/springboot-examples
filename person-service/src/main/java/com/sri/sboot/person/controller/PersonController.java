package com.sri.sboot.person.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sri.sboot.person.model.Person;
import com.sri.sboot.person.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	PersonService personService;
	
	@GetMapping("/persons")
	public Iterable<Person> getEveryOne(){
		return personService.fetchEveryOne();
	}
	@GetMapping("/person/{personId}")
	public Person getPerson(@PathVariable("personId") int pId) {
		return personService.findByPersonId(pId);
	}
	
	@PostMapping("/person")
	public String addPerson(@RequestBody Person p) {
		return personService.addPerson(p);
	}
	
	@PutMapping("/person")
	public String updatePerson(@RequestBody Person p) {
		return personService.updatePerson(p);
	}
	
	@DeleteMapping("/person/{pId}")
	public String deletePerson(@PathVariable("pId") int personId) {
		return personService.deleteByPersonId(personId);
	}
}
