package cn.itcast.dao.impl;

import java.util.ArrayList;


import cn.itcast.dao.UserDao;
import cn.itcast.pojo.User;

public class UserDaoImpl implements UserDao {
	//Ϊ��ʹ�ö����������ͬһ�����ϣ��Ѽ��϶���Ϊ��Ա����
	//Ϊ���ö������ʹ��ͬһ����Ա������ʹ��     static
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
