package lab.java.core;

public class Tv_Test {

	public static void main(String[] args) {
		Tv t = new Tv(); //��ü ����
		System.out.println(t.color); //�Ӽ��� ����
		System.out.println(t.power);
		System.out.println(t.channel);
		
		t.power();// �޼ҵ� ȣ�� , ����Ű�¸޼ҵ�
		System.out.println(t.power); // ���� ���� Ȯ��
		t.power(); // ���� ��
		System.out.println(t.power);
		
		t.channel = 3;
		System.out.println(t.channel);
		t.channelUp();
		System.out.println(t.channel);
	
	}
	

}
