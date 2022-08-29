package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _30_KeyBoardActions {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse TestNG Programes\\FirstJavaProject\\Binary\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement username = driver.findElement(By.xpath("//input[@id='userName']"));
		act.sendKeys(username, "Gautam Kharde").perform();
		
		//moving to next field of form
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("gautamkharde1995@gmail.com").perform();
		
		//moving to next filed of form
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("A/p:- Tisgaon, Tal:- Rahata, Dist:- Ahmednagar Maharashtra").perform();
		
		//keydown "control+a" to select all text
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.build().perform();
		
		//KeyUp relase control key
		act.keyUp(Keys.CONTROL).perform();
		
		//keydown "control+c" to copy all text
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.build().perform();
		
		//KeyUp relase control key
		act.keyUp(Keys.CONTROL).perform();
		
		//moving to next filed
		act.sendKeys(Keys.TAB).perform();
		
		//keydown "control+v" to paste all text
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.build().perform();
		
		//relase control key
		act.keyUp(Keys.CONTROL).perform();
		
		
		//moving towards submit button
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.ENTER).perform();
		 
		//scrolldown page 
		WebElement form = driver.findElement(By.xpath("//div[text()='Forms']"));
		act.scrollToElement(form).perform();
		
		
		
	}
}
