package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class _14_WebDriverHeadlessExecution {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse TestNG Programes\\FirstJavaProject\\Binary\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions() ;
		options.addArguments("--headless");
		options.addArguments("--disable-notifications"); 
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		
	}

}
