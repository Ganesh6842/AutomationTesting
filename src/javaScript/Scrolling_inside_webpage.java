package javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrolling_inside_webpage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.yatra.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("BE_flight_origin_date")).click();
		WebElement tgt_ele = driver.findElement(By.xpath(".//div[contains(text(),'January')]"));
		js.executeScript("arguments[0].scrollIntoView()", tgt_ele);
		

	}
}
