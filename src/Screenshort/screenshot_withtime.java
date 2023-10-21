package Screenshort;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class screenshot_withtime {

	public static void main(String[] args) throws IOException {
		Date currentdate = new Date();
		System.out.println(currentdate);
		String ssfile = currentdate.toString().replace(" ", "-").replace(":", "-");
		System.out.println(ssfile);

		RemoteWebDriver driver = new FirefoxDriver();
		driver.get("https://www.redbus.in/");
//			type casting interface to interface
		TakesScreenshot ss = (TakesScreenshot) driver;
		File img = ss.getScreenshotAs(OutputType.FILE);
//			giving addres path
//		String loc = "../AutomationTesting/Sceernshot/image_04.png";

		FileUtils.copyFile(img, new File("../AutomationTesting/Sceernshot/image_03" + ssfile + ".png"));
		driver.quit();
	}
}
