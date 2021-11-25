package com.javaex.ex08;

public class Account {

    private String accountNo;//계좌번호
    private int balance;//예금액

    
    //생성자 작성
	public Account() {
		
	}
	public Account(String accountNo) {
		this.accountNo = accountNo;
	}
	public Account(String accountNo, int balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}
    //필요한 메소드 작성
	public void deposit(int money) {//예금
		this.balance = balance + money;
	}
	public void withdraw(int money) {
		if(this.balance>=money) {
			this.balance = balance - money;
		} else {
			System.out.println("예금액이 부족합니다.");
		}
		
	}
	public void showBalance() {
		System.out.println(this.balance);
	}
}
