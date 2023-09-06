package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class redBus_Serch {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.redbus.in");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pune");
	Thread.sleep(4000);
}
}
