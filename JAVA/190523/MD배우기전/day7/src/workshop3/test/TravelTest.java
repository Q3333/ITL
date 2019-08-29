package workshop3.test;

import workshop3.biz.TravelBiz;
import workshop3.entity.Travel;
import workshop3.util.TravelUtil;

public class TravelTest {

	public static void main(String[] args) {
		TravelBiz biz = new TravelBiz();
		
		 while(true) {
			 printMenu();
			 System.out.print("## �޴� �Է�:");
			 String menu = TravelUtil.getUserInput();
			 if(menu.equals("9")) {
				 break;
			 }else {
			     switch(menu) {
			     case "1" : 
			    	 biz.printTravelListTitle();
			    	 biz.printAllTravels();
			    	 break;
			     case "2" : 
			    	 biz.printTravelListTitle();
			    	 biz.printIndividualTravels();
			    	 break;
			     case "3" : 
			    	 biz.printTravelListTitle();
			    	 biz.printPackageTravels();
			    	 break;
			     case "4" : 
			    	 System.out.println("���� ��ǰ�� �����մϴ�");
			    	 System.out.print("���� �ڵ� �Է�:");
			    	 String travelCode = TravelUtil.getUserInput();
			    	 System.out.print("���� �ο� �Է�:");
			    	 int reserveCount = Integer.parseInt(TravelUtil.getUserInput());
			    	 Travel reservedTravel = null;
			    	 reservedTravel =biz.reserveTravel(travelCode, reserveCount);
			    	 if( reservedTravel.getMaxPeople()- reservedTravel.getReserved() > reserveCount) {
			    		 reservedTravel.setReserved( reservedTravel.getReserved()+reserveCount);
			    		 System.out.println("������ �Ϸ� �Ǿ����ϴ�");
			    		 biz.printTravelListTitle();
			    		 reservedTravel.printTravelInfo();
			    	 }else {
			    		 System.out.print("���� ���� �ο��� �ʰ��Ǿ����ϴ�.");
			    		 System.out.print("(���� ���� �ο�:");
			    		 System.out.print(reservedTravel.getMaxPeople()- reservedTravel.getReserved()+"��)\n");
			    	 }
			     }
			 }//if end
		 }//while end

	}
	public static void printMenu() {
		System.out.println("========<�޴�>========");
		System.out.println("1.��ü ���� ��ǰ ��ȸ");
		System.out.println("2.������������ ��ǰ ��ȸ");
		System.out.println("3.��Ű�� ���� ��ǰ ��ȸ");
		System.out.println("4.���� ��ǰ ����");
		System.out.println("9.����");
		System.out.println("=====================");
	}

}