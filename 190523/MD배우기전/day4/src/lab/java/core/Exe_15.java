package lab.java.core;

import java.util.Scanner;

public class Exe_15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("��� ���� �Է��Ͻÿ� ( ���� 2�� ) : ");
		int a = s.nextInt();
		int b = s.nextInt();
		
		for(int i =1;i<=a;i++) {
			for(int j=1;j<=b;j++) {
				System.out.print(i*j+" ");
			}
			System.out.println();
		}

	}

}
