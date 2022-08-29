package TestNGProgrames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterStringType {
  @Test
  @Parameters({"browser"})
  public void launchChrome(String browser) {
	  if (browser.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Eclipse TestNG Programes\\FirstJavaProject\\Binary\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.facebook.com");
	  }
	  else if (browser.equalsIgnoreCase("edge")) {
		  System.setProperty("webdriver.edge.driver", "C:\\Eclipse TestNG Programes\\FirstJavaProject\\Binary\\msedgedriver.exe");
		  WebDriver driver = new EdgeDriver();
		  driver.get("https://www.facebook.com");
	  }
	  else if (browser.equalsIgnoreCase("gecko")) {
		  System.setProperty("webdriver.g.driver", "C:\\Eclipse TestNG Programes\\FirstJavaProject\\Binary\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  driver.get("https://www.facebook.com");
	  }
  }
}
