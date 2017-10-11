package cn.itcast.dao.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import cn.itcast.dao.UserDao;
import cn.itcast.pojo.User;

/**
 * 
 * @author thnx1
 * @version   V1.1
 *
 */

public class UserDaoImpl implements UserDao {
	
	/*
	 * v1.0版本
	为了使得多个方法能用同一个集合，把集合定义为成员变量
	为了让多个对象使用同一个成员变量，使用     static
	private static ArrayList<User> array = new ArrayList<User>();
	 */
	
	private static File  file= new File("user.txt");
	/**
	 * 为了保证文件一加载就创建
	 * 
	 * 
	 */
	static
	{
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println("创建文件失败");

		}
		
		
	}
	
	@Override
	public boolean isLogin(String username, String password) {
		BufferedReader br = null;
		boolean flag = false;
		try {
				br = new BufferedReader(new FileReader("user.txt"));
		String line = null;
		while((line = br.readLine()) != null)
		{
			
				String[] datas = line.split("=");
				if (datas[0].equals(username) && datas[1].equals(password)) {
					flag = true;
					break;
				}

			}

		} catch (FileNotFoundException e) {
			System.out.println("登录找不到信息所在的文件");

		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("用户登录失败");
		}

		finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					System.out.println("用户登录释放资源失败");
					//e.printStackTrace();
				}
			}
		}

		
		
		
		
		return flag;
	}

	@Override
	public void regist(User user)  {
		/*
		 * 为了让注册的数据能够有一定的规则，我就自己定义了一个规则
		 * 用户名 =密码
		 */
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("user.txt",true));
			
			
			String str= user.getUsername() + "=" +user.getPassword();
			
			bw.write(str);
			bw.flush();
			bw.newLine();
		} catch (IOException e) {
			System.out.println("用户注册失败");
			//e.printStackTrace();
		}finally{
			if(bw != null)
			{
					try {
						bw.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						
						System.out.println("用户注册释放资源失败");
						e.printStackTrace();
					}	
			}

			
		}


		
		
		
		
	
		
		
		
	}

}
