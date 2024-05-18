package com.jwt.springBoot.JWTEx.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "courses")
@Data
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int course_id;
	
	@Column(name = "course_name")
	private String courseName;
	
	@Column(name = "course_upload_date")
	private String courseUploadDate;
	
	@Column(name = "course_duration")
	private String courseDuration;
	
	@Column(name = "course_article")
	private String courseArticle;
	
	@Column(name = "course_resource")
	private String courseResource;
	
	@Column(name = "course_access")
	private String courseAccess;
	
	@Column(name = "course_description")
	private String courseDescription;
	
	@Column(name = "course_curriculum")
	private String courseCurriculum;
	
	@Column(name = "course_cat_name2")
	private String courseCatName2;
	
	@Column(name = "course_price")
	private int coursePrice;
	
	@Column(name = "course_discount")
	private int courseDiscount;
	
	@Column(name = "instructor_name2")
	private String instructorName2;
	
	@Column(name = "course_pic")
	private String coursePic;

	@Column(name = "course_pdf")
	private String coursePdf;

	@Column(name = "course_video")
	private String courseVideo;

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseUploadDate() {
		return courseUploadDate;
	}

	public void setCourseUploadDate(String courseUploadDate) {
		this.courseUploadDate = courseUploadDate;
	}

	public String getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}

	public String getCourseArticle() {
		return courseArticle;
	}

	public void setCourseArticle(String courseArticle) {
		this.courseArticle = courseArticle;
	}

	public String getCourseResource() {
		return courseResource;
	}

	public void setCourseResource(String courseResource) {
		this.courseResource = courseResource;
	}

	public String getCourseAccess() {
		return courseAccess;
	}

	public void setCourseAccess(String courseAccess) {
		this.courseAccess = courseAccess;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public String getCourseCurriculum() {
		return courseCurriculum;
	}

	public void setCourseCurriculum(String courseCurriculum) {
		this.courseCurriculum = courseCurriculum;
	}

	public String getCourseCatName2() {
		return courseCatName2;
	}

	public void setCourseCatName2(String courseCatName2) {
		this.courseCatName2 = courseCatName2;
	}

	public String getInstructorName2() {
		return instructorName2;
	}

	public void setInstructorName2(String instructorName2) {
		this.instructorName2 = instructorName2;
	}

	public int getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(int coursePrice) {
		this.coursePrice = coursePrice;
	}

	public int getCourseDiscount() {
		return courseDiscount;
	}

	public void setCourseDiscount(int courseDiscount) {
		this.courseDiscount = courseDiscount;
	}

	public String getCoursePic() {
		return coursePic;
	}

	public void setCoursePic(String coursePic) {
		this.coursePic = coursePic;
	}

	public String getCoursePdf() {
		return coursePdf;
	}

	public void setCoursePdf(String coursePdf) {
		this.coursePdf = coursePdf;
	}

	public String getCourseVideo() {
		return courseVideo;
	}

	public void setCourseVideo(String courseVideo) {
		this.courseVideo = courseVideo;
	}
}
