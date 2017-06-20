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
 * Servlet implementation class UserLoginServlet
 */
//@WebServlet("/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginServlet() {
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
		UserDao userDao=new UserDaoImpl();
		PrintWriter pw=response.getWriter();
		HttpSession session=request.getSession();
		String studentNum=request.getParameter("studentNum");
		String password=request.getParameter("password");
		String userId=request.getParameter("userId");
		User user=(User)userDao.loginSelect(studentNum, password);
		if(user.getStudentNum()==null||user.getPassword()==null||user.getRole()==0||user.getStudentNum()==""){
			response.sendRedirect("error.jsp");
		}else{
			session.setAttribute("user",user);
			response.sendRedirect("backstage.jsp");
		}
		
	}

}
