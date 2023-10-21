package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_JS_popus {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	Thread.sleep(2000);
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(.//button)[1]")).click();
	Thread.sleep(2000);
	Alert sp_alert = driver.switchTo().alert();
	String text = sp_alert.getText();
	System.out.println(text);
	Thread.sleep(2000);
	sp_alert.accept();
	
	driver.findElement(By.xpath("(.//button)[2]")).click();
	Alert pm_alert = driver.switchTo().alert();
	pm_alert.sendKeys("selenium");
	pm_alert.dismiss();
}
}
