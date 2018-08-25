package com.sri.sboot.education.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sri.sboot.education.model.Education;
import com.sri.sboot.education.service.EducationService;


@RestController
public class EducationController {


	@Autowired
	EducationService educationService;
	
	@GetMapping("/education")
	public Iterable<Education> getEducationDeatils(){
		return educationService.getAllDetails();
	}
	@GetMapping("/education/{eId}")
	public Education getEducationById(@PathVariable("eId") int eId){
		return educationService.findEducationByEId(eId);
	}
	@GetMapping("/education/course/{eId}")
	public String getCourseById(@PathVariable("eId") int eId){
		return educationService.findCourseByEId(eId);
	}
	
}
