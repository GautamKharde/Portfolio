package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _20_StaticWait {
	public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Eclipse TestNG Programes\\FirstJavaProject\\Binary\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			
			
			WebElement singup = driver.findElement(By.xpath("//a[text()='Create New Account']"));
			singup.click();
		
			//static wait
			Thread.sleep(5000); 
			WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
			firstName.sendKeys("Gautam");
			
			WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
			lastName.sendKeys("kharde");
		}

	

}
