package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _13_LaunchFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Eclipse TestNG Programes\\FirstJavaProject\\Binary\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

	}

}
