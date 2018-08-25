package com.sri.sboot.person.model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="PPerson")
public class Person {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int personId;
	private String name;
	private long phno;
	private String address;
	
	@ElementCollection
	List<Education> education;
	
	public Person() {
		super();
	}
	
	public Person(int personId, String name, long phno, String address, List<Education> education) {
		super();
		this.personId = personId;
		this.name = name;
		this.phno = phno;
		this.address = address;
		this.education = education;
	}

	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
		
	public List<Education> getEducation() {
		return education;
	}

	public void setEducation(List<Education> education) {
		this.education = education;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", phno=" + phno + ", address=" + address
				+ ", education=" + education + "]";
	}
	
	
}
