package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _17_xpathAxesMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse TestNG Programes\\FirstJavaProject\\Binary\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		// relative xpath with And OR method
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy' and @name='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[ @name='pass' or @type='password']")).sendKeys("12345678");
		//driver.findElement(By.xpath("//button[ @name='login' or @type='submit']")).click();
		
		//relative xpath with text function
		//driver.findElement(By.xpath("//button[ text()='Log In']")).click();
		
		//realtive xpath with contains text() method
		//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		//contains text()
		driver.findElement(By.xpath("//a[contains(text(), 'Forgotten')] ")).click(); 
		
		
	}

}
