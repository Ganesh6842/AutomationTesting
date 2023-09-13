package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class yatra_Automation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.yatra.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//a[@class='blur_class type-active']")).click();
		Thread.sleep(3000);
		WebElement departure = driver.findElement(By.xpath(".//input[@id='BE_flight_origin_city']"));
		Thread.sleep(3000);
		departure.click();
		Thread.sleep(3000);
		departure.sendKeys("pune");
		Thread.sleep(8000);
		WebElement arrival = driver.findElement(By.xpath(".//input[@id='BE_flight_arrival_city']"));
		Thread.sleep(3000);
		arrival.click();
		Thread.sleep(3000);
		arrival.sendKeys("mumbai");
		Thread.sleep(8000);
		driver.findElement(By.xpath(".//input[@class='custom-date-input BE_flight_origin_date']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//td[@id='15/09/2023']")).click();
	
}
}
