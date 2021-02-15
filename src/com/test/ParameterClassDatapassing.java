package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterClassDatapassing {
	WebDriver driver;

	@Test
	@Parameters({ "url", "browser" })
	public void setup(String url, String browser) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("ff")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium-drivers\\geckodriver_win32\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get(url);
			driver.close();
	}
}
