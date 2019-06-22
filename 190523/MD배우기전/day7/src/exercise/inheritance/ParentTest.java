package exercise.inheritance;

public class ParentTest {

	public static void main(String[] args) {
		Parent p = new Parent(10000,5,5);
		Child c = new Child(5000,3,3);
		GrandChild gc = new GrandChild(2000,1,1);
		
		System.out.println("======== Before ������ ==========");
		p.printStatus();
		c.printStatus();
		gc.printStatus();
		
		c.setCash(0);
		c.setApartment(0);
		c.setBuilding(0);
		
		gc.setCash(gc.getCash()+1000);
		gc.setApartment(gc.getApartment()+1);
		gc.setBuilding(gc.getBuilding()+1);
		
		System.out.println("======== After ������ ==========");
		p.printStatus();
		c.printStatus();
		gc.printStatus();

	}

}
