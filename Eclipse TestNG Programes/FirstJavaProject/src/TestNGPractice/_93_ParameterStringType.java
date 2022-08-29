package TestNGPractice;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _93_ParameterStringType {
	public WebDriver driver;
	
	@BeforeClass
	@Parameters("browser")
	public void f(String broswer) {
	  if (broswer.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver .chrome.driver", "C:\\Eclipse TestNG Programes\\FirstJavaProject\\Binary\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.google.com");
	  }
	  else if (broswer.equalsIgnoreCase("edge")) {
		  System.setProperty("webdriver.edge.driver", "C:\\Eclipse TestNG Programes\\FirstJavaProject\\Binary\\msedgedriver.exe");
		  driver = new EdgeDriver();
		  driver.get("https://www.facebook.com");
	  }
	  else if (broswer.equalsIgnoreCase("gecko")) {
		  System.setProperty("webdriver.gecko.driver", "C:\\Eclipse TestNG Programes\\FirstJavaProject\\Binary\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.get("https://www.twitter.com");
	  }
  }
}
