package lab.java.core;

public class For1 {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}



//1. 1~10���� ������
int sum =0;
for(int i=1;i<=10;i++) {
	sum= sum+i;
}

System.out.println("������ = " + sum );

//2. 1~10���� Ȧ���� ���
for(int i=1;i<=10;i++) {
	if(i%2!=0)System.out.println(i);
}

//3. 1~10���� Ȧ���� �������� ���
for(int i=10;i>0;i--) {
	if(i%2!=0)System.out.println(i);
}

//4. A~Z���� ���
for(char ch = 'A';ch<='Z';ch++) {
	System.out.print(ch+" ");
}

//5. A~Z���� �������� ���
for(char ch = 'Z';ch>='A';ch--) {
	System.out.print(ch+" ");
}

}
}