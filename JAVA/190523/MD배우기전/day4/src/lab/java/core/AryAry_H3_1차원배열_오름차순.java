package lab.java.core;

import java.util.Random;

public class AryAry_H3_1�����迭_�������� {
	public static void main(String[] args) {
	
		int[] array = new int[10];
		
		for(int r = 0;r < array.length;r++) {
			array[r] = (int)(Math.random()*100+1);
		}
		
		//�������ƾƾƾƾƻ���̤��������
		
		int len = array.length;
		int count =0;
		
		System.out.println("���� ��");	
		for(int r = 0; r< array.length;r++) {
			System.out.print(array[r]+" ");
		}
			
		System.out.println();
		
		for (int i=0; i<len; i++) {
			int max =0;
			for (int j=0;j<(len-i);j++) {
				if(array[j]>max) {
					max=array[j];
					count = j;//max���� ���� j�� ����س��� ����.
				}
			}
			max = array[len-i-1];//i�� ���ư� ���� �� �ڿ��� �������� ��ĭ��
			array[len-i-1]=array[count];
			array[count] = max;
			//�� ���ڸ��� �ڸ��ٲٱ�.
			
		}
		
		
		System.out.println("���� ��");
		for(int r = 0; r< array.length;r++) {
			System.out.print(array[r]+" ");
		}
			
		
	}//main end
}//class end
