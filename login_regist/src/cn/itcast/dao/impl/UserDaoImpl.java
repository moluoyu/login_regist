package cn.itcast.dao.impl;

import java.util.ArrayList;


import cn.itcast.dao.UserDao;
import cn.itcast.pojo.User;

public class UserDaoImpl implements UserDao {
	//为了使得多个方法能用同一个集合，把集合定义为成员变量
	//为了让多个对象使用同一个成员变量，使用     static
	private static ArrayList<User> array = new ArrayList<User>();

	@Override
	public boolean isLogin(String username, String password) {
		boolean flag = false;
		for(User u:array)
		{
			if(u.getUsername().equals(username) && u.getUsername().equals(password))
			{
				flag = true;
				break;
				
			}
		
			
		}
		return flag;
	}

	@Override
	public void regist(User user) {
//		ArrayList<User> array = new ArrayList<User>();
		array.add(user);
	}

}
