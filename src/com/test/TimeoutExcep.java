package com.test;

import org.testng.annotations.Test;

public class TimeoutExcep {
//Method com.test.TimeoutExcep.timeoutErr() 
	// didn't finish within the time-out 2

	@Test(invocationTimeOut = 2)
	public void timeoutErr() {

		for (int i = 0; i < 1099; i++) {
			System.out.println("HI There");
		}
	}
}
