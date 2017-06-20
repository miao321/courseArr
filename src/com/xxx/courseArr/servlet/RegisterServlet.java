package com.xxx.courseArr.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xxx.courseArr.dao.UserDao;
import com.xxx.courseArr.dao.impl.UserDaoImpl;

/**
 * Servlet implementation class RegisterServlet
 */
//@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserDao userDao=new UserDaoImpl();
		PrintWriter pw=response.getWriter();
		request.setCharacterEncoding("UTF-8");
		String studentNum=request.getParameter("studentNum");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String confirmPassword=request.getParameter("confirmPassword");
		String phone=request.getParameter("phone");
		String email=request.getParameter("email");
		try{
			if(userDao.insertUser(studentNum,username, password, phone, email)){
				response.sendRedirect("login.jsp");
//				<span style="font-size:24px;"><meta http-equiv="refresh" content="3;URL=res.html"> </span> 
//				pw.println("success");
				//response.sendRedirect("login.jsp");
				//request.getRequestDispatcher("login.jsp").forward(request, response);
			}else{
//				pw.println("failure");
				response.sendRedirect("error.jsp");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
