package lab.java.core;

public class FinalVar {
	public int flag ; 
	public final int PORT =3000;
	public static void main(String[] args) {
		FinalVar fv = new FinalVar();
		
		
		System.out.println(fv.PORT);
		//fv.PORT=5555; final�� ����� ���� ���� �ȵ�
		System.out.println(fv.flag);
	}

}
