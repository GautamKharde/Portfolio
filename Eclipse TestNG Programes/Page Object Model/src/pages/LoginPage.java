package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	//Object Repository
//	By userName = By.xpath("//input[@id='email']");
//	By password = By.xpath("//input[@id='pass']");
//	By logInBtn = By.xpath("//button[@name='login']");
//	By forgetPassword = By.xpath("//a[text()='Forgotten password?']");
//	By createNewAccount = By.xpath("//a[text()='Create New Account']");
//	
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement userName;
	
	@FindBy(xpath = "//input[@id='pass']")
	WebElement password;
	
	@FindBy(xpath = "//button[@name='login']")
	WebElement logInBtn;
	
	@FindBy(xpath = "//a[text()='Forgotten password?']")
	WebElement forgetPassword;
	
	@FindBy(xpath = "//a[text()='Create New Account']")
	WebElement createNewAccount;
	
	public void clickLogin(String Username, String Password) {
		userName.sendKeys(Username);
		password.sendKeys(Password);
		logInBtn.click();
	}
}
