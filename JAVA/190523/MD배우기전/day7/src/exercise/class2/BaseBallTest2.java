package exercise.class2;

public class BaseBallTest2 {

	public static void main(String[] args) {
		BaseBall2 b = new BaseBall2();
		
			while(b.outCount!=3) {
			System.out.printf("******** %d��° ���� ��� *********\n",(b.player+1));
			
			b.getStatus();
		}
	
	}

}