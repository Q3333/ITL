package lab.java.core;

public class While1 {

	public static void main(String[] args) {
		System.out.println("start");
		int i=0;
		while(i>10) {
			System.out.println(i++);
		}
		
		
		int[] array4 = new int[] {'A','B','C'};
		// array4[3] = 'D'; //����� ���� Runtime Exception
		
		
		for(int j=0;j<array4.length;j++)System.out.println((char)array4[j]);
		
		array4[2] = 'Z';
		
		for( int num : array4) {
			System.out.println((char)num);
		}
		
		System.out.println("end");
	}//main end

}//class end
