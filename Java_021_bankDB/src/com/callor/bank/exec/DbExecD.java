package com.callor.bank.exec;

import com.callor.bank.service.BankService;

public class DbExecD {
	
	public static void main(String[] args) {
		BankService bankService = new BankService();
		bankService.printBuyerList();
		
		bankService.findByBuyer();
		
		
	}

}
