package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.css.CSS;

public class _16_CSS_Selector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse TestNG Programes\\FirstJavaProject\\Binary\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		
		
		//css selector with id 
		WebElement username =  driver.findElement(By.cssSelector("input#email"));
//		username.sendKeys("xyz@gmail.com");
		
		
		//css selector with classname
		WebElement password =  driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi"));
		password.sendKeys("12345");
		
		WebElement logbtn = driver.findElement(By.cssSelector("button[name='login']"));
		//logbtn.click();
		 
		
		
		
		 
		//css selector with other attribute
		driver.findElement(By.cssSelector("input#email[class='inputtext _55r1 _6luy']")).sendKeys("xyz@gmail.com");
		driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi[name='pass']")).sendKeys("13456");
		
		//css selector with parent-child relationship
		//driver.findElement(By.cssSelector("div>button[name='login']")).click();
		
		//css selector with substring(^)
		//driver.findElement(By.cssSelector("button[class^='_42ft']")).click();
		
		//css selector with ending text($)
		//driver.findElement(By.cssSelector("button[class$='_51sy']")).click();
		
		//css selector with any text(*)
		driver.findElement(By.cssSelector("button[class*=' _6lth _4jy6 _4jy1']")).click();
		
		

		

	}

}
