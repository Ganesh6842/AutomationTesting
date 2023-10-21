package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hideen_popup_abhibus {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	Thread.sleep(2000);
	driver.get("https://www.abhibus.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//span[text()='Login/SignUp']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//input[@class='true mobileNo-input']")).sendKeys("7867654449");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(.//input)[5]")).sendKeys("admin");
	Thread.sleep(2000);
	driver.findElement(By.tagName("button")).click();
	Thread.sleep(2000);
	System.out.println("task completed");
	
}
}
