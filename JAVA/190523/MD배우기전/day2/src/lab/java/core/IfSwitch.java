package lab.java.core;

import java.util.Scanner;

public class IfSwitch {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("�� ���ڸ� �Է��ϼ��� => ");
		
		String st = input.next();
		char ch = st.charAt(0); //�߿� @@@@@ ch�� ����, 0�� ù����
				
		if(ch>47 && ch<58) {
			System.out.println(st+"�� �����Դϴ�.");
							}
		else if(ch>64 && ch<91){
			System.out.println(st+"�� ���� �빮���Դϴ�.");
								}
		else if(ch>96 && ch<123){
			System.out.println(st+"�� ���� �ҹ����Դϴ�.");
								}
		else {
			System.out.println("������������");
			}
		
		
		

	}

}
