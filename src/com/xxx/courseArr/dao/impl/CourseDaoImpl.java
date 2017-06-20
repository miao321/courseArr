package com.xxx.courseArr.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.xxx.courseArr.bean.Course;
import com.xxx.courseArr.bean.User;
import com.xxx.courseArr.dao.CourseDao;
import com.xxx.courseArr.util.ConnectionFactory;
import com.xxx.courseArr.util.ControlDB;
import com.xxx.courseArr.util.DbClose;

public class CourseDaoImpl implements CourseDao {
	
	public boolean insertCourse(String courseName,String courseDate,String address,String courseTea,String courseWeek,String college,String major){
		ControlDB cd=new ControlDB();
		String sql="insert into tb_course(courseName,courseDate,address,courseTea,courseWeek,college,major) values('"+courseName+"','"+courseDate+"','"+address+"','"+courseTea+"','"+courseWeek+"','"+college+"','"+major+"')";
		boolean flag=false;
		try{
			flag=cd.executeUpdate(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return flag;
	}
	
	public List<Course> getAllCourse(){
		List<Course> list=new ArrayList<Course>();
		Connection conn=null;
		Statement st=null;
		ResultSet rs=null;
		conn=ConnectionFactory.getConnection();
		try{
			st=conn.createStatement();
			String sql="select * from tb_course";
			rs=st.executeQuery(sql);
			while(rs.next()){
				Course course=new Course();
				course.setCourseId(rs.getInt("courseId"));
				course.setCourseName(rs.getString("courseName"));
				course.setCourseDate(rs.getString("courseDate"));
				course.setAddress(rs.getString("address"));
				course.setCourseTea(rs.getString("courseTea"));
				course.setCourseWeek(rs.getString("courseWeek"));
				course.setCollege(rs.getString("college"));
				course.setMajor(rs.getString("major"));
				list.add(course);
			}
			DbClose.close(rs, st, conn);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return list;
	}
	
	public List<Course> selectCourse(String courseId){
		List<Course> list=new ArrayList<Course>();
		Connection conn=ConnectionFactory.getConnection();
		Statement st=null;
		ResultSet rs=null;
		String sql="select * from tb_course where courseId='"+courseId+"'";
		try{
			st=conn.createStatement();
			rs=st.executeQuery(sql);
			if(rs.next()){
				do{
					Course course=new Course();
					course.setCourseId(rs.getInt("courseId"));
					course.setCourseName(rs.getString("courseName"));
					course.setCourseDate(rs.getString("courseDate"));
					course.setAddress(rs.getString("address"));
					course.setCourseTea(rs.getString("courseTea"));
					course.setCourseWeek(rs.getString("courseWeek"));
					course.setCollege(rs.getString("college"));
					course.setMajor(rs.getString("major"));
					list.add(course);
				}while(rs.next());
				DbClose.close(rs, st, conn);
			}else{
				list=(new CourseDaoImpl()).getAllCourse();
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return list;
	}
	
	public boolean deleteCourse(int courseId){
		ControlDB cd=new ControlDB();
		String sql="delete from tb_course where courseId='"+courseId+"'";
		boolean flag=false;
		try{
			flag=cd.executeUpdate(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return flag;
	}

}

