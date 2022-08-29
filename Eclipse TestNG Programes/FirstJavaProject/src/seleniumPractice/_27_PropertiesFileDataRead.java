package seleniumPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _27_PropertiesFileDataRead {

	public static void main(String[] args) throws IOException {
		
		FileInputStream sourceFile = new FileInputStream("C:\\Eclipse TestNG Programes\\FirstJavaProject\\config.properties");
		
		Properties prop = new Properties();
		
		prop.load(sourceFile);
		
		
		System.setProperty(prop.getProperty("key"), prop.getProperty("value"));
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(prop.getProperty("url"));
		
		WebElement userId = driver.findElement(By.xpath("//input[@id='email']"));
		userId.sendKeys(prop.getProperty("username"));
		
		WebElement userPass = driver.findElement(By.xpath("//input[@id='pass']"));
		userPass.sendKeys(prop.getProperty("password"));
		
		WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		loginBtn.click();
		
		
		
	}

}
