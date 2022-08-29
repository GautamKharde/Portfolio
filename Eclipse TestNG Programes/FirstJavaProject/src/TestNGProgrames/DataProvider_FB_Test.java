package TestNGProgrames;

import org.testng.annotations.Test;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class DataProvider_FB_Test {
	public WebDriver driver;
	
  @Test(dataProvider = "dp")
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

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "gautamkharde1995@gmail.com", "123456789" },
      new Object[] { "gautam", "12345" },
    };
  }
}
