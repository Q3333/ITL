package lab.java.core;

public class Operator {

	public static void main(String[] args) {
		// ���׿����� : +,-(sign ������), (), ++, --, !,~
		int num = -3;
		System.out.println((-num));
		int a = 5, b= 7;
		System.out.println(++a + ++b); //���� ������
		//���� �����ڴ� �ٸ� �����ں��� ���� �����
		System.out.println("a=" +a + ", b= " + b);
		System.out.println(a++ + b++); //���� ������
		//���� �����ڴ� ��� �ٸ� ���� �Ŀ� ���� �ڵ�� �Ѿ�� ������ ������ �ȴ�.
		System.out.println("a=" +a + ", b= " + b);
		System.out.println(!false);
		//System.out.println(!num);
		System.out.println(~num);
		num = 3;
		System.out.println(~num);
		num = 27;
		System.out.println(~num);
		num = -27;
		System.out.println(~num);
		
	}

}
