package com.callor.bank.exec;

import com.callor.bank.service.AccService;
import com.callor.bank.service.impl.AccServiceImpmlV1A;

public class AccExecA {
	
	public static void main(String[] args) {
		AccService accService = new AccServiceImpmlV1A();
		
		accService.accInit();
	}

}
