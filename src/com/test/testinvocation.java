package com.test;

import org.testng.annotations.Test;

public class testinvocation {
	
	@Test(invocationCount=12)
	public void aaa() {
		System.out.println("Heelo 10");
	}

}
