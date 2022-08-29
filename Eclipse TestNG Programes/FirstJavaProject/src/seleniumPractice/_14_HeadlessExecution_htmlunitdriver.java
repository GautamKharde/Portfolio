package seleniumPractice;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class _14_HeadlessExecution_htmlunitdriver {

	public static void main(String[] args) {
		
		HtmlUnitDriver driver = new HtmlUnitDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());

	}

}


