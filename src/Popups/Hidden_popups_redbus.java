package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hidden_popups_redbus {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='Account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='Login/ Sign Up']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(1);
		Thread.sleep(2000);
		driver.findElement(By.id("mobileNoInp")).sendKeys("7898665445");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(0);
		driver.findElement(By.id("gsi_555047_929440-overlay")).click();
	
			
		System.out.println("task completed");
}
}
