package lab.java.core;

import java.util.Scanner;

public class H33 {

	public static void main(String[] args) {
		
		
		Scanner num1 = new Scanner(System.in);
		
		System.out.println("���簢���� ���ο� ������ ���̸� �Է��Ͻÿ� (����� ����) : ");
		
		int score1 = num1.nextInt();
		int score2 = num1.nextInt();
		
		score1 = score1 +5;
		score2 = score2 *2;
		
		System.out.println("width : = " + score1);
		System.out.println("length : = " + score2);
		System.out.println("area : = " + (score1*score2));
		
	}

}
