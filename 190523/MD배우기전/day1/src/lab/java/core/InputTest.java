package lab.java.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest {

	public static void main(String[] args) throws IOException{
		System.out.print("�¾ �⵵�� �Է��ϼ��� : \n");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String year = br.readLine();
		int age = 2019-Integer.parseInt(year); // ���ڿ��� ������ ��ȯ
		System.out.print("Your age is " + age);
	}

}
