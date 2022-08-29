package TestNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class _2_NewTest {
	public WebDriver driver;
  @Test
  public void launchChrome() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Eclipse TestNG Programes\\FirstJavaProject\\Binary\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com");
  }
  @Test
  public void launchEdge() {
	  System.setProperty("webdriver.edge.driver", "C:\\Eclipse TestNG Programes\\FirstJavaProject\\Binary\\msedgedriver.exe");
	  driver = new EdgeDriver();
	  driver.get("https://www.facebook.com");
  }
}
