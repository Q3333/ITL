package lab.java.core;

import java.util.Scanner;

public class W_H1 {

	public static void main(String[] args) {
		
		int num = 1;
		int count = 0;
		Scanner input = new Scanner(System.in);
		
		while(num!=0) {
		//System.out.println("������ �Է��ϼ��� (0�� �Է½� ����)");
		num = input.nextInt();
		if(num%3!=0&&num%5!=0)count++;
		}
		
		System.out.println("3�� 5�� ����� ������ ������ ���� : "+count);
		
		
		/*������ ��
		 * int count =0;
		 * Scanner input = new Scanner(System.in);
		 * while(true){
		 * int num = input.nextInt();
		 * if(num==0) break;
		 * if((num%3==1||num%3==2)&&num%5!=0){
		 * 			count++;
		 * }	 * 
		 * 
		 * } // while end
		 * System.out.println("3�� 5�� ����� ������ ������ ���� : "+count");
		 */
		
	}

}
