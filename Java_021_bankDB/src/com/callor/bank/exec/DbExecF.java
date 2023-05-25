package com.callor.bank.exec;

import com.callor.bank.service.BankService;

public class DbExecF {
	
	public static void main(String[] args) {
		BankService bankService = new BankService();
		bankService.insertAccList();
	}

}
