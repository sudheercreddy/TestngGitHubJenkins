package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	@BeforeClass
	public void login() {
		WebDriver driver = new ChromeDriver();
	}
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\chromedriver_win32\\chromedriver.exe");
	}
	@Test
	public void enterURL() {

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/selenium-tutorials/how-to-run-webdriver-in-chrome-browser");
	}
	@AfterTest
	public void closeCookies() {
		System.out.println("Test executed and deleting cookies");
	}
	

}
