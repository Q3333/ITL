package lab.java.core;

public class Array1 {

	public static void main(String[] args) {
		// �迭 ������� 1��°
		int[] score = new int[5];// ���� , []�� ��ġ�� ���� ��������� Ÿ�� �ڷ� �ϴ°� ����
		// �⺻���� ����Ʈ 0 ���� ��
		char ch;
		
		System.out.println("�迭�� ������ = "+score.length);
		
		for(int i=0;i<score.length;i++) {
			System.out.println("score["+i+"]="+score[i]);
		}
		
		// �迭 ������� 2��°
		int[] score2 = new int[] {100,300,500,700,900,901,902};
		// ������ �ϸ鼭 ����� �ʱ�ȭ�� ����.
		
		System.out.println("�迭�� ������ = "+score2.length);
		for(int num : score2) { // �迭 ��ü���� ���������� �ϳ��� ��Ҹ� ������
			System.out.println(num);
		}
		
		
		//�迭 ������� 3��°
		int[] score3 = {100,300,500};
		for(int num : score3) { 
			System.out.println(num);
		}
	}

}
