package com.lao.javalearning;

public class BankAccount {
	
	long accountnumber=123456789l;
	String holdername="ramkumar";
	Integer accountbalence=789;
	
	public void getbalence() {
		
		System.out.println("Balence is "+ accountbalence);		
	}
	public void getholdername() {
		
		System.out.println("holdername is "+ holdername);
	}
	
	public static void main(String[]args) {
		
		BankAccount account = new BankAccount();
		account.getbalence();
		account.getholdername();
	}

}
