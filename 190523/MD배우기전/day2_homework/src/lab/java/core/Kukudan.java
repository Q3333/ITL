package lab.java.core;

public class Kukudan {

	public static void main(String[] args) {
		for(int r=1; r<=9; r++) {//�ళ��
			for(int c=2;c<=9;c++) {//������ 
				System.out.print(c+ " * "+r +" = "+r*c+"	");
				//System.out.printf("%dX%d=%2d	", c,r,(c*r));{�����Թ���}
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int r=2; r<=9; r++) {
			for(int c=1;c<=9;c++) {
				System.out.println(r+"*"+c+" = "+(c*r));
			}
			System.out.println();
		}
		
		
	}
}
