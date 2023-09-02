package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_Script {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(4000);
		driver.findElement(By.partialLinkText("Sign In")).click();
		Thread.sleep(4000);
		driver.findElement(By.partialLinkText("Create an Account")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input#firstname")).sendKeys("admin");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input#lastname")).sendKeys("amazon");
		Thread.sleep(4000);
		driver.manage().window().fullscreen();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input#email_address")).sendKeys("admin123@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input#password")).sendKeys("admin@123");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[name='password_confirmation']")).sendKeys("admin@123");
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//button[@title='Create an Account']")).click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input#email")).sendKeys("admin123@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input#pass")).sendKeys("admin@123");
		Thread.sleep(4000);
//		driver.findElement(By.cssSelector("input[type='submit']")).click();
		driver.findElement(By.name("send")).click();
		Thread.sleep(4000);
		System.out.println("task completed");
	}
}
