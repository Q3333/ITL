package lab.java.core;

public class for2 {

	public static void main(String[] args) {
		// ���� for��
		for(int r=1; r<4; r++) {//�ళ��, 3��
			for(int c=1;c<4;c++) {//������, 3��
				System.out.print("("+r+","+c+") ");
			}
			System.out.println();
		}

		
		for(int r=1; r<4; r++) {//�ళ��, 3��
			for(int c=1;c<4;c++) {//������, 3��
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		for(int r=1; r<6; r++) {//�ళ��, 3��
			for(int c=1;c<=r;c++) {//������, 3��
				System.out.print("* ");
			}
			System.out.println();
		}
		

}
}

///���� 1�� r��, ���� 1�� c��. (r,c) (r,c+1) (r,c+2) ��