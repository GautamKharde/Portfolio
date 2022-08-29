package TestNGProgrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DependencyOnGroups_Inheritance_ChildClass extends DependencyOnGropus_Inheritance_ParentClass{
	
	@Test(dependsOnMethods = "launchBrowser")
	public void checkTitle() {
//		String expectedTitle = "Facebook - log in or sign up";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
//		Assert.assertEquals(actualTitle, expectedTitle);
//		System.out.println("CheckTitle run.");
	}
	
	@Test(dependsOnMethods = "checkTitle")
	public void login() {
		
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("gautam");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("12345");
		
		WebElement loginbutton = driver.findElement(By.xpath("//input[@id='email']"));
		loginbutton.click();
		
		}
	
	@Test(dependsOnMethods = "login")
	public void teardown() {
		driver.close();
	}

}
