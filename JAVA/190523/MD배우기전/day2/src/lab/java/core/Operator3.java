package lab.java.core;

import java.util.Scanner;

public class Operator3 {

	public static void main(String[] args) {
		// ���׿����� (����ǥ������ true�̳� false�̳Ŀ� ���� �����ϴ� ǥ���� 2���� ��.)
		// ���� ǥ����?ǥ����1(true��):ǥ����2(false��)
		// ������ �Է¹޾Ƽ� ¦������ Ȧ������ ����ϴ� Ex)
		
		Scanner input = new Scanner(System.in);
		System.out.println("���� �Է� �ϼ��� => ");
		int num = input.nextInt();
		System.out.println(num %2==0?"¦��":"Ȧ��"); 
		
		double result = 3>4?99.9:90;
		//����� ������ �ڵ����� ū Ÿ������ ����ȯ promotion�� �Ͼ�ϴ�. (ǥ���� ���� ��� ��)
		
		int result2 = (int)(3>4?99.9:90); // ���� int�� �����Ѵٰ� �� ���
		
	}

}
