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

public class TestngAnnotations {
	
	@BeforeSuite
	public void setup() {
		System.out.println("Set the Environment variable");
	}
	@BeforeClass
	public void launchBrowser() {
		System.out.println("@BeforeSuite----Launch the browser");
	}
	@BeforeMethod
	public void enterUrl() {
		System.out.println("@BeforeMethod-----Enter the URL");
	}
	@BeforeTest
	public void  Login() {
		System.out.println("@BeforeTest----Login to the application ");
	}
	@Test
	public void titleOfPage() {
	System.out.println("@Test----Verify the title of the page");	
	}
	@Test
	public void color_of_page() {
	System.out.println("@Test----color_of_page");	
	}
	@AfterTest
	public void  Logout() {
		System.out.println("@AfterTest------Logout the application");
	}
	@AfterMethod
	public void clearSession() {
		System.out.println("@AfterMethod----clear the cookies");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("@AfterClass----close the browser");
	}
	@AfterSuite
	public void closeDBconnections() {
		System.out.println("@AfterSuite---close all the connections");
	}

}
