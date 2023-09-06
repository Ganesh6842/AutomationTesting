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
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("a.initial")).click();
//	process in not work at a time
	Thread.sleep(9000);
	driver.findElement(By.xpath(".//div[text()='Tasks']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//div[@class='modeButton table active']")).click();
	Thread.sleep(3000);
//	All element click
//	driver.findElement(By.xpath(".//div[@class='img'][1]")).click();   single element
    driver.findElement(By.xpath(".//div[@class='img']")).click();
	Thread.sleep(3000);
//	Last element
	driver.findElement(By.xpath("(.//div[@class='img'])[last()]")).click();
//	Thread.sleep(3000);
//	first five element with index
	driver.findElement(By.xpath("(.//div[@class='img'])[position()<=5]")).click();
    Thread.sleep(3000);
//	Last five element with help of index
	driver.findElement(By.xpath("(.//div[@class='img'])[position()>last()-5]")).click();
	Thread.sleep(3000);
//	odd element
//	driver.findElement(By.xpath("(.//div[@class='img'])[position()mod 2=1]")).click();
	Thread.sleep(3000);
//  even element 	
//	driver.findElement(By.xpath("(.//div[@class='img'])[position()mod 2=0]")).click();
	Thread.sleep(3000);
	System.out.println("Task is Completed");
	
}
}
