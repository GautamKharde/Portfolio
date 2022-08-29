package TestNGPractice;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class _97_FBDataProviderTest {	
	
  public WebDriver driver;
  
  @Test(dataProvider = "dp")
  public void fblogin(String username,  String password) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Eclipse TestNG Programes\\FirstJavaProject\\Binary\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  WebElement name = driver.findElement(By.xpath("//input[@id='email']"));
	  WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
	  WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
	  name.sendKeys(username);
	  pass.sendKeys(password);
	  btn.click();
	  String ExpectedCTitle = "Facebook";
	  String ActualTitle = driver.getTitle();
	  Assert.assertEquals(ActualTitle, ExpectedCTitle);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "gautam", "12345" },
      new Object[] { "gautamhrishi", "12345" },
    };
  }
  
  
  
}
