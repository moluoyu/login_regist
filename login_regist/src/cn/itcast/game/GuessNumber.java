package cn.itcast.game;

import java.util.Scanner;

/**
 * 这是猜字游戏
 * @author thnx1
 *@version V1.0
 */
public class GuessNumber {

	private   GuessNumber() {
		// TODO Auto-generated constructor stub
	}
	public static void start()
	{
		//产生随机数
		int number = (int) (Math.random()* 100)+1;
		//定义一个统计变量
		int count = 0;
		while (true){
			Scanner sc = new Scanner(System.in);
			
			System.out.println("请输入一个1-100之间的整数");
			int guessNumber = sc.nextInt();
			
			count++;
			if(guessNumber > number)
			{
				
				System.out.println("你猜的数字" + guessNumber +"大了");
				
			}
			else if(guessNumber < number)
			{
				System.out.println("你猜的数字" + guessNumber +"小了");
	
			}
			else
			{
				System.out.println("恭喜你，" + count+"次猜中了");
				break;
				
			}
		}
	}
	
}
