package lab.java.core;

import java.util.Scanner;

public class Sw_H1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� => ");
		
		int num = input.nextInt();
		
		switch (num%2) { 
		case 0:
			System.out.println(num+"�� ¦���Դϴ�."); break; 
		case 1:
			System.out.println(num+"�� Ȧ���Դϴ�.");
		}
		
	}

}
