package lab.java.core;

import java.util.Scanner;

public class C_H2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		for(int i=1;i<2;i++) {
			System.out.print("Base = ");
			int base = s.nextInt();
			System.out.print("Height = ");
			int height = s.nextInt();
			System.out.println("Triangle width = " + Math.round(base*height*100)/200.0);//�����Դ�
			// Math.round��°�ڸ� 100.0 ��°�ڸ� 1000.0 ���ϰ� ������.
			System.out.println("continue?(Y,y�ϰ�� �ݺ�,�ƴҰ�� �׸�)");
			String st = s.next();
			char con = st.charAt(0); 
			////char con = s.next().charAt(0); ���� ���� �� 
			if(con=='Y'||con=='y')i--;
		}

	}

}

//10,11,13Ǯ��