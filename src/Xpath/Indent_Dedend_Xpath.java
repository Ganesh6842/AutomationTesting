package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Indent_Dedend_Xpath {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.amazon.in");
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//input[@id='twotabsearchtextbox']")).sendKeys("Apple iphone 14 midnight 256");
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//input[@id='nav-search-submit-button']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//span[text()='Apple iPhone 14 (256 GB) - Midnight']/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']//span[text()='76,999']")).click();
	Thread.sleep(3000);
	System.out.println("Task is completed");
}
}
