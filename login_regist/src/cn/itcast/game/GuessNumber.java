package cn.itcast.game;

import java.util.Scanner;

/**
 * ���ǲ�����Ϸ
 * @author thnx1
 *@version V1.0
 */
public class GuessNumber {

	private   GuessNumber() {
		// TODO Auto-generated constructor stub
	}
	public static void start()
	{
		//���������
		int number = (int) (Math.random()* 100)+1;
		//����һ��ͳ�Ʊ���
		int count = 0;
		while (true){
			Scanner sc = new Scanner(System.in);
			
			System.out.println("������һ��1-100֮�������");
			int guessNumber = sc.nextInt();
			
			count++;
			if(guessNumber > number)
			{
				
				System.out.println("��µ�����" + guessNumber +"����");
				
			}
			else if(guessNumber < number)
			{
				System.out.println("��µ�����" + guessNumber +"С��");
	
			}
			else
			{
				System.out.println("��ϲ�㣬" + count+"�β�����");
				break;
				
			}
		}
	}
	
}
