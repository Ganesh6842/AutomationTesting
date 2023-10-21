  package javaScript;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class windos_scroll {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//span[@class='_30XB9F']")).click();
		Thread.sleep(3000);
		WebElement title = driver.findElement(By.name("q"));
		Thread.sleep(3000);
		title.sendKeys("APPLEiphone 14");
		Thread.sleep(3000);
		title.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		for (int i = 1; i <= 4; i++) {
			js.executeScript("window.scrollBy(0,300)");
			Thread.sleep(3000);
		}
		for (int i = 1; i <= 4; i++) {
			js.executeScript("window.scrollBy(0,-300)");
			Thread.sleep(3000);
		}
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,0)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0,document.body.scrollTop)");
		System.out.println("hello");
		
	}
}
	
	

