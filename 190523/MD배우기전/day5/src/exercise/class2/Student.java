package exercise.class2;

public class Student { //Ŭ���� ����

//�Ӽ� ����
private String studentId ;
private int c;
private int linux;
private int java;

//��ü ������ ���� �ʱ�ȭ�� �����ϴ� ������ �޼���
public Student () { }
public Student (String studentId, int c, int linux, int java ) {
	this.studentId = studentId;
	this.c = c;
	this.linux = linux;
	this.java = java;
}

//����� �����ϴ� ��� �޼���
public String getStudentId() {
	return this.studentId;
}
public void setStudentId(String studentId) {
	this.studentId = studentId;
}

public int getC() { ////get�� this ���� ����(������ Ŭ���� �������� c�� ã�� ����)
	return this.c;
}
public void setC(int c) {
	this.c=c;
}

public int getLinux() {
	return this.linux;
}
public void setLinux(int linux) {
	this.linux = linux;
}

public int getJava() {
	return this.java;
}
public void setJava(int java) {
	this.java=java;
}

public int getTotal() {
	return c+linux+java;
	//return getC()+getLinux()+getJava();
}
@Override
public String toString() {
	return "C : " +getC()+"�� " +"Linux : " +getLinux()+"�� "
			+"Java : " +getJava()+"�� ";
	
}





}//class end
