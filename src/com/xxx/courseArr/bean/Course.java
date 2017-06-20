package com.xxx.courseArr.bean;

public class Course {
	private int courseId;
	private String courseName;
	private String courseDate;
	private String address;
	private String courseTea;
	private String courseWeek;
	private String college;
	private String major;
	
	public Course(){
		
	}
	
	public Course(int courseId,String courseName,String courseDate,String address,String courseTea,String courseWeek,String college,String major){
		this.courseId=courseId;
		this.courseName=courseName;
		this.courseDate=courseDate;
		this.address=address;
		this.courseTea=courseTea;
		this.courseWeek=courseWeek;
		this.college=college;
		this.major=major;
	}
	
	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDate() {
		return courseDate;
	}

	public void setCourseDate(String courseDate) {
		this.courseDate = courseDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCourseTea() {
		return courseTea;
	}

	public void setCourseTea(String courseTea) {
		this.courseTea = courseTea;
	}

	public String getCourseWeek() {
		return courseWeek;
	}

	public void setCourseWeek(String courseWeek) {
		this.courseWeek = courseWeek;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
	

}
