package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	Thread.sleep(4000);
	driver.findElement(By.tagName("input")).sendKeys("Ganesh Malviya");
	Thread.sleep(4000);
	driver.findElement(By.tagName("text")).sendKeys("ganeshmalviya");
	Thread.sleep(4000);
	driver.findElement(By.id("newpasswd")).sendKeys("chacha@123");
	Thread.sleep(4000);
	}

}
