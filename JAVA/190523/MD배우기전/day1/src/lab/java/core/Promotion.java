package lab.java.core;

public class Promotion {

	public static void main(String[] args) {
		short num1 = 32767;
		int num2 = num1; //형 확장 promotion
		System.out.println(num1);
		System.out.println(num2);
		
		float f = 5;
		//num2 = f; // 자동 형변환 지원 안됨, 명시적 형 변환이 필요 -> casting)
		num2 = (int)f;
		System.out.println(f);
		System.out.println(num2);
		
		
		//char와 short,byte 타입 간에는 무조건 casting
		char ch = (char)num1;
		System.out.println(ch);
		ch = 97;
		short num3 = (short)ch;
		System.out.println(ch); // 문자출력
		System.out.println(num3); // 문제아 매핑된 숫자 출력
		
		// boolean은 정수 또는 실수와 형변환 불가.
		// boolean b = false;
		// double d= (double)b;
		
	}
	

}
