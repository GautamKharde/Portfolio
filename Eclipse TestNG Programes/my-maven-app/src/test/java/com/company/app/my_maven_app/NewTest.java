package com.company.app.my_maven_app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	public WebDriver driver;

	@Test
	public void f() {
		System.out.println("Welcome to selenium maven project.");
	}
	
	@Test
	public void launchChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse TestNG Programes\\my-maven-app\\Binary\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
}
