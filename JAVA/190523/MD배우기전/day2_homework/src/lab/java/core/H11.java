package lab.java.core;

import java.util.Scanner;

public class H11 {
	
	public static void main(String[] args) {


	Scanner num1 = new Scanner(System.in);
		
	/*
		System.out.println("���� ������ ������ �Է��Ͻÿ� => ");
		int score1 = num1.nextInt();
		System.out.println("���� ������ ������ �Է��Ͻÿ� => ");
		int score2 = num1.nextInt();
		System.out.println("���� ������ ������ �Է��Ͻÿ� => ");
		int score3 = num1.nextInt();
		System.out.println("��ǻ�� ������ ������ �Է��Ͻÿ� => ");
		int score4 = num1.nextInt();
		*/
	
		System.out.println("����, ����, ����, ��ǻ�� ������ ������ �Է��Ͻÿ�(����� ����) => ");
		int score1 = num1.nextInt();
		int score2 = num1.nextInt();
		int score3 = num1.nextInt();
		int score4 = num1.nextInt();
		
		
		System.out.println("Sum : "+(score1+score2+score3+score4));
		System.out.println("Avg : "+(score1+score2+score3+score4)/4);
	
		
		

}
	
}
