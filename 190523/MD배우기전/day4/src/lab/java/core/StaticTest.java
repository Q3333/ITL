package lab.java.core;

public class StaticTest {
	public static int snum =5; //1�� ���� ���� �ʱ�ȭ
	static {				// Static Initialize Block, �ٸ� �� ���� ������ �켱����
		snum  +=5; 			//  2�� ����               (main ���� ���� ����)
	}
	
	public static void main(String[] args) {
		System.out.println(snum);// 4������ ����
		snum /=4;  //5������ ����
		System.out.println(snum);// 6������ ����

	}

	static { //�޸𸮿� �ʱ�ȭ�ؾ��� �ڵ� ����(�� : ���̺귯�� �ε�,Ư�� ��ü�� ���� �ʱ�ȭ �۾�)
		snum  *=5;
	}//3������ ����
	
}
