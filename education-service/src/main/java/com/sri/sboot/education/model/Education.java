package com.sri.sboot.education.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Education {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int eId;
	private String institute;
	private String course;
	private int duration;
	
	public Education() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Education(int eId, String institute, String course, int duration) {
		super();
		this.eId = eId;
		this.institute = institute;
		this.course = course;
		this.duration = duration;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getInstitute() {
		return institute;
	}

	public void setInstitute(String institute) {
		this.institute = institute;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
	
	
}
