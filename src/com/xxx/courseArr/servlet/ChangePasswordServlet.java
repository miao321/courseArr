package com.xxx.courseArr.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xxx.courseArr.bean.User;
import com.xxx.courseArr.dao.UserDao;
import com.xxx.courseArr.dao.impl.UserDaoImpl;

/**
 * Servlet implementation class ChangePasswordServlet
 */
//@WebServlet("/ChangePasswordServlet")
public class ChangePasswordServlet extends HttpServlet {
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
		UserDao userDao=new UserDaoImpl();
		PrintWriter pw=response.getWriter();
		HttpSession session=request.getSession(false);
		User user=(User)session.getAttribute("user");
		int userId=user.getUserId();		
		String oldPassword=request.getParameter("oldPassword");
		String newPassword=request.getParameter("newPassword");
		if(userDao.changePassword(userId, oldPassword, newPassword)){
			session.invalidate();
			response.sendRedirect("addCourse.jsp");
		}else{
			response.sendRedirect("error.jsp");
		}
	}
	

}
