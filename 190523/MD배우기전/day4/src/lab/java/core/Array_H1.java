package lab.java.core;

import java.util.Scanner;

public class Array_H1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�ֹι�ȣ �Է�(�� 123456-7891234) : ");
		String juminStr = input.next();
		int[] jumin = new int[13];
		//int[] check = new int[12];
		int sum =0;
	
		
		for(int i=0, j=0;i<juminStr.length();i++) {
			if(i==6)continue;
			jumin[j++]=juminStr.charAt(i)-'0'; //����� 2���� -48�ϰų� ���� '0'�� ��
		}
		
		
		for(int i=0,count=2; i<jumin.length-1;i++) {
			
			//check[i]=jumin[i]*count;
			sum+=jumin[i]*count;
			count++;
			if(count>9)count=2;
			
		}
		
		System.out.println(sum);
		
		int dig = 11-sum%11;
		if(dig>9)dig=dig%10;
		
		//�����Դ� int dig=(11-sum%11)%10 (�����ڸ��� %10�ص� ��ȭ�����⶧��)
		
		if(jumin[12]==dig)System.out.println("1. �´� �ֹι�ȣ�Դϴ�.");
		else System.out.println("1. Ʋ�� �ֹι�ȣ�Դϴ�.");
		
		
		if(jumin[6]==1||jumin[6]==3)System.out.println("2. �����Դϴ�.");
		else if(jumin[6]==2||jumin[6]==4)System.out.println("2. �����Դϴ�.");
		
		
		System.out.printf("3. %d0��� ���Դϴ�.",jumin[0]);
		
		
		
	}

}

//1.�ֹι�ȣüũ %11 -10
//2.����������������
//3.1900�⵵���� 2000�⵵����

//������ 11�� ���� �������� ���մϴ�.�� �������� 11���� �� ����� check digit�Դϴ�.
//�� ����� 2�ڸ����� ��쿡�� 2�ڸ����� 10���� ���� �������� check digit�� �˴ϴ�.
//Hint> (11-������)%10�Ǵ�(11total%11)%10;


