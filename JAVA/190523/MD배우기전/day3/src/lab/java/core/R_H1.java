package lab.java.core;

import java.util.Random;
import java.util.Scanner;

public class R_H1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int rnum = r.nextInt(100)+1;//0~99�� +1�� ����.
		int chance = 0;
		
		
		do {
			System.out.println("1~100������ ���� ���纸����(��ȸ 5��, "+(chance+1)+"��° �õ�) :");
			int ans = s.nextInt();
			
			if(ans>rnum)System.out.println("Down");
			else if(ans<rnum)System.out.println("Up");
			else {System.out.println("You Win!!!"); break;}
			chance++;
			
		}
		while(chance!=5);
		if(chance==5)System.out.println("I(Computer) Win^^");
	

	}

}

/*
UpDown����
������ �������ִ� Math.random() �Ǵ� java.util.RandomŬ������ ����ؼ� 1~100������ ������ �����ϰ� �̼��� ��ǻ�Ͱ� ������ ���� �����մϴ�.
����ڷκ��� 1~100������ ������ �Է¹޾Ƽ� ����ڰ� �Է��� ������ ��ǻ�Ͱ� �����ϰ� �ִ� ������ �����ϸ�  ��You Win!!!���̶�� ����ϰ�, 
����ڰ� �Է��� ������ ��ǻ�Ͱ� �����ϰ� �ִ� �������� ũ�� ��Down���̶�� ����մϴ�.
����ڰ� �Է��� ������ ��ǻ�Ͱ� �����ϰ� �ִ� �������� ������ ��Up���̶�� ����մϴ�.
����ڿ��� 5���� ��ȸ�� ������ �Ŀ��� ������ ���ϸ� ��I(Computer) Win^^���̶�� ����մϴ�.
 */

