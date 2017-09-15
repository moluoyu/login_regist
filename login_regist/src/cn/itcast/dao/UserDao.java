package cn.itcast.dao;

import cn.itcast.pojo.User;

/* *
 * @author thnx1
 * @version v1.0
 */
public interface UserDao {

	/**
	 * @param username
	 * @param password
	 * @return 返回是否成功登入
	 */
	public abstract boolean isLogin(String username,String password);

	/** 用户注册功能
	 * @param  user
	 * 要注册的信息
	 */
	public abstract void  regist(User user);
}
