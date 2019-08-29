package com.workshop2.test;

import com.workshop2.entity.Movie;

public class MovieTest2_����ȭ {

	public static void main(String[] args) {
		
		Movie[] m = new Movie[] {
			new Movie("������ ���� - ���� ������","���� �轼","��Ÿ��, ����",
					"�϶����� ���",2001,178,"12�� ������"),
			new Movie("Ʈ�������� : ������ ����","����Ŭ ����","SF, �׼�",
					"���̾� ����",2009,149),
			new Movie("���� �����","��ó�� ĿƼ��","���, ���",
					"�ٷ� ���� ��",2003,134,"15�� ������"),
			new Movie("��Ǫ �Ҵ�","��ũ ������","�ִϸ��̼�","�� ��","12�� ������")
			};
		
		System.out.println("<< ��ü ��ȭ ���� ��ȸ >>");
		m[0].printTitle();
		for(int i = 0 ; i<m.length ; i++) {
			m[i].printContent(m[i]);
			}
		System.out.println("----------------------------------------------------------------------");
		System.out.println("<< 2005�� ���� ������ ��ȸ >>");
		m[0].printTitle();
		for(int i = 0 ; i<m.length ; i++) {
			if(m[i].getReleaseYear()<2005) {
				m[i].printContent(m[i]);
			}
				
			System.out.println();	
		}
		System.out.println();
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("<< �ִϸ��̼� ������ ��ȸ >>");
		m[0].printTitle();
		for(int i = 0 ; i<m.length ; i++) {
//			if(m[i].getGenre()=="�ִϸ��̼�") { //�� ��� �ּҰ� �񱳰� ��
			if(m[i].getGenre().contentEquals("�ִϸ��̼�")){ // �� ��찡 ��Ʈ����
				m[i].printContent(m[i]);
			}
			
			
		}
		System.out.println();
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("<< ��Ÿ�� 140�� �̻� ��ȭ ��ȸ >>");
		m[0].printTitle();
		for(int i = 0 ; i<m.length ; i++) {
			if(m[i].getRunTime()>=140) {
				m[i].printContent(m[i]);
			}
			
			
		}
		
		
	
	} // main end

	} // class end
