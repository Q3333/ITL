package lab.java.core;

import java.util.Scanner;

public class If_H2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� (������ 0~100) => ");
		
		int score = input.nextInt();
		
		if (score>89) System.out.println("A����Դϴ�.");
		else if (score>79) System.out.println("B����Դϴ�.");
		else if (score>69) System.out.println("C����Դϴ�.");
		else if (score>59) System.out.println("D����Դϴ�.");
		else System.out.println("F����Դϴ�.");
		
	}

}
