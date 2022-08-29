package TestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _6_DependsOnMethods {
	public WebDriver driver;
	@Test
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse TestNG Programes\\FirstJavaProject\\Binary\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com"); 
	}
	
	@Test(dependsOnMethods = "launchBrowser")
	public void checkTitile() {
//		System.out.println("check title");
		String expectedTitle = "Facebook – log in or sign up";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(dependsOnMethods = "checkTitile")
	public void login() {
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
		username.sendKeys("gautam");
		password.sendKeys("12345");
		btn.click();
	}
	@Test(dependsOnMethods = {"login", "checkTitile"})
	public void teardown() {
		driver.close();
	}
}
