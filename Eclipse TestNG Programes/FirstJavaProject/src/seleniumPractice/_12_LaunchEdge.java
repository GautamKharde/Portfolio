package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class _12_LaunchEdge {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Eclipse TestNG Programes\\FirstJavaProject\\Binary\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

	}

}
