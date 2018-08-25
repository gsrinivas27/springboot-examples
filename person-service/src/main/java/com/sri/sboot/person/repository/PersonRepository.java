package com.sri.sboot.person.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sri.sboot.person.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {

}
