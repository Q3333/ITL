package lab.java.core;

import java.util.Scanner;

public class C_H1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int odd  =0;
		int even =0;
		
		System.out.println("Ȧ��, ¦�� ��ȯ�� (0�� �Է½� ����)");
		
		for(;;) {
			int a = s.nextInt();
			
			if (a%2==0&&a!=0) even++;
			else if (a%2==1&&a!=0) odd++;
			else break;
		}
		
		System.out.println("odd : "+odd);
		System.out.println("even : "+even);

	}
	
	

}

//10,11,13Ǯ��