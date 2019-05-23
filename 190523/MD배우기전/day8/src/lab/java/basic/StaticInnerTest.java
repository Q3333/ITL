package lab.java.basic;

import lab.java.basic.Outer.Inner;

class Outer2{
	private int outVar = 5;
	static int staticOutVar = 100;
	public void outerMethod() {
		Inner.innerMethod();
	}
	
	 static class Inner {
		public static void innerMethod() {
		//	System.out.println("outVar+="+outVar); // ����(����ƽ�̾ƴ϶�)
			System.out.println("staticOutVar+="+staticOutVar);
			
		}
	}
	 static class Inner2 {
		 static int staticInVar = 1;
	 }
}

public class StaticInnerTest {

	public static void main(String[] args) {
		//Ŭ������ ����ƽ�̶� �׳� �̸����� ȣ�� ����
		Outer2.Inner.innerMethod();
		
		//Outer2 Ŭ������ ����ƽ�� �ƴ϶� ��ü ������ �ʿ���
		Outer2 outer = new Outer2();
		outer.outerMethod();

	}

}
