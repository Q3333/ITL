package lab.java.core;

public class MethodTest2_�����μ� {

	public void method(String b, int ...c) { // ������ ����� �� �� ���
		System.out.println(c.length);		// �ݵ�� �Ű������� ���� �������� ���
		for(int num : c) {
			System.out.println(num);
		}
	}

	public static void main(String[] args) {
		MethodTest2_�����μ� test = new MethodTest2_�����μ�();
		test.method("java", 5,6,7,8);
		int[] nums = new int[] {100,200,300,400,500};
		test.method("java",nums);
	}

}
