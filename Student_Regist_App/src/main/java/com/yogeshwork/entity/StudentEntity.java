package com.yogeshwork.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class StudentEntity {
	@Id
	@GeneratedValue
	private Integer sId;
	
	private String name;
	
	private String email;
	
	private String gender;
	
	private String cources;
	
	private String timings;

	public Integer getsId() {
		return sId;
	}

	public void setsId(Integer sId) {
		this.sId = sId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCources() {
		return cources;
	}

	public void setCources(String cources) {
		this.cources = cources;
	}

	public String getTimings() {
		return timings;
	}

	public void setTimings(String timings) {
		this.timings = timings;
	}

	@Override
	public String toString() {
		return "StudentEntity [sId=" + sId + ", name=" + name + ", email=" + email + ", gender=" + gender + ", course="
				+ cources + ", timings=" + timings + "]";
	}
	
	
	
	
	

}
