package seleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class _26_WindowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse TestNG Programes\\FirstJavaProject\\Binary\\chromedriver.exe");
		
		ChromeOptions  options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		
		String MainWindow = driver.getWindowHandle();
		WebElement jobs = driver.findElement(By.xpath("//div[text()='Jobs']"));
		jobs.click();
		
		WebElement companies = driver.findElement(By.xpath("//div[text()='Companies']"));
		companies.click();
		
		//when click on jobs child window get open
		Set<String> childWindows = driver.getWindowHandles();
		
		Iterator<String> iterator = childWindows.iterator();
		
		while(iterator.hasNext()) {
			String child_window = iterator.next();
			if (!MainWindow.equalsIgnoreCase(child_window)) {
				driver.switchTo().window(child_window);
				
				WebElement searchbox = driver.findElement(By.xpath("//input[contains(@placeholder, 'Skills, Designations')]"));
				searchbox.sendKeys("Java, Selenium, TestNG, Automation");
				
				WebElement location = driver.findElement(By.xpath("//input[contains(@placeholder, 'Location/Locality')]"));
				location.sendKeys("Pune");
				
				WebElement searchBtn = driver.findElement(By.xpath("//button[text()='Search ']"));
				searchBtn.click();
			}
		}
		driver.switchTo().window(MainWindow);
		//main window close
		//driver.close();
		
		//close all window
		driver.quit();
		
	}

}
