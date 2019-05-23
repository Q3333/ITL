package com.workshop2.account;

public class Account {
 private String customerId;
 private String customerName;
 private String accountNumber;
 private int balance;

 public Account(String customerId, String customerName, String accountNumber, int balance) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.accountNumber = accountNumber;
	this.balance = balance;
}

public String getCustomerId() {
	return customerId;
}

public String getCustomerName() {
	return customerName;
}

public String getAccountNumber() {
	return accountNumber;
}

public int getBalance() {
	return balance;
}
 

public void withdraw(int money) {
	
	System.out.println("[���] "+money+"���� ����մϴ�.");
	
	if(money<0) {
		System.out.println("[����] ������ ����� �� �����ϴ�.");
	}
	else if (balance < money) {
		System.out.println("[����] �ܾ��� �����մϴ�.");
	}
	else {
		balance = balance - money;
	}
}

public void deposit(int money) {
	System.out.println("[�Ա�] "+money+"���� �Ա��մϴ�.");
	
	if(money<0) {
		System.out.println("[����] ������ �Ա��� �� �����ϴ�.");
	}
	else {
		balance = balance + money;
	}
}

public void printAccountInfo() {
	System.out.println("====================");
	System.out.println("����ȣ : "+customerId);
	System.out.println("���� : "+customerName);
	System.out.println("���¹�ȣ : "+accountNumber);
	System.out.println("�ܾ� : "+balance);
	System.out.println("====================");
	
}
 
}
