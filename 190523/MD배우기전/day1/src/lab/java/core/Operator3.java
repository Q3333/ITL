package lab.java.core;

public class Operator3 {

	public static void main(String[] args) {
		// �� ������ (>, >=, <, <=, ==, !=)�� ����� �׻� boolean���Դϴ�.
		
		int a = 5, b = 7;
		System.out.println(b==a);
		System.out.println(b!=a);
		//Primitive Data Type�� ���� ���մϴ�.
		//Reference Data Type�� �ּҰ��� �񱳵˴ϴ�.
		
		String s1 = new String("java");
		String s2 = new String("java");
		System.out.println(s1==s2);;
	

		String s3 = "java"; //String ��� pool ������ ��ü ����
		String s4 = "java";
		System.out.println(s3==s4);;
		
		//����, ���� ex) true&true, true&false
		//��Ʈ������ 1&1=>1 , 1&0=>0, 0&0=>0 
		//		 1|1=>1 , 1|0=>1, 0|0=>0
		// 		 1^1=0	, 1^0=>1, 0^0=0
		
		System.out.println(b&a);
		System.out.println(b|a);
		System.out.println(b^a); // ��Ʈ ���� �� ������ ���
		
		System.out.println(true&true);
		System.out.println(false|false);
		System.out.println(true^false); //��Ʈ �����Ŀ� �������� ���
	
	}

}
