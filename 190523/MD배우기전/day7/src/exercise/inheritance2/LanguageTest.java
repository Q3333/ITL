package exercise.inheritance2;

public class LanguageTest {

	public static void main(String[] args) {
		//��Ӱ��谡 �ִ� ��� �θ�� Ÿ�� ������ ��.
		Language k = new Korean();
		Language e = new English();
		Language j = new Japanese();
		
		k.sayHello();
		e.sayHello();
		j.sayHello();
		
		System.out.println(k.region);
		System.out.println(e.region);
		System.out.println(j.region);
		
		

	}

}
