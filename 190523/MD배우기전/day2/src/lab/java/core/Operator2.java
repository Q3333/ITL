package lab.java.core;

public class Operator2 {

	public static void main(String[] args) {
		// shift ������ (<<,>>,>>>)
		
		int a = 3;
		System.out.println(a<<5); // ��Ʈ�� �������� 5ĭ�̵�, ������ ��Ʈ�� 0���� ä��
								  // 1,2 -> 32,64 = 96 or
							      // x << y -> x * 2^y�� ����, �� 3*2^5 = 3*32
		int b = 256;
		System.out.println(b>>3); // ��Ʈ�� ���������� 3ĭ�̵�, ���� ��Ʈ�� sign��Ʈ��ä��
								  // X>>Y�� X/2^Y�� ����� ����.
								  // 256 >> 3�� 256/8
		
		System.out.println(-b>>3);// ����� ������ ���鶩 2�� ������ ���ϸ� ��.
								  // ���� byte���� �ٽ� ����� ���� �� �ٽ� 2�� ����
								  // ���
		
		System.out.println(b>>>3); // >>>�� ���������� ��Ʈ�� �̵���Ű��, ���ʺ�Ʈ�� ������ 0���� ä��
		System.out.println(-b>>>3); // >>�� �޸� sign��Ʈ�� ä��°� �ƴ�, ���� ���X
	
	
		b += 4; // b = b+4; �� ���� �ǹ�, �������� ������.
		System.out.println(b);
	
	}

}
