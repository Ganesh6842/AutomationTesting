package Screenshort;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Single_element {
	public static void main(String[] args) throws IOException, InterruptedException {
		RemoteWebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.google.com/");
		WebElement img = driver.findElement(By.xpath("(.//input[@name='btnK'])[2]"));
//		TakesScreenshot ss= (TakesScreenshot) driver;
		 File img1 = img.getScreenshotAs(OutputType.FILE);
//		giving addres path
		String loc="../AutomationTesting/Sceernshot/image_02.png";
//		loctaion inside new intance
		File dest = new File(loc);
		FileUtils.copyFile(img1, dest);
		driver.close();
}
}
