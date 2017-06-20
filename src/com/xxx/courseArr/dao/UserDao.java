package com.xxx.courseArr.dao;

import java.util.List;

import com.xxx.courseArr.bean.User;

public interface UserDao {
	/**
	 * 获取登录用户信息
	 * @param studentNum
	 * @param password
	 * @return
	 */
	public User loginSelect(String studentNum,String password);
	
	/**
	 * 修改密码
	 * @param userId
	 * @param password1
	 * @param password2
	 * @return
	 */
	public boolean changePassword(int userId,String password1,String password2);
	
	/**
	 * 获得所有用户
	 * @return
	 */
	public List<User> getAllUser();
	
	/**
	 * 根据姓名查找用户
	 * @param userId
	 * @return
	 */
	public List<User> selectUser(String username);
	
	/**
	 * 增加用户
	 * @param studentNum
	 * @param password
	 * @return
	 */
	public boolean insertUser(String studentNum,String username,String password,String phone,String email);
	
	/**
	 * 删除用户
	 * @param userId
	 * @return
	 */
	public boolean deleteUser(int userId);

}

