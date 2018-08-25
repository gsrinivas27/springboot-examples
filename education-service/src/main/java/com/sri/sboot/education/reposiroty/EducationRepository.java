package com.sri.sboot.education.reposiroty;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sri.sboot.education.model.Education;

@Repository
public interface EducationRepository extends CrudRepository<Education, Integer>{

}
