package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg_priority_Groups_dependsOnMethods {

	@BeforeMethod
	public void setUp() {
		System.out.println("@BeforeMethod");
	}
	@AfterMethod
	public void closeUp() {
		System.out.println("@AfterMethod");
	}
	@Test(priority=3,groups="hate")
	public void aa() {
		System.out.println("aa");
		//int i=9/0;
	}
	@Test(priority=2,groups="hate",dependsOnMethods="aa")
	public void bb() {
		System.out.println("bb");
		int i=9/0;
	}
	@Test(priority=4,groups="love",dependsOnMethods="aa")
	public void cc() {
		System.out.println("cc");
	}
	@Test(priority=1,groups="love")
	public void dd() {
		System.out.println("dd");
	}
	
}
