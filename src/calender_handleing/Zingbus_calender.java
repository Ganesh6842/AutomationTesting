package calender_handleing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Zingbus_calender {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.navigate().to("https://www.zingbus.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//input[@placeholder='From City']")).sendKeys("delhi, delhi");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//input[@placeholder='To City']")).sendKeys("Greater Noida, Uttar Pradesh");
		Thread.sleep(2000);
		driver.findElement(By.id("date")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//td[contains(@class,'__selected')]")).click();
		Thread.sleep(2000);
		System.err.println("task");
	}
}
