package com.lg.workshop1.one;

import java.util.Scanner;

public class PrimeNumber {
	public static int getUserInput() {
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}

	public static void main(String[] args) {
		int loop;
	
		for(;;) {
			//A1:
			
			int i=1;
			System.out.println("���ڸ� �Է��ϼ��� (���� :0) :");
			loop = getUserInput();
			if(loop==0) {
				System.out.println("Bye~~");
				break;
			}
			
			do {
				if(loop==1){
					System.out.println(loop+"�� �Ҽ��� �ƴմϴ�.");
					break;
				}
				else if(loop==2){
					System.out.println(loop+"�� �Ҽ��Դϴ�.");
					break;
				}
				
				int cal;
				cal = loop % (1+i); // i�� 2�� �ϸ�?
				
				if (cal==0) {
					System.out.println(loop+"�� �Ҽ��� �ƴմϴ�.");
					break ;
				//	break A1;
				}
				else if(i==loop-2) System.out.println(loop+"�� �Ҽ��Դϴ�.");
				i++;
				
			}
			while(i<loop-1);
		} // for�� ����
			
//			Scanner s = new Scanner(System.in);
//			loop = s.nextInt(); //getUserInput���Ε�����
			
			
//			for(int i=1;i<(loop-1);i++) {
//				int cal;
//				cal = loop % (1+i); // loop i������
//				if (cal==0) {
//					System.out.println(loop+"�� �Ҽ��� �ƴմϴ�.");
//					break ;
//				//	break A1;
//				}
//				else if(loop==1)System.out.println(loop+"�� �Ҽ��� �ƴմϴ�.");
//				else if(i==loop-2)System.out.println(loop+"�� �Ҽ��Դϴ�.");
//			}
			
							
		
	}//main end

}//class end
