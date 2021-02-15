package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//added comments to push
public class AllParamaeters_All {
	@BeforeMethod
	public void homePage() {
		System.out.println("*@BeforeMethod---In home Page");
	}

	@Test(invocationCount=10)
	public void VerifyTitle() {
		System.out.println("******@Test-annotation*******");
	}

	@BeforeClass
	public void beforeclassa() {
		System.out.println("*******@BeforeClass********");
	}

	@BeforeSuite
	public void Beforesuitee() {
		System.out.println("**********@BeforeSuite****");
	}

	@BeforeTest
	public void bbefretest() {
		System.out.println("******@BeforeTest************");
	}

	@AfterTest
	public void aaftertest() {
		System.out.println("this is after test calling ");
	}
	@AfterMethod
	public void aaftermethod() {
		System.out.println("This is aaftermethod");
	}
	@AfterClass
	public void aafterClass() {
		System.out.println("This is aafter class calling");
	}
	@AfterSuite
	public void aafterSuite() {
		System.out.println("this is aaftersuite caling ");
	}

}
