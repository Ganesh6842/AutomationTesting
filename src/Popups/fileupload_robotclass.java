package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fileupload_robotclass {
public static void main(String[] args) throws InterruptedException, AWTException {
	 WebDriver driver = new FirefoxDriver();
	 Thread.sleep(2000);
	 driver.get("https://www.freepdfconvert.com/");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath(".//a[@class='btn-wrapper upload-btn']")).click();
	 Thread.sleep(2000);
	 Robot r = new Robot();
	 r.keyPress(KeyEvent.VK_G);
	 Thread.sleep(2000);
	 r.keyPress(KeyEvent.VK_DOWN);
	 Thread.sleep(2000);
	 r.keyPress(KeyEvent.VK_ENTER);
	 	
}
}
