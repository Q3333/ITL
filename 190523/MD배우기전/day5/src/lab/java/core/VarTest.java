package lab.java.core;

public class VarTest {
	public int member;
	
	public void method() {
		int local = 3;
		//Ŭ���� ������ ����鰣���� ��ü ���� ���� ���� ��� �����մϴ�.
		System.out.println(member);
		//System.out.println(local);//�ʱ�ȭ�� �����־��� ������ ����
	}
	
	public void method2() {
		method();
		//System.out.println(local); //local������ �ܺο��� ������ �Ұ�����.
	}
	
	public static void main(String[] args) {
		
		VarTest test = new VarTest();
		
		System.out.println(test.member);//main�� VarTest�� ����� �ƴ�.

	}

}
