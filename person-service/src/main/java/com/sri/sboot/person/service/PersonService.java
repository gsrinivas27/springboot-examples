package com.sri.sboot.person.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sri.sboot.person.model.Person;
import com.sri.sboot.person.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	PersonRepository personRepository;
	
	public Iterable<Person> fetchEveryOne(){
		return personRepository.findAll();
	}
	
	public Person findByPersonId(int pId) {
		return personRepository.findById(pId).get();
	}
	
	public String addPerson(Person p) {
		Person per = personRepository.save(p);
		if(null!=per)
			return per.getName() + " Added Successfully";
		return "Some problem occured !!! please contact Persion service";
	}
	public String updatePerson(Person p) {
		Person per = personRepository.save(p);
		if(null!=per)
			return per.getName() + " Updated Successfully";
		return "Some problem occured !!! please contact Persion service";
	}
	public String deleteByPersonId(int persionId) {
		try {
		personRepository.deleteById(persionId);
		}catch(Exception e) {
			System.out.println("Exception"+e);
			return "Some problem occured !!! please contact Persion service";
		}
		return "Requested Person Deleted Successfully!";
	}
}
