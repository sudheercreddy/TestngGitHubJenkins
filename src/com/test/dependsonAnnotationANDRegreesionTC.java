package com.test;

import org.testng.annotations.Test;

public class dependsonAnnotationANDRegreesionTC {

	
	@Test(priority=2)
	public void aa() {
		System.out.println("HI there---aa ");
	}
	@Test(dependsOnMethods="cc",invocationCount=1,priority=1,groups="smoke")
	public void bb() {
		System.out.println("HI there----bb ");
	}
	@Test(priority=3)
	public void cc() {
		System.out.println("HI there----cc ");
	//int i =9/0;
	}
	@Test(priority=4,groups="smoke")
	public void dd() {
		System.out.println("HI there----dd ");
	}
	@Test(priority=5,groups="regression")
	public void ee() {
		System.out.println("HI there---ee ");
	}
}
