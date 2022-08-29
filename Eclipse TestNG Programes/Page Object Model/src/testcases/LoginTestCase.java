package testcases;

import java.io.IOException;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import library.Browser;
import library.ScreenShot;
import pages.LoginPage;
public class LoginTestCase {
	WebDriver driver;
	LoginPage loginPage;
	@BeforeTest
	public void launchBrowser() {
		driver = Browser.StartBroswer("Chrome", "https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		loginPage = new LoginPage(driver);
		
	}
	
	@Test(priority = 1)
	public void login() {
			loginPage.clickLogin("xyz@gmail.com", "12345");
	}
	@AfterMethod
	public void screenShot(ITestResult result) throws IOException {
		if (ITestResult.FAILURE==result.getStatus()) {
			ScreenShot.captureScreenShot(driver);
		}
	}
	
	@AfterTest
	public void closeBroser() {
		driver.close();
	}
}	
