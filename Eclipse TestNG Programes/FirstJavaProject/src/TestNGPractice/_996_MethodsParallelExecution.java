package TestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _996_MethodsParallelExecution {
	
	public WebDriver driver;
	@Test
	public void launchChrome() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse TestNG Programes\\FirstJavaProject\\Binary\\chromedriver.exe");
		
		//run method headless
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com"); 
		
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
		username.sendKeys("gautam");
		password.sendKeys("12345");
		btn.click(); 
		Thread.sleep(3000);

		 
		String ExpectedTitile = "Facebook";
		String actualTitile = driver.getTitle();
		Assert.assertEquals(actualTitile, ExpectedTitile);
		driver.quit();
	
	}
	
	@Test
	public void launchEdge() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Eclipse TestNG Programes\\FirstJavaProject\\Binary\\msedgedriver.exe");
		
		//run method headless
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--headless");
		
		driver = new EdgeDriver(options);
		driver.get("https://www.facebook.com"); 
		
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
		username.sendKeys("gautam");
		password.sendKeys("12345");
		btn.click(); 
		Thread.sleep(3000);
		
		
		String ExpectedTitile = "Facebook";
		String actualTitile = driver.getTitle();
		Assert.assertEquals(actualTitile, ExpectedTitile);
		driver.quit();
		
	}
	
	@Test
	public void launchFirefox() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Eclipse TestNG Programes\\FirstJavaProject\\Binary\\geckodriver.exe");
		
		// run method headless
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--headless");
		
		driver = new FirefoxDriver(options);
		driver.get("https://www.facebook.com"); 
		
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
		username.sendKeys("gautam");
		password.sendKeys("12345");
		btn.click(); 
		Thread.sleep(3000);
		
		
		String ExpectedTitile = "Facebook";
		String actualTitile = driver.getTitle();
		Assert.assertEquals(actualTitile, ExpectedTitile);
		driver.quit();
		
	}
}
