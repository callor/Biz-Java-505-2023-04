package com.callor.bank.exec;

import com.callor.bank.service.BuyerService;
import com.callor.bank.service.impl.BuyerServiceImplV1A;

public class BuyerExecA {
	
	public static void main(String[] args) {
		BuyerService buService = new BuyerServiceImplV1A();
		buService.inputBuyer();
	}

}
