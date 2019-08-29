package com.workshop2.account;

import java.util.Scanner;

public class Account {
	private String custid;
	private String custName;
	private String accountNumber;
	private int balance;
	
	
	
	public Account(){
		
	}
	public Account(String custId, String custName, String accountNumber, int balance){
		this.custid = custId;
		this.custName = custName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		if(balance<1) {
			System.out.println("�ܾ� �����Դϴ�. : 0��");
			System.exit(0); //0�� ������ ��������, -1�� ������ ����������
		}
		
	}
	
	public String getCustId() {return this.custid;}
	public void setCustID(String custId) {this.custid=custId;}
	
	public String getCustName() {return this.custName;}
	public void setCustName(String custName) {this.custName=custName;}
	
	public String getAccountNumber() {return this.accountNumber;}
	public void setAccountNumber(String accountNumber) {this.accountNumber=accountNumber;}
	
	public int getBalance() {return this.balance;}
	public void setBalance(int balance) {this.balance=balance;}
	
	public void addBalance(int amount) {
		
		if(amount>= 1)this.balance += amount;
		else if(amount<1) System.out.println("�ݾ� �����Դϴ�. : 0��");
		
	}
	public void subtractBalance(int amount) {
		
		if(amount>= 1) {
			if(balance>=amount) this.balance -= amount;		
			else {
				System.out.println("��� �Ұ�!! �ܱ� �����Դϴ�.");
			}
		}
		else if(amount<1) System.out.println("�ݾ� �����Դϴ�. : 0��");
		
	}
	public void printAccount() {
		System.out.println("=====================");
		System.out.println("�� ��ȣ : "+getCustId());
		System.out.println("���� : "+getCustName());
		System.out.println("���¹�ȣ : "+getAccountNumber());
		System.out.println("�ܾ�: "+getBalance() +"��");
		System.out.println("=====================");
		
	}
	
	
}
