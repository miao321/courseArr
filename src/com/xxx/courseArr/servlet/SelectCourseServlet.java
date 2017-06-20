package com.xxx.courseArr.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xxx.courseArr.dao.CourseDao;
import com.xxx.courseArr.dao.UserDao;
import com.xxx.courseArr.dao.impl.CourseDaoImpl;
import com.xxx.courseArr.dao.impl.UserDaoImpl;

/**
 * Servlet implementation class SelectCourseServlet
 */
//@WebServlet("/SelectCourseServlet")
public class SelectCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CourseDao courseDao=new CourseDaoImpl();
		request.setCharacterEncoding("UTF-8");
		String courseId=request.getParameter("course");
		if(courseId==null||courseId==" "){
			request.setAttribute("courseList", courseDao.getAllCourse());
			System.out.println(courseDao.getAllCourse().size());
		}else{
			request.setAttribute("courseList", courseDao.selectCourse(courseId));
		}
		request.getRequestDispatcher("seeCourse.jsp").forward(request, response);
	
	}

}
