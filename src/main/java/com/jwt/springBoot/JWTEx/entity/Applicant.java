package com.jwt.springBoot.JWTEx.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "applicant_form")
@Data
public class Applicant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int applicant_id;
	
	@Column(name = "applicant_name")
	private String applicantName;
	
	@Column(name = "applicant_username")
	private String applicantUsername;
	
	@Column(name = "applicant_password")
	private String applicantPassword;
	
	@Column(name = "applicant_email")
	private String applicantEmail;
	
	@Column(name = "applicant_phone")
	private String applicantPhone;
	
	@Column(name = "applicant_nid")
	private String applicantNid;
	
	@Column(name = "applicant_designation")
	private String applicantDesignation;
	
	@Column(name = "applicant_workplace")
	private String applicantWorkplace;

	public int getApplicant_id() {
		return applicant_id;
	}

	public void setApplicant_id(int applicant_id) {
		this.applicant_id = applicant_id;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getApplicantUsername() {
		return applicantUsername;
	}

	public void setApplicantUsername(String applicantUsername) {
		this.applicantUsername = applicantUsername;
	}

	public String getApplicantPassword() {
		return applicantPassword;
	}

	public void setApplicantPassword(String applicantPassword) {
		this.applicantPassword = applicantPassword;
	}

	public String getApplicantEmail() {
		return applicantEmail;
	}

	public void setApplicantEmail(String applicantEmail) {
		this.applicantEmail = applicantEmail;
	}

	public String getApplicantPhone() {
		return applicantPhone;
	}

	public void setApplicantPhone(String applicantPhone) {
		this.applicantPhone = applicantPhone;
	}

	public String getApplicantNid() {
		return applicantNid;
	}

	public void setApplicantNid(String applicantNid) {
		this.applicantNid = applicantNid;
	}

	public String getApplicantDesignation() {
		return applicantDesignation;
	}

	public void setApplicantDesignation(String applicantDesignation) {
		this.applicantDesignation = applicantDesignation;
	}

	public String getApplicantWorkplace() {
		return applicantWorkplace;
	}

	public void setApplicantWorkplace(String applicantWorkplace) {
		this.applicantWorkplace = applicantWorkplace;
	}
	
	
}
