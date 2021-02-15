package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCount {

	
	@Test(invocationCount=10)
	public void test() {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https:www.google.com");
		driver.close();

	}
}
