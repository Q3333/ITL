package lab.java.core;

import java.util.Scanner;

public class If_H3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�⵵�� �Է��ϼ���  => ");
		
		int year = input.nextInt();
		
		if (year%4==0) 								{
			if (year%400==0)System.out.println("�����Դϴ�.");
			else if (year%100==0)System.out.println("����Դϴ�.");
			else System.out.println("�����Դϴ�.");		 }
		else System.out.println("����Դϴ�.");

		
	}

}
