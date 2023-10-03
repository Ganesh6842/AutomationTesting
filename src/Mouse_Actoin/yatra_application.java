package Mouse_Actoin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class yatra_application {
public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver = new FirefoxDriver();
	Thread.sleep(2000);
	driver.get("https://www.yatra.com/");
	Thread.sleep(2000);
	Actions a = new Actions(driver);
	Thread.sleep(2000);
	
//	Thread.sleep(2000);
//	a.scrollByAmount(0, 2000).perform();
//	Thread.sleep(2000);
//	a.scrollByAmount(0, -2000).perform();
//	Thread.sleep(2000);
	
	
//	WebElement tgt_ele = driver.findElement(By.xpath(".//span[text()='+ More']"));
//	Thread.sleep(2000);
//	a.moveToElement(tgt_ele).perform();
//	driver.findElement(By.xpath(".//span[text()='Trains']")).click();
	
	
	WebElement option = driver.findElement(By.xpath(".//img[@alt='Rashtrapati Bhavan']"));
	Thread.sleep(2000);
	a.moveToElement(option).perform();
	Thread.sleep(2000);
	
	
	a.contextClick(option).perform();
	Thread.sleep(2000);
	Robot r = new Robot();
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_V);
	
}
}
