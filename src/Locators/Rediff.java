package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rediff {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://register.rediff.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//a[@title='Create Rediffmail Account']")).click();
	Thread.sleep(4000);
	driver.findElement(By.tagName("input")).sendKeys("Ganesh malviya");
	Thread.sleep(4000);
	driver.findElement(By.xpath(".//input[starts-with(@name,'login')]")).sendKeys("ganesh@123");
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//input[@id='newpasswd']")).sendKeys("admin@123");
	Thread.sleep(4000);
	driver.findElement(By.id(".//input[starts-with(@name,'confirm')]")).sendKeys("admin@123");
	
	

	

	}

}
