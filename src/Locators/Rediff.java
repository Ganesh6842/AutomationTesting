package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rediff {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	Thread.sleep(3000);
	driver.findElement(By.tagName("input")).sendKeys("admin");
	Thread.sleep(4000);
	driver.findElement(By.xpath(".//input[@id='newpasswd']")).sendKeys("admin@123");
	Thread.sleep(4000);
	driver.findElement(By.id(".//input[@name='confirm_passwdc8630760']")).sendKeys("admin@123");
	Thread.sleep(4000);
	}

}
