package lab.java.basic;


class Outer3{
	private int outVar = 5;
	
	public void outerMethod() {
		method();
		//Inner inner = new Inner(); ������ �̹� GC�Ǿ������ �޸𸮿��� �����. �׷��� �ȴ�
		
	}
	
	public void method() {
		int local = 10; // inner class���� ������ �� ���, �ڵ�����
						// final int local = 10; ���� ��ȯ��.(final�߰�)
		class Inner { // Local Inner Class
			public void innerMethod() {
				System.out.println("local = "+local);
				//local +=3;
				//Local Inner Class�� �����ϴ� local������ final�̾�� �մϴ�.
			}
		}
		
		Inner inner = new Inner();
		inner.innerMethod();
	}
	
}
	
	
public class LocalInnerTest {

	public static void main(String[] args) {
		Outer3 outer = new Outer3();
		outer.method();
	}

}
