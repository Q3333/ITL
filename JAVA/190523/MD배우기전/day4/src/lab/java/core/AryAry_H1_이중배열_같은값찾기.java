package lab.java.core;

import java.util.Random;

public class AryAry_H1_���߹迭_������ã�� {
	public static void main(String[] args) {
		int ar1[][] = new int[3][4];
		int ar2[][] = new int[3][4];
		
		/*
		Random r = new Random();
		int rnum = r.nextInt(12)+1;
		*/
		
		int a = (int)(Math.random()*12+1);
		int count =0;
		
		System.out.println("ù��° �迭");
		for(int i=0 ; i<(ar1.length);i++) {
			for(int j=0; j<(ar1[0].length);j++) {
				ar1[i][j]=(int)(Math.random()*12+1);
				//System.out.print(ar1[i][j]+" ");
				System.out.printf("%2d ",ar1[i][j]);
			}
			System.out.println();
		}
		System.out.println("�ι�° �迭");
		for(int i=0 ; i<(ar2.length);i++) {
			for(int j=0; j<(ar2[0].length);j++) {
				ar2[i][j]=(int)(Math.random()*12+1);
				//System.out.print(ar2[i][j]+" ");
				System.out.printf("%2d ",ar2[i][j]);
			}
			System.out.println();
		}
		
		
		//// �迭 2�� ���� �� ���� �������.
		
		for(int i=0 ; i<(ar2.length);i++) {
			for(int j=0; j<(ar2[0].length);j++) {
				if(ar1[i][j]==ar2[i][j]) {
					count++;
					System.out.printf("[%d][%d]�� ���� �� %d�� ������ \n",i,j,ar1[i][j]);
				}// if
					
			}// �� for
			
		} //�ٱ� for
		
		System.out.println("���� ���� ���� ����� ���� : "+count);
		
	}//main end
}//class end
