package package2;

import package1.Parent;

class Other { // ��ӹ��� ���� other�� �Ӽ��� ���� ����
	public void access() {
		Parent p = new Parent();
		System.out.println(p.name);// �Ӽ� �б�
		p.name = "hi"; // �Ӽ��� ����
		System.out.println(p.name);// ����� name Ȯ��
		
	
	}
}

public class PublicTest{
	public static void main(String[] args) {
	Other o = new Other();
	o.access();
	Child c = new Child();
	c.access();
	}
}