package TestNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _8_ParentClass {
	public WebDriver driver;
	@Test
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse TestNG Programes\\FirstJavaProject\\Binary\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com"); 
	}

}
