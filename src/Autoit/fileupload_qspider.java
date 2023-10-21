package Autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fileupload_qspider {
public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver = new FirefoxDriver();
	Thread.sleep(2000);
	driver.get("http://demoapps.qspiders.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//section[text()='Popups']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//section[text()='File Uploads']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//label[text()='Choose a File']")).click();
	Thread.sleep(2000);
//	executing autoit code
	Runtime.getRuntime().exec("../AutomationTesting/Autoit_file/auto1.exe");
	Thread.sleep(2000);
	driver.quit();
}
}
