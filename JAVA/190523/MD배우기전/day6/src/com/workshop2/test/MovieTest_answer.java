package com.workshop2.test;

import com.workshop2.entity.Movie;

public class MovieTest_answer {

	public static void main(String[] args) {
		Movie[] movies = new Movie[] {
			new Movie("������ ���� - ���� ������","���� �轼","��Ÿ��, ����",
						"�϶����� ���",2001,178,"12�� ������"),
			new Movie("Ʈ�������� : ������ ����","����Ŭ ����","SF, �׼�",
					"���̾� ����",2009,149),
			new Movie("���� �����","��ó�� ĿƼ��","���, ���",
					"�ٷ� ���� ��",2003,134,"15�� ������"),
			new Movie("��Ǫ �Ҵ�","��ũ ������","�ִϸ��̼�","�� ��","12�� ������")
		};
	
		System.out.println("<< ��ü ��ȭ ���� ��ȸ >>");
		
		

	}
	
	public static void printTitle2() {
	System.out.println("----------------------------------------------------------------------");
	System.out.printf("\t����\t\t ����\t �帣\t�ֿ�\t�����⵵ ��Ÿ��\n");
	System.out.println("----------------------------------------------------------------------");
	}
}
