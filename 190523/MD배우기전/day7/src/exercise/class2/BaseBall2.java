package exercise.class2;

public class BaseBall2 {
	public static int player = 0;
	public static int outCount = 0;
	public static int strike = 0;
	public static int ball = 0;
	
	public void getStatus() {
		
		// if(a>4)
		
		while(true) {
		System.out.print(" �� ���� => ");
		if(isStrike()) {
			System.out.println("��Ʈ����ũ!!");
			System.out.printf("%d �ƿ� , %d ��Ʈ����ũ, %d ��",outCount,++strike,ball);
			if(strike==3) {
				System.out.print(" ==> "+(++outCount)+"�ƿ�");
				strike =0;
				ball =0;
				System.out.println();
				System.out.println("������ü");
				++player;
				break;
			}
			System.out.println();
			System.out.println();
		}
		else {
			System.out.println("��!!");
			System.out.printf("%d �ƿ� , %d ��Ʈ����ũ, %d ��",outCount,strike,++ball);
			if(ball==4) {
				System.out.print(" ==> "+"1�� ���");
				strike =0;
				ball =0;
				System.out.println();
				System.out.println("������ü");
				++player;
				break;
			}
			System.out.println();
			System.out.println();
		}
	}
}
	
	public boolean isStrike() {
		int rnum = (int)(Math.random()*2);
		//0,1�� �������� üũ�� = OK 
		// System.out.println("rnum : "+rnum);
		if (rnum ==0) return true;
		else return false;
			
	}
	
}