package lab.java.core;

import java.util.Scanner;

public class Exe_18 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("�ڿ��� n�� �Է��ϼ���. : ");
		int a = s.nextInt();
		int n = 1;
		
		for(int i=0;i<a;i++)
		{
			int len=0;
			
			for(int j=0;j<i;j++) {//����ִ� for
				System.out.print(" ");
				len++;
			}
			for(int k=1;k<=a-len;k++) // ���ڳִ� for
				System.out.print(n++);
		
			System.out.println();
		}
		
	}

}
