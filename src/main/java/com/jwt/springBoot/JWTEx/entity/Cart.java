package com.jwt.springBoot.JWTEx.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "course_cart")
@Data
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cart_id;
	
	@Column(name = "course_Cname")
	private String courseCname;
	
	@Column(name = "course_Cduration")
	private String courseCduration;
	
	@Column(name = "course_Carticle")
	private String courseCarticle;
	
	@Column(name = "course_Cresource")
	private String courseCresource;
	
	@Column(name = "course_Caccess")
	private String courseCaccess;
	
	@Column(name = "course_Cinstructor_name")
	private String courseCinstructorName;
	
	@Column(name = "course_Cprice")
	private int courseCprice;
	
	@Column(name = "course_Cpic")
	private String courseCpic;
	
	@Column(name = "course_Cupload_date")
	private String courseCuploadDate;

	public int getCart_id() {
		return cart_id;
	}

	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}

	public String getCourseCname() {
		return courseCname;
	}

	public void setCourseCname(String courseCname) {
		this.courseCname = courseCname;
	}

	public String getCourseCduration() {
		return courseCduration;
	}

	public void setCourseCduration(String courseCduration) {
		this.courseCduration = courseCduration;
	}

	public String getCourseCarticle() {
		return courseCarticle;
	}

	public void setCourseCarticle(String courseCarticle) {
		this.courseCarticle = courseCarticle;
	}

	public String getCourseCresource() {
		return courseCresource;
	}

	public void setCourseCresource(String courseCresource) {
		this.courseCresource = courseCresource;
	}

	public String getCourseCaccess() {
		return courseCaccess;
	}

	public void setCourseCaccess(String courseCaccess) {
		this.courseCaccess = courseCaccess;
	}

	public String getCourseCinstructorName() {
		return courseCinstructorName;
	}

	public void setCourseCinstructorName(String courseCinstructorName) {
		this.courseCinstructorName = courseCinstructorName;
	}

	public int getCourseCprice() {
		return courseCprice;
	}

	public void setCourseCprice(int courseCprice) {
		this.courseCprice = courseCprice;
	}

	public String getCourseCpic() {
		return courseCpic;
	}

	public void setCourseCpic(String courseCpic) {
		this.courseCpic = courseCpic;
	}

	public String getCourseCuploadDate() {
		return courseCuploadDate;
	}

	public void setCourseCuploadDate(String courseCuploadDate) {
		this.courseCuploadDate = courseCuploadDate;
	}
	
	
}
