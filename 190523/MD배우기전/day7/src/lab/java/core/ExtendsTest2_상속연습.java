package lab.java.core;

class Parent2 {
	public Parent2() {
		System.out.println(1);
		// �ذ��� 1: ����Ʈ �����ڸ� �����ؼ� ���� �ȶ�
	} 
	public Parent2(String talent) {
		System.out.println(2);
		//����Ʈ �����ڰ� �ƴ� String���ڸ� ������ �����ڸ� ���� �Ʒ��� ������ ��.
	}
}
class Child2 extends Parent2{ // ���
	// jdk�� ������ �� ����Ʈ �����ڸ� �������
	public Child2() {
		// super();//�׻� �ڵ����� �������, �θ� Ŭ������ ����Ʈ �����ڸ� ȣ���ϴ� �ڵ�
		super("IT");// �ذ��� 2: ���� ��Ʈ�� ���ڸ� ���� �����ڶ� ���� ��Ʈ��"IT"�� �־���
		System.out.println(3);
	}
	public Child2(String talent) {
		// super()�� ����������. �θ�Ŭ������ ����Ʈ ������. -> 1
		System.out.println(4); // ���ڸ� ������ �ڽ� Ŭ������ ������.
		
	}
	
}

public class ExtendsTest2_��ӿ���{
	public static void main(String[] args) {
		Child2 c2 = new Child2();
		Child2 c3 = new Child2("DB");
	}
}