package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByText {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		driver.get("http://www.facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//input[@id ='email']")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//input[@id ='pass']")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//button[@name='login']")).click();
		Thread.sleep(3000);
	}
}
