package TestNGProgrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GroupDependency {
	 public WebDriver driver;
	  
	 
	@Test(groups = "LaunchB")
	public void launchBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse TestNG Programes\\FirstJavaProject\\Binary\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test(groups = "CheckT")
	public void checkTitle() {
//		String expectedTitle = "Facebook - log in or sign up";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
//		Assert.assertEquals(actualTitle, expectedTitle);
//		System.out.println("CheckTitle run.");
	}
	
	@Test(groups = "SignIn")
	public void login() {
		
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("gautam");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("12345");
		
		WebElement loginbutton = driver.findElement(By.xpath("//input[@id='email']"));
		loginbutton.click();
		
		}
	
	@Test(groups = "SignOut")
	public void teardown() {
		driver.close();
	}
}
