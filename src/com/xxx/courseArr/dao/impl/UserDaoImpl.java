package com.xxx.courseArr.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.xxx.courseArr.bean.User;
import com.xxx.courseArr.dao.UserDao;
import com.xxx.courseArr.util.ConnectionFactory;
import com.xxx.courseArr.util.ControlDB;
import com.xxx.courseArr.util.DbClose;

public class UserDaoImpl implements UserDao {
	
	public User loginSelect(String studentNum,String password){
		User user=new User();
		String sql="select * from tb_users where studentNum='"+studentNum+"' and password='"+password+"'";
		try{
			Connection conn=ConnectionFactory.getConnection();
			Statement st=conn.createStatement();
			ResultSet rs=null;
			rs=st.executeQuery(sql);
			if(rs.next()){
				user.setUserId(rs.getInt("userId"));
				user.setStudentNum(rs.getString("studentNum"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setPhone(rs.getString("phone"));
				user.setEmail(rs.getString("email"));
				user.setRole(rs.getInt("role"));
			}
			DbClose.close(rs, st, conn);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return user;
	}
	
	public boolean changePassword(int userId,String password1,String password2){
		ControlDB cd=new ControlDB();
		String sql="update tb_users set password='"+password2+"' where userId='"+userId+"' and password='"+password1+"'";
		boolean flag=false;
		try{
			flag=cd.executeUpdate(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return flag;
	}
	
	public List<User> getAllUser(){
		List<User> list=new ArrayList<User>();
		Connection conn=null;
		Statement st=null;
		ResultSet rs=null;
		conn=ConnectionFactory.getConnection();
		try{
			st=conn.createStatement();
			String sql="select * from tb_users where role=0";
			rs=st.executeQuery(sql);
			while(rs.next()){
				User user=new User();
				user.setUserId(rs.getInt("userId"));
				user.setStudentNum(rs.getString("studentNum"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setPhone(rs.getString("phone"));
				user.setEmail(rs.getString("email"));
				list.add(user);
			}
			DbClose.close(rs, st, conn);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return list;
	}
	
	public List<User> selectUser(String username){
		List<User> list=new ArrayList<User>();
		Connection conn=ConnectionFactory.getConnection();
		Statement st=null;
		ResultSet rs=null;
		String sql="select * from tb_users where username='"+username+"'";
		try{
			st=conn.createStatement();
			rs=st.executeQuery(sql);
			if(rs.next()){
				//有用户则返回
				do{
					User user=new User();
					user.setUserId(rs.getInt("userId"));
					user.setStudentNum(rs.getString("studentNum"));
					user.setUsername(rs.getString("username"));
					user.setPassword(rs.getString("password"));
					user.setPhone(rs.getString("phone"));
					user.setEmail(rs.getString("email"));
					list.add(user);
				}while(rs.next());
				DbClose.close(rs, st, conn);
			}else{
				//否则返回所有用户       这里应该需要修改
				list=(new UserDaoImpl()).getAllUser();
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return list;
	}
	
	public boolean insertUser(String studentNum,String username,String password,String phone,String email){
		ControlDB cd=new ControlDB();
		String sql="insert into tb_users(studentNum,username,password,phone,email,role) values('"+studentNum+"','"+username+"','"+password+"','"+phone+"','"+email+"','"+0+"')";
		boolean flag=false;
		try{
			flag=cd.executeUpdate(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return flag;
	}
	
	public boolean deleteUser(int userId){
		ControlDB cd=new ControlDB();
		String sql="delete from tb_users where userId='"+userId+"'";
		boolean flag=false;
		try{
			flag=cd.executeUpdate(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return flag;
	}

}
