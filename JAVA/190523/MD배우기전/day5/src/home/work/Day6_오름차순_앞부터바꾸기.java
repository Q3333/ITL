package home.work;

import java.util.Random;

public class Day6_��������_�պ��͹ٲٱ� {

	public static void main(String[] args) {
		int a [] = new int[10];
		Random r = new Random();
		int rannum = 0;
	
		
		for(int i=0;i<a.length;i++) {
			rannum = r.nextInt(100)+1;
			a[i] = rannum;
		} // ���� �迭�� ����ֱ�
		
		
		for(int i = 0 ; i<a.length ; i++)
		
		
		for(int num : a) {
			System.out.print(num +" ");
		}
		
		
		
	} //main end

}// class end
