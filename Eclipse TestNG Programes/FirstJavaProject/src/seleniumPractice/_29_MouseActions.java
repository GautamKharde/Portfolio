package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _29_MouseActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse TestNG Programes\\FirstJavaProject\\Binary\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement doubleclickbtn = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		act.doubleClick(doubleclickbtn).perform();
	
		
		WebElement rightclickbtn = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		act.contextClick(rightclickbtn).perform();
		
		//scrolldown page for element visibility
		WebElement buttons = driver.findElement(By.xpath("//span[text()= 'Buttons']"));
		act.moveToElement(buttons).perform();
		
		WebElement clickbtn = driver.findElement(By.xpath("//button[text()='Click Me']"));
		act.click(clickbtn).perform();
		
		
		//mouseover action 
		driver.navigate().to("https://www.naukri.com");
		
		WebElement serices = driver.findElement(By.xpath("//div[text()='Services']"));
		act.moveToElement(serices).perform();
		
		
		//drag and drop action
		driver.navigate().to("https://demoqa.com/droppable");
		
		WebElement dragMe = driver.findElement(By.xpath("//div[text()='Drag me']"));
		WebElement dropHere = driver.findElement(By.xpath("//div[@id='draggable']//following-sibling::div"));
		act.dragAndDrop(dragMe, dropHere).perform();
		
		
		

	}

}
