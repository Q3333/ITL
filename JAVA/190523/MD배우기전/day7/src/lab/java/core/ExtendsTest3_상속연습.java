package lab.java.core;

class Parent3 {
		int age = 55;
	} 
	

class Child3 extends Parent3{ // ���
	int age = 26; // �θ�κ��� ��� �޾Ƶ� ������ �̸��� ���� ���� ����.
				  // �� ��� �켱������ �ڽ� Ŭ������ ����
	public void printAge() {
		int age = 23; //���� ������ �ٽ� ���� ����
		System.out.println(age); // ���� ����� ����(scope)���� �˻� ->23
		System.out.println(this.age); // �޼����� ����� �Ӽ��� �б� ->26
		System.out.println(super.age); //��ӹ��� �Ӽ��� �б� ->55
		//thisó�� ��ӹ��� �θ��� Ŭ������ �����ϴ� ������ super(�ڵ�����)
	}
	
	
}

public class ExtendsTest3_��ӿ���{
	public static void main(String[] args) {
		Child3 c = new Child3();
		c.printAge();
	}
}