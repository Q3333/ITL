package lab.java.core;

public class DataType1 {
	
	public static void main(String[] args) {
		boolean success = false;//������ ȣȯ �Ұ�, Ű���� false �Ǵ� true�� �Ҵ簡��
		//�޸𸮴� 1byte�Ҵ�
		System.out.println(success);
		//success = 1;
		
		byte num1 = 127;
		/*byte = ���� ������, 1byte �Ҵ� sign bit�� ������ 7bit�� binary�� ���� 
			     1 or 0 -2^7 ~ 2^7 -1(0�����ԵǾ������Ƿ� 1����) -128~127 */
		System.out.println(num1);
		//num1 = 128; ��ȿ���� �ʰ�
		
		short num2 = 32767;
		//short = �����ڷ���, 2byte �Ҵ� -2^15~2^15-1, -32768~32767
		System.out.println(num2);
		//num2 = 32768; ��ȿ���� �ʰ�
		
		int num3 = 2147483647;
		//int = �����ڷ���, 4byte �Ҵ�, -2^31~2^31-1, -2147483648 ~ 2147473647
		System.out.println(num3);
		//num3 = 2147483648; ��ȿ�����ʰ�
		
		num3 = 077; // 8����
		System.out.println(num3);//����� decimal 10�����ε�
		num3 = 0xff; // 16����
		System.out.println(num3);//����� 10����
		
		
		
		long num4 = 2147483648L; 
		// 4����Ʈ�� ����Ʈ�� 8����Ʈ�θ���°� �ڿ� ��,�ҹ��� L �� �ٿ�����,L����¾ȵ�)
		// long = �����ڷ���, 8byte �Ҵ�, -2^63 ~ 2^63-1
		System.out.println(num4);
		
		
		
		
		///char �����ڷ���, �ڹٴ� unicode ����, 2byte�Ҵ�, 0~2^16-1, 0~65535
		char ch1 = 'A';
		System.out.println(ch1);
		ch1 = 97; //ascii �ڵ� ��
		System.out.println(ch1);
		ch1 = '\u0063'; //unicode �� (�����ڵ��Ǽ���� �ƽ�Ű�� ���ԵǾ�����)
		System.out.println(ch1);
		
		
		
		//�Ǽ� �ڷ���, ���̳ʸ��� �ƴ� �ε��Ҽ��� �������� ���� (������,������), 4byte�Ҵ�
		float num5 = 3.14F; // default �Ǽ� literal ������ double(8byte)
							// �ڿ� F,f�� �ٿ��ָ� 8->4����Ʈ����.
		System.out.println(num5);
		double num6 = 3.14;
		System.out.println(num6);
		num6 = 1.204307E-5;// IEEEǥ������, ������ ��ġ ǥ������
		System.out.println(num6);
		num6 = 1.204307E+9;
		System.out.println(num6);
		
		
		//���ڿ��� Reference Data Type ��ü�ڷ�����
		//*String�� ��ü��.
		String st = new String("JAVA"); //st�� ��ü��, new�� ���� String�̶�� �޸𸮿� st��� ��ü�� ����.
		// new�� ���� ���� �����͸� ��������.
		System.out.println(st);
		System.out.println(st.length());
		
		String st2 = "jjjava"; // ���� �־��൵ st2�� ��ü��
		// heap�޸𸮰� �ƴ϶� String ��� pool �޸� ������ ����.
		System.out.println(st2);
		
		final int PORT = 9000;
		System.out.println(PORT);
		//PORT = 5555; ����� �� ������ �Ұ�����.
		
		
		
	}

}
