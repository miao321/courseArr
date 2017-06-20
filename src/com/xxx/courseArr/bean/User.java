package com.xxx.courseArr.bean;

public class User {
	private int userId;          //用户ID
	private String studentNum;   //用户学号or教师账号
	private String username;
	private String password;     //用户密码
	private String phone;        //用户手机号   
	private String email;        //用户邮箱
	private int role;            //用户角色      0：学生     1：老师
	
	public User(){
		
	}
	
	public User(int userId,String studentNum,String username,String password,String phone,String email,int role){
		this.userId=userId;
		this.studentNum=studentNum;
		this.username=username;
		this.password=password;
		this.phone=phone;
		this.email=email;
		this.role=role;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getPassword() {
		return password;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}
	
	

}

