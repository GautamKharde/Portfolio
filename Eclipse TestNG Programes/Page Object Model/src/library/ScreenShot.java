package library;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	
	public static void captureScreenShot(WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourFile = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyToDirectory(sourFile, new File("C:\\Eclipse TestNG Programes\\Page Object Model\\ScreenShots"+timestamp()+".jpeg"));
	}
	public static String timestamp() {
		return new SimpleDateFormat("dd-MM-yyyy HH-mm-ss").format(new Date());
	}

}
