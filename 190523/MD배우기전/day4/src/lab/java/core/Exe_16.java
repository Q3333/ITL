package lab.java.core;

import java.util.Scanner;

public class Exe_16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("��� ����� ������ ������ �Է��Ͻÿ� : ");
		int a = s.nextInt();
		double abv = 0;
		
		for(int i=1;i<=a;i++) {
			System.out.println("��� ����� ������ " + (a-(i-1)) +"�� �Է��Ͻÿ� ");
			int b = s.nextInt();
			abv = abv + b ; 
		}
		
		abv = abv/a;
		
		System.out.printf("��� �� : %.2f",abv);
		

	}

}
