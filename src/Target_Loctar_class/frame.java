package Target_Loctar_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frame {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	driver.get("file:///D:/SeleniumMorning/Html/web5.html");
	Thread.sleep(2000);
	driver.findElement(By.id("user")).sendKeys("admin");
//	switch from main page to iframe
//	driver.switchTo().frame(0);
//	driver.switchTo().frame("fr_1");
	Thread.sleep(2000);
	WebElement tgt = driver.findElement(By.xpath(".//iframe"));
	driver.switchTo().frame(tgt);
	driver.findElement(By.id("pass")).sendKeys("manager");
	Thread.sleep(2000);
	driver.findElement(By.id("mailid")).sendKeys("admin@gmail.com");
//	again iframe page to main page
	driver.switchTo().parentFrame();
//	driver.switchTo().defaultContent();
	Thread.sleep(2000);
	driver.findElement(By.id("number")).sendKeys("6897098067");
}
}
