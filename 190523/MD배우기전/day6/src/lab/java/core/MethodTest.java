package lab.java.core;

public class MethodTest {
	int member = 0;
	
	MethodTest(){
		System.out.println("MethodTest() called");
	}
	MethodTest(int a){
		this();
		System.out.println("MethodTest(int) called");
		
	}
	
	public int method1() {
		int local =1;
		return local;
	}
	public void method2(int member) {
		System.out.println(member);
		System.out.println(this.member);
		//Ŭ���� ���ο��� �ڽ��� ��ü �������� �ʰ� this�� ����մϴ�.
		//this�� ��ü �����ɶ� �ڽ��� �����ϴ� reference�����Դϴ�.
		//System.out.println(local);
		System.out.println(method1());
		//�޼ҵ� ���� ����� local������ �޸𸮿� �޼��尡 ȣ�� �� �� �����ǰ�,
		//�޼ҵ� ������ ����Ǹ� GarbageCollet�ǹǷ�, local������ �޼��� �ܺο��� �����Ұ�
	}
	public static void main(String[] args) {
		MethodTest test = new MethodTest(3);
		test.method2(100);
	}

}
