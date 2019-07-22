package com.workshop2.test;

import java.util.Scanner;

import com.workshop2.account.Account;

public class TestAccount {
	
	//*�޴� ��ȣ �Ǵ� �ݾ� �Է¹޴� ���
	public static int getUserInput() {
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}
	
	//*�޴� ����ϰ� �޴� �Է¹ޱ�
	public static int getMenuItem() {
		System.out.println("[ Menu ] ");
		System.out.println("1. �Ա� ");
		System.out.println("2. ��� ");
		System.out.println("3. ���� ");
		System.out.println("==> Menu ���� : " );
		return getUserInput();
				
	}
	
	//*�ݾ��� �Է� �޽��ϴ�.
	public static int getAmount() {
		//static �޼ҵ忡���� non-static ����, ��ü, �޼ҵ�, ��� �Ұ�
		return getUserInput();
		
	}


	public static void main(String[] args) {
		
		Account sjs = new Account("CUST01","������","1-22-333",100000);
		int amount =0;
		int menu = 0;
	
		
		sjs.printAccount();
		
		while((menu = getMenuItem())!=9)
		switch(menu) {
		case 1: 
			System.out.print("�ݾ� : ");
			amount = getAmount();
			System.out.println(amount+"���� �Ա��մϴ�.");
						sjs.addBalance(amount);
			System.out.println("=====================");
			System.out.println("���� �ܾ� : " + sjs.getBalance());
			System.out.println("=====================");
			break;
			
		case 2:
			System.out.print("�ݾ� : ");
			amount = getAmount(); 
			System.out.println(amount+"���� ����մϴ�.");
			sjs.subtractBalance(amount);
			System.out.println("=====================");
			System.out.println("���� �ܾ� : " + sjs.getBalance());
			System.out.println("=====================");
			break;
			
		
	} // switch end
		System.out.println("Bye~~");
		
	} // main end

} // class end


