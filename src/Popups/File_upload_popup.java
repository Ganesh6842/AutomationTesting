package Popups;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class File_upload_popup {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	Thread.sleep(2000);
	driver.get("file:///D:/SeleniumMorning/Html/web_fileupload.html");
	Thread.sleep(2000);
	WebElement tgt = driver.findElement(By.id("ele"));
	String relativepath = "..//AutomationTesting/Sceernshot/image_01.png";
//	convert relative to absolute path
	File f = new File(relativepath);
	String absolutepath = f.getAbsolutePath();
	tgt.sendKeys(absolutepath);
	System.out.println("task");
}
}
