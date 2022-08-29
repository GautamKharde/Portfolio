package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	static WebDriver driver;
	
	public static WebDriver StartBroswer(String browserName, String url) {
		
		//if browser is Firefox
		if (browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Eclipse TestNG Programes\\Page Object Model\\Binary\\geckodriver.exe");
			driver = new FirefoxDriver();	
		}
		
		//if broswer is chrome
		else if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Eclipse TestNG Programes\\Page Object Model\\Binary\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
		// if broswer is Edge
		else if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Eclipse TestNG Programes\\Page Object Model\\Binary\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
		
	}

}
