package exercise.class2;

import java.util.Random;

public class BaseBall {
	public static int player = 0;
	public static int outCount = 0;
	public static int strike = 0;
	public static int ball = 0;
	
	public static void getStatus() {
//		if(strike == 3) {
//			System.out.printf("%d �ƿ� , %d ��Ʈ����ũ, %d �� ==> %d�ƿ�",outCount,strike,ball,(1+(outCount++)));
//		}
		System.out.printf("%d �ƿ� , %d ��Ʈ����ũ, %d �� ",outCount,strike,ball);
		
	
	}
	
	public static boolean isStrike() {
		int rnum = (int)(Math.random()*2);
		//0,1�� �������� üũ�� = OK 
		// System.out.println("rnum : "+rnum);
		if (rnum ==0) return true;
		else return false;
			
		
		
	}
	
}
