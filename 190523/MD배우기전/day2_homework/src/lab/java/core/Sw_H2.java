package lab.java.core;

import java.util.Scanner;

public class Sw_H2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� (������ 0~100) => ");
		
		int score = input.nextInt();
		
		switch (score/10) {
			case 10 : 
			case 9 : System.out.println(score+"���� A����Դϴ�."); break;
			case 8 : System.out.println(score+"���� B����Դϴ�."); break;
			case 7 : System.out.println(score+"���� C����Դϴ�."); break;
			case 6 : System.out.println(score+"���� D����Դϴ�."); break;
			default : System.out.println(score+"���� F����Դϴ�."); 
	}

}
}
