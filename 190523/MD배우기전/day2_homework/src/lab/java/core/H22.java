package lab.java.core;

import java.util.Scanner;

public class H22 {

	public static void main(String[] args) {

		Scanner num1 = new Scanner(System.in);
		
		System.out.println("�������� �� ������ �ΰ� �Է��Ͻÿ� (����� ����) : ");
		
		int score1 = num1.nextInt();
		int score2 = num1.nextInt();
		
		System.out.println(score1 + " / " + score2 + " = " + (score1/score2) + "..." + (score1%score2) );
		
	}

}
