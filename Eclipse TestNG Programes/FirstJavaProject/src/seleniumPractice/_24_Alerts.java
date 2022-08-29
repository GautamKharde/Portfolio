package seleniumPractice;

import java.time.Duration;

import org.bouncycastle.oer.its.ExplicitCertificate;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _24_Alerts {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse TestNG Programes\\FirstJavaProject\\Binary\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		 
		//(1) accept alert :-
		
		WebElement alertBtn = driver.findElement(By.xpath("//button[@id='alertButton']"));
		alertBtn.click();
		//driver.switchTo().alert().accept();
		
		//--------------------------- or we use Explicit wait --------------------------
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		
		
		// (2) alert will aper after 5 seconds :-
		WebElement alertAfter5SecBtn = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		alertAfter5SecBtn.click();
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		
		// (3) alert confirm or cancel :-
		WebElement alertConfirmBtn = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", alertConfirmBtn);
		//alertConfirmBtn.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		
		// (4) 
		WebElement promtButton = driver.findElement(By.xpath("//button[@id='promtButton']"));
		js.executeScript("arguments[0].click()", promtButton);
		driver.switchTo().alert().sendKeys("Gautam");
		driver.switchTo().alert().accept();
		

		
		
	}
}
