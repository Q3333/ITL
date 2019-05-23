package lab.java.core;

public class PolyTest extends ExtendsTest {
	
	public void method(Object o) {
		System.out.println(o.toString());
		if(o instanceof String) { // o�� ��Ʈ�� Ÿ������ ���� if��
			System.out.println("length : "+((String)o).length());
		}
		if(o instanceof Integer) {
			System.out.println("intValue : "+((Integer)o).intValue()); 
		}
			}
	
	public final static int PACKAGE = 1;
	public final static void method() {}
	//public abstract final void method2() {} //����

	public static void main(String[] args) {
		PolyTest test = new PolyTest();
		
		//object ȣ��
		Object o = new Object(); 
		test.method(o);
		System.out.println();
		
		//string
		String s = new String("java");
		test.method(s);//�Ķ���� ���޽� �θ�Ÿ������ UpCasting�˴ϴ�.
		System.out.println();
		
		//integer
		Integer integer = new Integer(100);
		test.method(integer); // UpCasting
		//UpCasting���� ���޹��� �Ķ���͸� ���� ��ü�� DownCasting�����մϴ�.
		
		System.out.println();
		
		Object[] obj = {
				new String("Korea"),
				new Integer("100"),
				new Parent(),
				new Child(),
				new Double("0.5")
				
		};
		
		System.out.println(((String)obj[0]).substring(1,3));
		for(Object ob : obj) {
			System.out.println(ob.getClass());
		}

		lab.java.basic.Animal cat = new lab.java.basic.Cat();
		
	
	
	} // main end

} // class end
