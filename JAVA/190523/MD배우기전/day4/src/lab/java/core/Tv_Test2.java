package lab.java.core;

public class Tv_Test2 {

	public static void main(String[] args) {
		Tv t = new Tv(); //��ü ����
		System.out.println(t); // �޸� �ּ� ���� �ƴ� �ؽ���?(��ŷ������ ����)
		t.channel = 7;
		
		Tv t2 = new Tv(); //��ü ����2
		System.out.println(t2);
		t2.channel = 16;
		// �ν��Ͻ� ������ ���� ������ ��ü������ �ٸ� ���� ���� �� �ֽ��ϴ�.
		System.out.println(t.channel);
		System.out.println(t2.channel);
		
		t2.channel = t.channel;
		System.out.println(t.channel);
		System.out.println(t2.channel);
		
		Tv t3 = t;//t�� ����Ű�� heap �޸� �� TV�� ���� �ּҰ��� ������. 
		System.out.println(t3);
		System.out.println(t);
		
		
		t.channel = 10;
		
		System.out.println(t.channel);
		System.out.println(t3.channel);
		
		
	}
	

}
