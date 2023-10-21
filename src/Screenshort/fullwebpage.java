package Screenshort;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class fullwebpage {
public static void main(String[] args) throws IOException {
//	Date currentdate = new Date();
//	System.out.println(currentdate);
//	String ssfile = currentdate.toString().replace(" ", "-").replace(":", "-");
//	System.out.println(ssfile);

	RemoteWebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com/");
//	type casting interface to interface
	TakesScreenshot ss= (TakesScreenshot) driver;
	File img = ss.getScreenshotAs(OutputType.FILE);
//	giving addres path
	String loc="../AutomationTesting/Sceernshot/image_01.png";
//	loctaion inside new intance
	File dest = new File(loc);
	FileUtils.copyFile(img, dest);
}
}
