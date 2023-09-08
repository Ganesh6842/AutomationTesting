package Css_color;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class FindColor_andChangeType {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://demo.actitime.com/login.do");
	Thread.sleep(2000);
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(2000);
	 WebElement errormsg = driver.findElement(By.xpath(".//span[contains(text(),'Username')]"));
	 Thread.sleep(2000);
	  String error_size = errormsg.getCssValue("font-size");
	  System.out.println("Error colorsize:"+ error_size);
	  String error_color = errormsg.getCssValue("color");
	  System.out.println("Error color is :"+ error_color);
//	  convert to rgb to hexa
	  String colorhexa = Color.fromString(error_color).asHex();
	  System.out.println("Errormsg hexa:"+ colorhexa);
	 
}
}
