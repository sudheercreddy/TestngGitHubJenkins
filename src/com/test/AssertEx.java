package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEx {
	@Test(expectedExceptions=AssertionError.class)
	public void setup() {
System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.navigate().to("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		driver.navigate().forward();
		String titile=driver.getTitle();
		System.out.println(titile);
		Assert.assertEquals(titile, "Facebook - Log In or Sign Up", "titile is not matching");
		boolean b= driver.findElement(By.id("email")).isEnabled();
		Assert.assertTrue(b, "it is disabled ");
		//Assert.assertEquals(b, false);
		Assert.assertEquals(b, false, "The button is disabled");
	}

}
