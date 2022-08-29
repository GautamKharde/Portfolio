package seleniumPractice;

import java.util.List;

import org.apache.poi.hslf.record.Sound;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_LaunchChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse TestNG Programes\\FirstJavaProject\\Binary\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("gautam");
		driver.findElement(By.id("pass")).sendKeys("1234");
		
		
		List<WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (WebElement linkname : links) {
			System.out.println(linkname.getText());
		}
		
		driver.findElement(By.linkText("Facebook Pay")).click();
//		driver.findElement(By.name("login")).click();
		

	}

}
