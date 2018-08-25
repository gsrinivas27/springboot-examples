package com.sri.sboot.education.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sri.sboot.education.model.Education;
import com.sri.sboot.education.reposiroty.EducationRepository;

@Service
public class EducationService {

	@Autowired
	EducationRepository educationRepo;
	
	public Iterable<Education> getAllDetails(){
		return educationRepo.findAll();
	}
	
	public Education findEducationByEId(int eId) {
		return educationRepo
				.findById(eId).get();
	}

   public String findCourseByEId(int eId) {
	  return educationRepo.findById(eId).get().getCourse();
   }
}

