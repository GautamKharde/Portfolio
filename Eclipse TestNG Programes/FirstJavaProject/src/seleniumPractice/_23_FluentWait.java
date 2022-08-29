package seleniumPractice;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class _23_FluentWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse TestNG Programes\\FirstJavaProject\\Binary\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/dynamic-properties");
		driver.manage().window().maximize();
		
		WebElement colorChangeBtn = driver.findElement(By.xpath("//button[@id='colorChange']"));
		
		WebElement enableAfter5SecBtn = driver.findElement(By.xpath("//button[@id='enableAfter']"));
		
		System.out.println("enableAfter5SecBtn is Enabled ? " + enableAfter5SecBtn.isEnabled());
		System.out.println("colorChangeBtn color : " + colorChangeBtn.getCssValue("color"));
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='visibleAfter']")));
		
		System.out.println("enableAfter5SecBtn is Enabled ? " + enableAfter5SecBtn.isEnabled());
		System.out.println("colorChangeBtn color : " + colorChangeBtn.getCssValue("color"));
		
		driver.close();
		
	}

}
