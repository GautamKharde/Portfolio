package TestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class _993_NewChromeTest {
	public WebDriver driver;
	@Test
	public void launchChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse TestNG Programes\\FirstJavaProject\\Binary\\chromedriver.exe");
		driver = new ChromeDriver();
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
		Thread.sleep(3000);
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
	

