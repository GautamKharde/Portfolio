package TestNGProgrames;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;


public class GroupTest {
	public WebDriver driver;
	  
	@Test(groups = {"sanity", "regression"}, priority = 1)
	public void launchBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse TestNG Programes\\FirstJavaProject\\Binary\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test(groups = "regression", priority = 2)
	public void checkTitle() {
//		String expectedTitle = "Facebook - log in or sign up";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
//		Assert.assertEquals(actualTitle, expectedTitle);
//		System.out.println("CheckTitle run.");
	}

	@Test(groups = "sanity", priority = 3)
	public void login() {
		
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("gautam");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("12345");
		
		WebElement loginbutton = driver.findElement(By.xpath("//input[@id='email']"));
		loginbutton.click();
		
		}
	
	@Test(groups = {"sanity", "regression"}, priority = 4)
	public void teardown() {
		driver.close();
	}
	
}
