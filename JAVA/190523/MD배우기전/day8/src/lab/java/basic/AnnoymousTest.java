package lab.java.basic;

public class AnnoymousTest {

	public static void main(String[] args) {
		//public class Bird implements Animal ���� ���� ����
		//������ ���ÿ� ������ �Ǵ� Ŭ���� = �͸�Ŭ����
		Animal bird = new Animal() {//�͸� Ŭ���� ����
			
			public void move() {
				System.out.println("����");
			}
			
			public void eat() {// �߰��� �Ǵµ� ȣ���� �ȴ�
				System.out.println("����");
			}
		
		};//�͸� Ŭ���� ��������
		
		bird.move();
		//bird.eat(); // Animal interface���� ������ �ȵǾ��־ �ȴ�
					// �̸��� ��� ĳ���õ� �ȴ�
		
	
	}
		
}


