package exercise.class2;

public class BaseBallTest {

	public static void main(String[] args) {
//		
		BaseBall a = new BaseBall();
		
		for(;;) {
			if(a.outCount==3) {
				System.out.println("�����ƿ�! ������ü!!");
				break;
			}
			
			System.out.printf("*********%d��° ���� ���********\n",(a.player+1));
			System.out.println();
			for(;;) {	
				System.out.print(" �� ���� => ");
				if(a.isStrike()) {
					System.out.print("��Ʈ����ũ!!\n");
					a.strike++;
				}
				else {
					System.out.print("��!!\n");
					a.ball++;
				} // else end
					
				a.getStatus();
				
				
				if(a.strike==3) {
					System.out.print(" ==> "+(++a.outCount)+"�ƿ�");
					a.strike =0;
					a.ball =0;
					System.out.println();
					System.out.println("������ü");
					System.out.println();
					++a.player;
					break;
				}
					
				
				if(a.ball==4) {
					System.out.print(" ==> "+"1�� ���");
					a.strike =0;
					a.ball =0;
					System.out.println();
					System.out.println("������ü");
					System.out.println();
					++a.player;
					break;
					}
				System.out.println();
				
			}//���� for�� ����
			
		
		}//�ٱ� for�� ����
					
		
	}// main end
	
	} // class end


