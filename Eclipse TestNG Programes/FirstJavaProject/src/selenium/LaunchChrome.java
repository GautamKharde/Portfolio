package selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse TestNG Programes\\FirstJavaProject\\Binary\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourFile = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourFile, new File("C:\\Eclipse TestNG Programes\\FirstJavaProject\\src\\seleniumPractice\\ScreenShots\\"+timestamp()+".jpeg"));

	}
	public static String timestamp() {
		return new SimpleDateFormat("dd-MM-yyyy HH-mm-ss").format(new Date());
	}

}
