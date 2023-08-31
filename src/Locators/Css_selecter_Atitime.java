package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Css_selecter_Atitime {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://demo.actitime.com/login.do");
	Thread.sleep(4000);
	driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
	Thread.sleep(4000);
	driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("admin@123");
	Thread.sleep(4000);
	driver.findElement(By.cssSelector("input#keepLoggedInCheckBox")).click();
	Thread.sleep(4000);
	driver.findElement(By.cssSelector("a.initial")).click();
	Thread.sleep(4000);
	driver.quit();
	Thread.sleep(4000);
	System.out.println("task is completed");
	
}
}
