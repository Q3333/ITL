package lab.java.core;

public class Operator {

	public static void main(String[] args) {
		// �������� &&,|| : ����ǥ���� && ����ǥ����
		System.out.println((3>4 || 'B'>'A'));
		//short circuit ������ ��� ��.
		//����ǥ����1 && ����ǥ����2�� ��� ǥ���� 1�� false�� ǥ����2�� ���� ����. (�̹� &&�� false��,������ �־ ��ŵ)
		//����ǥ����1 || ����ǥ����2�� ��� ǥ���� 1�� true�� ǥ����2�� ���� ����.
		String s = new String("java"); //��ü ����
		String st = null; // ��ü ���� �ϰ�, ���� ����
		System.out.println(st !=null && st.length()==0);
//		System.out.println(st ==null && st.length()==0);
		// ������Ʈ�ͼ���
	}

}
