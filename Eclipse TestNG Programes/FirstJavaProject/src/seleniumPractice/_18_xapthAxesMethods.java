package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _18_xapthAxesMethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse TestNG Programes\\FirstJavaProject\\Binary\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement mobiletag = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		mobiletag.click();
		Thread.sleep(1000);
		WebElement redmiCheckbox = driver.findElement(By.xpath("//span[text()='Redmi']//preceding-sibling::div//input"));
		redmiCheckbox.click();
		
		
	}

}
