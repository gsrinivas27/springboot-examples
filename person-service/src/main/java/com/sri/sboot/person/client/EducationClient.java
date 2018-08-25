package com.sri.sboot.person.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sri.sboot.person.model.Education;

@FeignClient(name="education-service")
public interface EducationClient {

	@GetMapping("/education/{eduId}")
	public Education findByEId(@PathVariable("eduId") int eId);
}
