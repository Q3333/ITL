package lab.java.core;

import java.util.Scanner;

public class Sw_H4 {
	// ���� ���� �� ��¹���

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Number? ");
		
		int num = input.nextInt();
		
		
		
		switch (num) { 
		case 1:
			System.out.println("Rock"); break; 
		case 2:
			System.out.println("Paper"); break;
		case 3:
			System.out.println("Scissors"); break;
		default:
			System.out.println("I don`t know");
		}
		
		
		//// case "a"�� �ٲ㺸��
		
		
	}

}
