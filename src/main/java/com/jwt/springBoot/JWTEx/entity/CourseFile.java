package com.jwt.springBoot.JWTEx.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "course_file")
public class CourseFile {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int course_file_id;
	
	@Column(name = "course_file_title")
	private String courseFileTitle;
	
	@Column(name = "course_file_url")
	private String courseFileUrl;
	
	@Column(name = "course_id")
	private int courseId;

	public int getCourse_file_id() {
		return course_file_id;
	}

	public void setCourse_file_id(int course_file_id) {
		this.course_file_id = course_file_id;
	}

	public String getCourseFileTitle() {
		return courseFileTitle;
	}

	public void setCourseFileTitle(String courseFileTitle) {
		this.courseFileTitle = courseFileTitle;
	}

	public String getCourseFileUrl() {
		return courseFileUrl;
	}

	public void setCourseFileUrl(String courseFileUrl) {
		this.courseFileUrl = courseFileUrl;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	
	
	
}
