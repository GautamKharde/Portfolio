package TestNGProgrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dependencyDemo {
	public WebDriver driver;
	  
	@Test()
	public void launchBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse TestNG Programes\\FirstJavaProject\\Binary\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test(dependsOnMethods = "launchBrowser")
	public void checkTitle() {
//		String expectedTitle = "Facebook";
//		String actualTitle = driver.getTitle();
//		Assert.assertEquals(actualTitle, expectedTitle);
//		System.out.println(driver.getTitle());
		System.out.println("checktitle method");
	}

	@Test(dependsOnMethods = "checkTitle")
	public void login() {		
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("gautam");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("12345");
		
		WebElement loginbutton = driver.findElement(By.xpath("//input[@id='email']"));
		loginbutton.click();
		
	}
	
	@Test(dependsOnMethods = "login")
	public void teardown() {
		driver.close();

	}
	
	
}
