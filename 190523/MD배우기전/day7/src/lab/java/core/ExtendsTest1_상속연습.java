package lab.java.core;

class Parent {
	String name = "parent";
	private int money = 1000000000;
	public void work() {
		System.out.println("IT");
	}
	private void hobby() {
		System.out.println("2job");
	}
}
class Child extends Parent{ // ���
	
//class Child extends Parent, Movie{ ���� -> ���� ��Ӹ� ������ ��.
	
	
}

public class ExtendsTest1_��ӿ���{
	public static void main(String[] args) {
		
		Child c1 = new Child();
		System.out.println(c1.name);// �θ����� ��ӹ��� name
		c1.name = "child"; //����� �޾Ҿ �ڱ� �ڽ��� ��������� �ؼ� ���� ����.
		System.out.println(c1.name);
		c1.work();// �θ�κ��� ��ӹ��� �޼ҵ�
		
		// c1.money -> �θ��� private �Ӽ��� ��� �Ұ� 
		// c1.hobby() -> �θ��� private �޼ҵ�� ��� �Ұ�
	}
}