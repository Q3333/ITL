package exercise.basic.diary;

import java.util.Scanner;

public class MyDiaryTest_��ü�迭����2 {

	public static int getUserInput() {
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}

	
	
	public static void main(String[] args) {
		
		MyDiary[] arr = new MyDiary[] {
				new MyDiary("����Ʈ, ",1,5,"�������"),
				new MyDiary("����",1,7,"����"),
				new MyDiary("������",1,30,"������"),
				new MyDiary("OPEN API",5,13,"IT������ ��������"),
				new MyDiary("�߱�",2,3),
				new MyDiary("�����",2,20,"����"),
				new MyDiary("��ȭ",3,3,"��Ǫ�Ҵ�"),
				
		};
		
		int inputNumber  = 0;
		
		for(;;){
			int count = 1;
			System.out.println("##�� �Է� (���� : -1) => ");
			inputNumber = getUserInput();
			for(int j=0;j<arr.length;j++) {
				if(arr[j].getMonth()==inputNumber) {
					System.out.print((count)+"."+arr[j].getMonth()+"�� ");
					System.out.print(arr[j].getDay()+"�� : "+arr[j].getTitle());
					if(arr[j].getDesc()!=null) {
						System.out.print(", "+arr[j].getDesc());
					}
					System.out.println();
					count++;
				}//if�� end
			}//for�� end
			
			if(inputNumber==-1) {
				System.out.println("���α׷��� �����մϴ�!!");
				break;
			}	
			if(count==1) System.out.println(inputNumber+"���� ��ϵ� ������ �����ϴ�.");
			
		}
		
		
	}

}
