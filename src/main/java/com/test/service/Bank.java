package com.test.service;

import org.springframework.stereotype.Service;

@Service
public class Bank {
	
	public void checkLogin() {
		System.out.println("계좌이체 - 로그인");
	}
	
	public void transfer() {
		System.out.println("계좌이체 - 이체시행");
			int money = 10000;
			int result = money / 0;

	}
	
	public boolean confirm() {
		System.out.println("계좌이체 - 확인");
		return true;
	}

}
