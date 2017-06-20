package com.xxx.courseArr.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConnectionFactory {
	private static final String DB_DRIVER="com.mysql.jdbc.Driver";  //数据库驱动
	private static final String DB_URL="jdbc:mysql://localhost:3306/courseSche?useUnicode=true&characterEncoding=UTF-8";
	private static final String DB_USERNAME="root";
	private static final String DB_PASSWORD="123456";
	
	public static Connection getConnection(){
		Connection conn=null;
		try{
			Class.forName(DB_DRIVER);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		try{
			conn=DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return conn;
	}

}
