package seleniumPractice;

import org.apache.poi.hslf.record.Sound;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _25_Frames {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse TestNG Programes\\FirstJavaProject\\Binary\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
		String Mainwindow = driver.getWindowHandle();
		
		//passing id to frame
		driver.switchTo().frame("frame1");
		
		WebElement sampleHeading = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(sampleHeading.getText());
		
		//backto main window
		//driver.switchTo().parentFrame();
		driver.switchTo().window(Mainwindow);
		
		//passing id to frame
		driver.switchTo().frame("frame2");
		
		WebElement sampleHeading1 = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(sampleHeading1.getText());
		
		driver.switchTo().window(Mainwindow);
		WebElement pagetext = driver.findElement(By.xpath("//div[contains(text(), 'Sample Iframe page There ')]"));
		System.out.println(pagetext.getText());
	}

}
