package lab.java.core;

import java.util.Scanner;

public class Sw_H3 {
	// ��ҹ��� ���� ���� ����� �ϳ� �Է¹޾Ƽ� �����ڷ� �����ϴ� �ܾ� ���,
	// A,B,C�� ó���ϰ� "������ ���ڴ� �غ����Դϴ�." ��� ����մϴ�.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���� ���� �ϳ��� �Է��ϼ���(��ҹ��� ��������) => ");
		
		String st = input.next();
		char ch = st.charAt(0);
		
	
		
		/* ���ڷιٲ�
		switch ((int)ch-64) { //97
		case 33:
		case 1:
			System.out.println("apple"); break; 
		case 34:
		case 2:
			System.out.println("blue"); break;
		case 35:
		case 3:
			System.out.println("cat"); break;
		default:
			System.out.println("���� �غ����Դϴ�.");
		}
		*/
		
		switch (st) { 
		case "A":
		case "a":
			System.out.println("apple"); break; 
		case "b":
		case "B":
			System.out.println("blue"); break;
		case "C":
		case "c":
			System.out.println("cat"); break;
		default:
			System.out.println("���� �غ����Դϴ�.");
		}
		//// case "a"�� �ٲ㺸��
		
		
	}

}
