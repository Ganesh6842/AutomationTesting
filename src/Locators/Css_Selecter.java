package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Css_Selecter {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	driver.get("file:///D:/SeleniumMorning/Html/web.html");
	Thread.sleep(4000);
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("admin");
	Thread.sleep(4000);
	driver.findElement(By.cssSelector("input[type = 'password']")).sendKeys("admin@123");
	Thread.sleep(4000);
	driver.findElement(By.cssSelector("input[type='button']")).click();
	Thread.sleep(4000);
	driver.close();
	System.out.println("this task is completed");
}
}
