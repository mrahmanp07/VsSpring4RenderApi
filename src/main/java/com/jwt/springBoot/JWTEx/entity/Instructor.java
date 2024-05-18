package com.jwt.springBoot.JWTEx.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "instructor")
@Data
public class Instructor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int instructor_id;
	
	@Column(name = "instructor_name")
	private String instructorName;
	
	@Column(name = "instructor_username")
	private String instructorUsername;
	
	@Column(name = "instructor_password")
	private String instructorPassword;
	
	@Column(name = "instructor_email")
	private String instructorEmail;
	
	@Column(name = "instructor_phone")
	private String instructorPhone;
	
	@Column(name = "instructor_nid")
	private String instructorNid;
	
	@Column(name = "instructor_designation")
	private String instructorDesignation;
	
	@Column(name = "instructor_workplace")
	private String instructorWorkplace;
	
	@Column(name = "instructor_pic")
	private String instructorPic;

	public int getInstructor_id() {
		return instructor_id;
	}

	public void setInstructor_id(int instructor_id) {
		this.instructor_id = instructor_id;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public String getInstructorUsername() {
		return instructorUsername;
	}

	public void setInstructorUsername(String instructorUsername) {
		this.instructorUsername = instructorUsername;
	}

	public String getInstructorPassword() {
		return instructorPassword;
	}

	public void setInstructorPassword(String instructorPassword) {
		this.instructorPassword = instructorPassword;
	}

	public String getInstructorEmail() {
		return instructorEmail;
	}

	public void setInstructorEmail(String instructorEmail) {
		this.instructorEmail = instructorEmail;
	}

	public String getInstructorPhone() {
		return instructorPhone;
	}

	public void setInstructorPhone(String instructorPhone) {
		this.instructorPhone = instructorPhone;
	}

	public String getInstructorNid() {
		return instructorNid;
	}

	public void setInstructorNid(String instructorNid) {
		this.instructorNid = instructorNid;
	}

	public String getInstructorDesignation() {
		return instructorDesignation;
	}

	public void setInstructorDesignation(String instructorDesignation) {
		this.instructorDesignation = instructorDesignation;
	}

	public String getInstructorWorkplace() {
		return instructorWorkplace;
	}

	public void setInstructorWorkplace(String instructorWorkplace) {
		this.instructorWorkplace = instructorWorkplace;
	}

	public String getInstructorPic() {
		return instructorPic;
	}

	public void setInstructorPic(String instructorPic) {
		this.instructorPic = instructorPic;
	}
	
	
}
