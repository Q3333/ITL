package lab.java.core;

public class Lotto_answer {
	
	public static void main(String[] args) {
		int[] lotto = new int[6];//�ζ� ��ȣ ������ �迭�� �غ�
		for(int i=0; i<lotto.length;i++){
			lotto[i] = (int)(Math.random()*45+1);
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--; // ���� �ٽ� �߱� �޴� ���� J�� �ƴ϶� I��!
					break;
				}
			}
		}
			for(int num : lotto) {
				System.out.print(num+" ");
			}
			
		}
	}


