package lab.java.core;

abstract class Animal{
	public abstract void move();
	public abstract void eat();
	//�޸𸮿� ��ü�� �������� ������ �ؾ���.
	public void sleep() {
		System.out.println("zzZZ....");
	}
}

class Dog extends Animal{
	public void move() {
		System.out.println("������");
	}
	
	public void eat() {
		System.out.println("��ļ�");
	}
	
}

public class AbstractTest {

	public static void main(String[] args) {
		// Animal�� �߻��̿��� ��ü������ �ȵǴµ� Dog�� ������.
		Dog dog = new Dog();
		Animal animal = new Dog();
		
		dog.sleep();
		dog.move();
		dog.eat();
		System.out.println("");
		animal.sleep();
		animal.move();
		animal.eat();
	}

}
