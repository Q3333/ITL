package lab.java.core;

public class StaticTest {
	static int snum; //Ŭ���� ����
	int num; // �ν��Ͻ� ����
	
	public static void staticMethod() {
		snum++; // Ŭ���� ���� ó�� ����
		//num++; // �ν��ͽ� ���� ó�� �Ұ���
	}
	
	public void method() {
		snum++;
		num++;
	}
	
	public static void main(String[] args) {
		StaticTest test = new StaticTest();
		
		// method(); ��ü ���� �ʿ�
		// System.out.println(num); ��ü ���� �ʿ�
		
		test.method();
		System.out.println(test.num);
		
		staticMethod();
		System.out.println(snum);
		

	}

}
