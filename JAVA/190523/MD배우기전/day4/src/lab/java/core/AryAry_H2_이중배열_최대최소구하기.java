package lab.java.core;

import java.util.Random;

public class AryAry_H2_���߹迭_�ִ��ּұ��ϱ� {
	public static void main(String[] args) {
	
		int arr[][] = new int[3][3];
		int sum = 0;
		int max = 0;
		int min = 100;
		int count =0;
		
		/*Random a = new Random();
		int bc = a.nextInt(100+1);
			*/	
				
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				int c = (int)(Math.random()*100+1);
				
				if(c>max)max=c;
				if(c<min)min=c;
				sum+=c;
			
				arr[i][j]=c;
				System.out.printf("%3d ", arr[i][j]);
								
			}
			count+=arr[i].length;
			System.out.println();
		}
		
		System.out.printf("��� : %.2f\n",(double)sum/count);
		System.out.println("���� : " +sum);
		System.out.println("�ִ밪 : " +max);
		System.out.println("�ּҰ� : " +min);
		
		
	}//main end
}//class end
