package cn.itcast.dao;

import java.io.IOException;

import cn.itcast.pojo.User;

/* *
 * @author thnx1
 * @version v1.0
 */
public interface UserDao {

	/**
	 * @param username
	 * @param password
	 * @return �����Ƿ�ɹ�����
	 */
	public abstract boolean isLogin(String username,String password);

	/** �û�ע�Ṧ��
	 * @param  user
	 * Ҫע�����Ϣ
	 * @throws IOException 
	 */
	public abstract void  regist(User user);
}
