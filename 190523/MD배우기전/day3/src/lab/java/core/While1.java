package lab.java.core;

public class While1 {

	public static void main(String[] args) {
		int count =0;
		while(count<10) {
			System.out.print(++count +" ");
		}
		System.out.println();
		System.out.println();

		
		
		//1. 1~10���� ������
		count = 0;
		int sum =0;
		
		while(count<10) {
			++count;
			sum += count; // sum = sum+ count
						  // sum =+ count? -> sum = count �� 10���� �Ͱ� ���� ���
						  // �� sum = 1, sum =2 ... sum = 10�̿��� ����� sum = 10�� �����.
			
			//�����մ� sum +=++count;
		}
		System.out.println("1~10������ �������� = " + sum);
		System.out.println();
		
		//2. 1~10���� Ȧ���� ���
		
		count = 0;
		
		while(count<10) {
			++count;
			if(count%2!=0)System.out.println("1~10�� Ȧ�� " + count);
			
			//�����Դ� count 0, while(count<10),if(++count%2==1) System.out.println(count);
		}
		System.out.println();
		
		//3. 1~10���� Ȧ���� �������� ���
		
		count = 10;
		
		while(count>0) {
			if(count%2!=0)System.out.println("1~10�� Ȧ���� ���� " +count);
			count--;
		}
		System.out.println();
		
		
	}
}
