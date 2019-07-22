package erercise.overall.hero;

public abstract class Hero implements CanFly, CanSwim, CanFight {
	
	public void fly() {
		System.out.println(this.toString()+"�� ����.");
	}
	public void fight() {
		System.out.println(this.toString()+"�� ���ģ��");
	}
	public void swim() {
		System.out.println(this.toString()+"�� �ο��.");
	}
	abstract void action();
	
	
}
