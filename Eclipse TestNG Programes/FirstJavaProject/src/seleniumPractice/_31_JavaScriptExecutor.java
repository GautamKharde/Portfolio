package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _31_JavaScriptExecutor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse TestNG Programes\\FirstJavaProject\\Binary\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location='https://demoqa.com/text-box'");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='userName']"));
		js.executeScript("arguments[0].value='Gautam Kharde'", username);
		
		//we can pass value this way also but element need to locate using id 
//		js.executeScript("document.getElementById('userName').value='Gautam Kharde'");
		
		WebElement submitBtn = driver.findElement(By.xpath("//button[@id='submit']"));
		//submitBtn.click();
		js.executeScript("arguments[0].click()", submitBtn);
		
		//paassing custom alert
		js.executeScript("alert('hey you got hacked......!')");
		
		driver.switchTo().alert().accept();
		
		//getting domain name of webpage using JavaScriptExecutor
		String domainName = js.executeScript("return document.domain").toString();
		System.out.println("Domain name of site is : " + domainName);
		
		//getting url of webpage using JavaScriptExecutor
		String URL = js.executeScript("return document.URL").toString();
		System.out.println("URL of site is : " + URL);
		
		//getting title of webpage using JavaScriptExecutor
		String TITLE = js.executeScript("return document.title").toString();
		System.out.println("Title of site is : " + TITLE);
		
		

		
		//vertical scroll down by 600 pixels -----------not using this
		//js.executeScript("window.scrollBy(0,600)");
		
		
		//scroll into view ---this method we will use
		WebElement upload = driver.findElement(By.xpath("//span[text()='Upload and Download']"));
		js.executeScript("arguments[0].scrollIntoView(true)", upload);
		
		WebElement Elements = driver.findElement(By.xpath("//div[text()='Elements']"));
		js.executeScript("arguments[0].scrollIntoView(true)", Elements);
		
		
		//webpage refresh
		//js.executeScript("location.reload()");
		
		String innerText = js.executeScript("return document.documentElement.innerText").toString();
		System.out.println("Inner text of web page: "+innerText);


		
		
		
		
		
	}

}
