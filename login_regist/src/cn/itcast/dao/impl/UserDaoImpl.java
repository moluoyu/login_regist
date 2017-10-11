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
	 * v1.0�汾
	Ϊ��ʹ�ö����������ͬһ�����ϣ��Ѽ��϶���Ϊ��Ա����
	Ϊ���ö������ʹ��ͬһ����Ա������ʹ��     static
	private static ArrayList<User> array = new ArrayList<User>();
	 */
	
	private static File  file= new File("user.txt");
	/**
	 * Ϊ�˱�֤�ļ�һ���ؾʹ���
	 * 
	 * 
	 */
	static
	{
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println("�����ļ�ʧ��");

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
			System.out.println("��¼�Ҳ�����Ϣ���ڵ��ļ�");

		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("�û���¼ʧ��");
		}

		finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					System.out.println("�û���¼�ͷ���Դʧ��");
					//e.printStackTrace();
				}
			}
		}

		
		
		
		
		return flag;
	}

	@Override
	public void regist(User user)  {
		/*
		 * Ϊ����ע��������ܹ���һ���Ĺ����Ҿ��Լ�������һ������
		 * �û��� =����
		 */
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("user.txt",true));
			
			
			String str= user.getUsername() + "=" +user.getPassword();
			
			bw.write(str);
			bw.flush();
			bw.newLine();
		} catch (IOException e) {
			System.out.println("�û�ע��ʧ��");
			//e.printStackTrace();
		}finally{
			if(bw != null)
			{
					try {
						bw.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						
						System.out.println("�û�ע���ͷ���Դʧ��");
						e.printStackTrace();
					}	
			}

			
		}


		
		
		
		
	
		
		
		
	}

}
