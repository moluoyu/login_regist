package cn.itcast.test;

import java.util.Scanner;

import cn.itcast.dao.UserDao;
import cn.itcast.dao.impl.UserDaoImpl;
import cn.itcast.game.GuessNumber;
import cn.itcast.pojo.User;

/**
 * 
 * @author thnx1
 * @version V1.0
 */
public class UserTest {
public static void main(String[] args) {
	
	while(true)
	{
	//��ӭ���棬����ѡ����Ŀ
		System.out.println("------------------welcome-----------------");
		System.out.println("1 ��¼");
		System.out.println("2 ע��");
		System.out.println("3 �˳�");
		System.out.println("���������ѡ��");
		//����¼��
		Scanner sc = new Scanner(System.in);
		//Ϊ�˺���¼����Ϣ���㣬ȫ�������ַ�������
		String choiceString = sc.nextLine();
		//switch�ж���õ������嵽����
		UserDao ud=new UserDaoImpl();
	
	
	
	
	
		switch (choiceString) {
		case "1":
			System.out.println("------------------��¼����-----------------");
			System.out.println("�������û�����");
			String Username = sc.nextLine();
			System.out.println("���������룺");
			String Password = sc.nextLine();
			//���õ�¼
			boolean flag = ud.isLogin(Username, Password);
				if (flag)
				{

					System.out.println("��¼�ɹ�");
					
					
					System.out.println("�Ƿ���в�����Ϸ��Y/N ?");
					
					while(true)
					{
						String resultString = sc.nextLine();
						if (resultString.equalsIgnoreCase("y")) 
						{// ����Ϸ
							GuessNumber.start();
							System.out.println("�Ƿ���в�����Ϸ��Y/N ?");
						}
						else
						{
							break;
						}
					
					}
					System.out.println("ллʹ�ã���ӭ�´�����");
					System.exit(0);
					
				} 
				else 
				{
					System.out.println("�û�������������󣬵���ʧ��");
				}

			break;
		case "2":
			System.out.println("------------------ע�����-----------------");
			System.out.println("�������û�����");
			String newUsername = sc.nextLine();
			System.out.println("���������룺");
			String newPassword = sc.nextLine();
	
			
			//���û����������װ��һ��������
			User user = new User();
			user.setUsername(newUsername);
			user.setPassword(newPassword);
			
			//����ע�Ṧ��
			//��̬
		//	UserDao u=new UserDaoImpl();
			ud.regist(user);
			System.out.println("ע��ɹ�");
	
			
			
			break;
		case "3":
		default:
			System.out.println("ллʹ�ã���ӭ�´�����");
			System.exit(0);
			break;
		}
	}
}
}
