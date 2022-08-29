package TestNGProgrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FBTest {
	public WebDriver driver;
	
	  @Test( dataProvider = "FBdpprovider",dataProviderClass = FBDataProvider.class)
	  public void fblogin(String username, String password) 
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Eclipse TestNG Programes\\FirstJavaProject\\Binary\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.facebook.com");
		  WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
		  WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
		  WebElement LoginButton = driver.findElement(By.xpath("//button[@name='login']"));
		  UserName.sendKeys(username);
		  Password.sendKeys(password);
		  LoginButton.click();
		  
		  //if login successful or not
		  String ExpectedTitle = "Facebook";
		  String actualTitle = driver.getTitle();
		  Assert.assertEquals(actualTitle, ExpectedTitle);
	  }

}
