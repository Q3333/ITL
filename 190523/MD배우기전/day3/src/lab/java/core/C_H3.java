package lab.java.core;

import java.util.Scanner;

public class C_H3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int big =0;
		int small =0;
			
		System.out.println("���� �ΰ��� �Է��ϼ���.");
		int a = s.nextInt();
		int b = s.nextInt();
			
		if (a>b&&a!=b) {big=a;small=b;}
		else if (a<b&&a!=b) {big=b;small=a;}
		else System.out.println("�� ���� �����ϴ�.");
		
		int count = big-small;
		
		for(int i=0;i<=count;i++) {
			System.out.print(small++ +" ");
		}
		
		
		
		/* �� �ڵ�
		 * 
		 * if (start>end) {
		 * 			int temp = start;
		 * 			start = end;
		 * 			end = temp;
		 * }
		 * for int i=start;i<end+1;i++){
		 * 		System.out.print(i+" ")
		 * }
		 * 
		 * 
		 */
	}

}

//10,11,13Ǯ��