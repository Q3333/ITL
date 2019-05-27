package com.workshop2.test;

import com.workshop2.entity.Movie;

public class MovieTest {

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
		System.out.println("----------------------------------------------------------------------");
		System.out.printf("%13s %18s %9s %9s %9s %9s %10s","����","����","�帣","�ֿ�","�����⵵","��Ÿ��","���\n");
		System.out.println("----------------------------------------------------------------------");
		for(int i = 0 ; i<m.length ; i++) {
			System.out.printf("%15s %12s %15s %15s ",m[i].getTitle(),m[i].getDirector(),m[i].getGenre(),m[i].getActor());
			if(m[i].getReleaseYear()!=0)System.out.printf("%6d��",m[i].getReleaseYear());
			if(m[i].getRunTime()!=0)System.out.printf("%5d��",m[i].getRunTime());
			if(m[i].getRating()!=null)System.out.printf("%10s",m[i].getRating());
			System.out.println();
			
		}
		System.out.println("----------------------------------------------------------------------");
		System.out.println("<< 2005�� ���� ������ ��ȸ >>");
		System.out.println("----------------------------------------------------------------------");
		System.out.printf("%13s %18s %9s %9s %9s %9s %10s","����","����","�帣","�ֿ�","�����⵵","��Ÿ��","���\n");
		System.out.println("----------------------------------------------------------------------");
		for(int i = 0 ; i<m.length ; i++) {
			if(m[i].getReleaseYear()<2005) {
				System.out.printf("%15s %12s %15s %15s ",m[i].getTitle(),m[i].getDirector(),m[i].getGenre(),m[i].getActor());
				if(m[i].getReleaseYear()!=0)System.out.printf("%6d��",m[i].getReleaseYear());
				if(m[i].getRunTime()!=0)System.out.printf("%5d��",m[i].getRunTime());
				if(m[i].getRating()!=null)System.out.printf("%10s",m[i].getRating());
				System.out.println();
			}
				
			System.out.println();	
		}
		System.out.println();
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("<< �ִϸ��̼� ������ ��ȸ >>");
		System.out.println("----------------------------------------------------------------------");
		System.out.printf("%13s %18s %9s %9s %9s %9s %10s","����","����","�帣","�ֿ�","�����⵵","��Ÿ��","���\n");
		System.out.println("----------------------------------------------------------------------");
		for(int i = 0 ; i<m.length ; i++) {
			if(m[i].getGenre()=="�ִϸ��̼�") {
				System.out.printf("%18s %12s %15s %15s ",m[i].getTitle(),m[i].getDirector(),m[i].getGenre(),m[i].getActor());
				if(m[i].getReleaseYear()!=0)System.out.printf("%6d��",m[i].getReleaseYear());
				if(m[i].getRunTime()!=0)System.out.printf("%5d��",m[i].getRunTime());
				if(m[i].getRating()!=null)System.out.printf("%10s",m[i].getRating());
				System.out.println();
			}
			
			
		}
		System.out.println();
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("<< ��Ÿ�� 140�� �̻� ��ȭ ��ȸ >>");
		System.out.println("----------------------------------------------------------------------");
		System.out.printf("%13s %18s %9s %9s %9s %9s %10s","����","����","�帣","�ֿ�","�����⵵","��Ÿ��","���\n");
		System.out.println("----------------------------------------------------------------------");
		for(int i = 0 ; i<m.length ; i++) {
			if(m[i].getRunTime()>=140) {
//				System.out.print(m[i].getTitle() + "	" +m[i].getDirector()+ "	"
//							+m[i].getGenre() + "	" +m[i].getActor());
				System.out.printf("%25s %12s %15s %15s ",m[i].getTitle(),m[i].getDirector(),m[i].getGenre(),m[i].getActor());
				if(m[i].getReleaseYear()!=0)System.out.printf("%6d��",m[i].getReleaseYear());
				if(m[i].getRunTime()!=0)System.out.printf("%5d��",m[i].getRunTime());
				if(m[i].getRating()!=null)System.out.printf("%10s",m[i].getRating());
				System.out.println();
			}
			
			
		}
		
		//System.out.printf("%13s %8s %10s %8s ",m[0].getTitle(),m[0].getDirector(),m[0].getGenre(),m[0].getActor());
		
		
		//m[0].getReleaseYear(),m[0].getRunTime(),
		//System.out.printf(%4d,m[i].getReleaseYear()+"��") %3d %8s
	
	} // main end

	} // class end
