package lab.java.core;

public class Forfor2 {

	public static void main(String[] args) {
		for(int r=1; r<6; r++) {//�ళ��, 3��
			for(int c=1;c<=r;c++) {//������, 3��
				System.out.print("* ");
			}
			System.out.println();
		}
	
		for(int r=1; r<6; r++) {//�ళ��, 3��
			for(int c=1;c<=6-r;c++) {//������, 3�� Ȥ�� c=6;c>r;c-- 
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
	}
}
