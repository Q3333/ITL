package lab.java.core;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		int[] lotto = new int[6]; // �ζ� ��ȣ ������ �迭�� �غ�
		//1~45 �������� ���� �����ؼ� �迭 ù��° �濡 ����
		//1~45 �������� ���� �����ؼ� ù��° �濡 ����� ���� �ٸ� ��쿡�� �ι�° �濡 ����
		Random r = new Random();
	
		for(int i=0;i<6;i++) {
			lotto[i] = r.nextInt(45)+1; 
				for(int b=i;b>0;b--) {
					if(lotto[i]==lotto[b-1]) {
						lotto[i] = r.nextInt(45)+1;
					}//���� for�� ����
				}//�ٱ� for������
			System.out.print(lotto[i]+" ");
		}//�ٱ��� if�� ����
			
			
	
	
	}// main end
	}//class end


