package lab.java.core;

public class RecursiveTest {
	
	public void method(int n) { //��� �޼���
		if(n==0)
			return;
		System.out.println(n--);
		method(n); // ���ȣ��
	}
	public static void main(String[] args) {
		RecursiveTest test = new RecursiveTest();
		test.method(10);

	}

}
