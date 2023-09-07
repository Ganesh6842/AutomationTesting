package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sageetha_mobiles {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.sangeethamobiles.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//input[@class='search__home']")).sendKeys("Apple iphone 14 midnight 256");
}
}
