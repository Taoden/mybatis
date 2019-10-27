package dao;

import model.User;

public interface UserDao{
	/*
	保存用户
	* */
	public void save(User user);
	public  User findUserByid(int id);
}
