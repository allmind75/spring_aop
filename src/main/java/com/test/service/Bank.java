package com.test.service;

import org.springframework.stereotype.Service;

@Service
public class Bank {
	
	public void checkLogin() {
		System.out.println("������ü - �α���");
	}
	
	public void transfer() {
		System.out.println("������ü - ��ü����");
			int money = 10000;
			int result = money / 0;

	}
	
	public boolean confirm() {
		System.out.println("������ü - Ȯ��");
		return true;
	}

}
