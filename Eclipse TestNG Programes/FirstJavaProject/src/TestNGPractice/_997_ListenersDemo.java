package TestNGPractice;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(TestNGPractice._998_ListenerClass.class)
//packagename.className.class
public class _997_ListenersDemo {
	public WebDriver driver;
	
	@Test(priority = 1)
	public void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse TestNG Programes\\FirstJavaProject\\Binary\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		WebElement loginbtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		loginbtn.click();
		
		String ExpectedTitile = "OrangeHRM";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, ExpectedTitile);
		
		
	}
	
	// Forcefully failed test case for demo
	@Test(priority = 2)
	public void failedTest() {
		System.out.println("Failed Test case");
		Assert.assertTrue(false);
	}
	
	// Forcefully Skipped test case for demo
	@Test(priority = 3)
	public void SkippedTest() {
		System.out.println("skipped  Test case");
		throw new SkipException("skip exception thrown......");
	}
	
	@Test(priority = 4)
	public void teardown() {
		driver.close();
	}
}
