package TestNGPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _991_AssertsTest {
	public WebDriver driver;	  
	  @Test
	  public void facebookLaunch() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Eclipse TestNG Programes\\FirstJavaProject\\Binary\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.facebook.com");
		  Reporter.log("Welcome to facebook page", true);
		  
		  String expectedTitle = "Facebook – log in or sign Up";
		  String actualTitle = driver.getTitle();
		  Assert.assertEquals(actualTitle, expectedTitle);
		  
		  WebElement fblogo = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		  //fblogo.isDisplayed();
		  Assert.assertTrue(fblogo.isDisplayed());
		  System.out.println("Welcome to testng assert - facebooklaunch");

	  }
	  @Test
	  public void kitelaunch() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Eclipse TestNG Programes\\FirstJavaProject\\Binary\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://kite.zerodha.com");
		  Reporter.log("Welcome to zerodha page", true);
		  
		  String expectedTitle = "Kite - Zerodha's fast and elegant flagship trading Platform ";
		  String actualTitle = driver.getTitle();
		  SoftAssert softAssert = new SoftAssert();
		  softAssert.assertEquals(actualTitle, expectedTitle);
		  
		  WebElement kitelogo = driver.findElement(By.xpath("//img[@alt='Kite']"));
		  //fblogo.isDisplayed();
		  softAssert.assertTrue(kitelogo.isDisplayed());
		  System.out.println("Welcome to testng assert - kite launch");
		  //softAssert.assertAll();
		  
	  }
}
