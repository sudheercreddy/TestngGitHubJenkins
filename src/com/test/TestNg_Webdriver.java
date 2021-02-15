package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg_Webdriver {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(4000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(4000, TimeUnit.SECONDS);
		driver.get("https://www.seleniumeasy.com/selenium-tutorials/how-to-run-webdriver-in-chrome-browser");

	}

	@Test
	public void verifyTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	@Test
	public void verifyTitle1() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	@Test
	public void VerifySearch() {
		boolean ss=driver.findElement(By.id("edit-search-block-form--2")).isEnabled();
	System.out.println(ss);
	}

	@AfterMethod
	public void closeAll() {
		driver.close();
	}
}
