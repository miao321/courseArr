package com.xxx.courseArr.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xxx.courseArr.dao.CourseDao;
import com.xxx.courseArr.dao.impl.CourseDaoImpl;

/**
 * Servlet implementation class AddCourseServlet
 */
/*@WebServlet("/AddCourseServlet")*/
public class AddCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCourseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

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
		PrintWriter pw=response.getWriter();
		request.setCharacterEncoding("UTF-8");
		String courseName=request.getParameter("courseName");
		String courseDate=request.getParameter("courseDate");
		String address=request.getParameter("address");
		String courseTea=request.getParameter("courseTea");
		String courseWeek=request.getParameter("courseWeek");
		String college=request.getParameter("college");
		String major=request.getParameter("major");
		try{
			if(courseDao.insertCourse(courseName, courseDate, address, courseTea, courseWeek, college, major)){
				response.sendRedirect("addCourse.jsp");
			}else{
				response.sendRedirect("error.jsp");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
