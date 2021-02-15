package com.test;

import org.testng.annotations.Test;

public class ExpectedExceptionAnnotations {
	//it will pass the test cas
	@Test(expectedExceptions=NumberFormatException.class)
	public void method1() {
		String i="10a";
		Integer.parseInt(i);
		System.out.println("HI there ");
		
		
		int b=10;
		String.valueOf(i);
		System.out.println(b);
		
	}

}
