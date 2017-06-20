package com.xxx.courseArr.dao;

import java.util.List;

import com.xxx.courseArr.bean.Course;

public interface CourseDao {
	
	/**
	 * 增加课程
	 * @param courseName
	 * @param courseDate
	 * @return
	 */
	public boolean insertCourse(String courseName,String courseDate,String address,String courseTea,String courseWeek,String college,String major);
	
	/**
	 * 获得所有课程
	 * @return
	 */
	public List<Course> getAllCourse();
	
	/**
	 * 根据课程Id查找课程
	 * @param courseId
	 * @return
	 */
	public List<Course> selectCourse(String courseId);
	
	/**
	 * 根据课程Id删除课程
	 * @param courseId
	 * @return 
	 */
	public boolean deleteCourse(int courseId);

}
