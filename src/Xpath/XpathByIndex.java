package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByIndex {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://demo.actitime.com/login.do");
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//input[@id='username']")).sendKeys("admin");
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//input[@class='textField pwdfield']")).sendKeys("manager");
	
}
}
