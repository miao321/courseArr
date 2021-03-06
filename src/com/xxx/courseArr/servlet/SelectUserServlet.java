package com.xxx.courseArr.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xxx.courseArr.dao.UserDao;
import com.xxx.courseArr.dao.impl.UserDaoImpl;

/**
 * Servlet implementation class SelectUserServlet
 */

public class SelectUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

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
		request.setCharacterEncoding("UTF-8");
		String username=request.getParameter("user");
		if(username==null||username==" "){
			request.setAttribute("userList", userDao.getAllUser());
//			System.out.println(userDao.getAllUser().size());
		}else{
			request.setAttribute("userList", userDao.selectUser(username));
//			System.out.println(userDao.selectUser(username).get(0).getUsername());
		}
		request.getRequestDispatcher("userManager.jsp").forward(request, response);
	}

}
