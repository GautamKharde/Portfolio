package TestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class _995_FireFoxTest {
	public WebDriver driver;
	@Test
	public void launchFirefox() {
		System.setProperty("webdriver.gecko.driver", "C:\\Eclipse TestNG Programes\\FirstJavaProject\\Binary\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com"); 
	}
	
	@Test(priority = 1)
	public void loginfacebook() throws InterruptedException {
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
		username.sendKeys("gautam");
		password.sendKeys("12345");
		btn.click(); 
		Thread.sleep(2000);
	}
	  
	@Test(priority = 2)
	public void checkTitle() {
		  String ExpectedTitile = "Facebook – log in or sign up";
		  String actualTitile = driver.getTitle();
		  Assert.assertEquals(actualTitile, ExpectedTitile);
	}
	
	@AfterClass
	 public void teardown() {
		  driver.quit();
	 }
}
