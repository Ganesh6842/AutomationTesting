package List_box_handleing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook_listbox {
public static void main(String[] args) throws AWTException, InterruptedException {
	 WebDriver driver = new FirefoxDriver();
	 Thread.sleep(2000);
	 driver.get("https://www.facebook.com/");
	 driver.findElement(By.linkText("Create new account")).click();
	 
	 Thread.sleep(2000);
	 driver.findElement(By.id("day")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath(".//option[text()='19']")).click();
	 
	 Thread.sleep(2000);
	 WebElement month_list = driver.findElement(By.id("month"));
	 month_list.click();
	 Robot r = new Robot();
	 Thread.sleep(2000);
	 r.keyPress(KeyEvent.VK_UP);
	 r.keyPress(KeyEvent.VK_UP);
	 Thread.sleep(2000);
	 r.keyPress(KeyEvent.VK_UP);
	 r.keyPress(KeyEvent.VK_ENTER);
	 
	 Thread.sleep(2000);
	WebElement year = driver.findElement(By.id("year"));
	Select s = new Select(year);
//	s.selectByIndex(9);
//	s.selectByValue("2009");
	s.selectByVisibleText("1990");
	
}
}
