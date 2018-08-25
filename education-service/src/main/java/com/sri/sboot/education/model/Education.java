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
	private Long persionId;
	
	public Education() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Education(int eId, String institute, String course, int duration, Long persionId) {
		super();
		this.eId = eId;
		this.institute = institute;
		this.course = course;
		this.duration = duration;
		this.persionId = persionId;
	}



	public Long getPersionId() {
		return persionId;
	}



	public void setPersionId(Long persionId) {
		this.persionId = persionId;
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



	@Override
	public String toString() {
		return "Education [eId=" + eId + ", institute=" + institute + ", course=" + course + ", duration=" + duration
				+ ", persionId=" + persionId + "]";
	}
	
	
	
	
}
