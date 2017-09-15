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
	//欢迎界面，给出选择项目
		System.out.println("------------------welcome-----------------");
		System.out.println("1 登录");
		System.out.println("2 注册");
		System.out.println("3 退出");
		System.out.println("请输入你的选择：");
		//键盘录入
		Scanner sc = new Scanner(System.in);
		//为了后面录入信息方便，全部采用字符串接收
		String choiceString = sc.nextLine();
		//switch中多次用到，定义到外面
		UserDao ud=new UserDaoImpl();
	
	
	
	
	
		switch (choiceString) {
		case "1":
			System.out.println("------------------登录界面-----------------");
			System.out.println("请输入用户名：");
			String Username = sc.nextLine();
			System.out.println("请输入密码：");
			String Password = sc.nextLine();
			//调用登录
			boolean flag = ud.isLogin(Username, Password);
				if (flag)
				{

					System.out.println("登录成功");
					
					
					System.out.println("是否进行猜字游戏：Y/N ?");
					
					while(true)
					{
						String resultString = sc.nextLine();
						if (resultString.equalsIgnoreCase("y")) 
						{// 玩游戏
							GuessNumber.start();
							System.out.println("是否进行猜字游戏：Y/N ?");
						}
						else
						{
							break;
						}
					
					}
					System.out.println("谢谢使用，欢迎下次再来");
					System.exit(0);
					
				} 
				else 
				{
					System.out.println("用户名或者密码错误，登入失败");
				}

			break;
		case "2":
			System.out.println("------------------注册界面-----------------");
			System.out.println("请输入用户名：");
			String newUsername = sc.nextLine();
			System.out.println("请输入密码：");
			String newPassword = sc.nextLine();
	
			
			//把用户名和密码封装到一个对象中
			User user = new User();
			user.setUsername(newUsername);
			user.setPassword(newPassword);
			
			//调用注册功能
			//多态
		//	UserDao u=new UserDaoImpl();
			ud.regist(user);
			System.out.println("注册成功");
	
			
			
			break;
		case "3":
		default:
			System.out.println("谢谢使用，欢迎下次再来");
			System.exit(0);
			break;
		}
	}
}
}
