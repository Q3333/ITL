package lab.java.core;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		//Math.random�Լ��� 0<= N <1 �� ��������(doubleŸ��)
		int rnum = (int)(Math.random()*100+1);//0���ܶ� +1??
		
		Random r = new Random();
		int rnum2 = r.nextInt(100)+1;//0~99�� +1�� ����.
		
		System.out.println(rnum);
		System.out.println(rnum2);
	}

}
