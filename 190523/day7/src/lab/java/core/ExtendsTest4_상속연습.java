package lab.java.core;

class Parent4 {
		
	} 
	

class Child4 extends Parent4{ // ���
	
	}
	
class Child1 extends Parent4{
	
}


public class ExtendsTest4_��ӿ���{
	public static void main(String[] args) {
		Child4 c4 = new Child4();
		Child1 c1 = new Child1();
		Parent4 p4 = new Parent4();
		// ���۷�������(��ü) instanceof Ÿ��(Ŭ������,�������̽���)
		//�������̽��� ���� �ȹ��
		// �� Ŭ������ �����̳� or ����� �޾ҳ� �� ����� ������
		// return �� true false
		System.out.println(c4 instanceof Child4); // is a ���� üũ
		System.out.println(c4 instanceof Parent4); // ��� ���� üũ
		System.out.println(p4 instanceof Child4); // �θ�� �ڽ��� ��ӹ����� 
												  //�ƴ϶� false�� ���
//		System.out.println(c1 instanceof Child4); // �θ� ���� ��Ӱ��谡 ����
												  //������ �ƿ� ������ ������ ��µ�.
		
	}
}