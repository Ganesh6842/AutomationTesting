package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Create_Facebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
	driver.get("http://	www.facebook.com");
	driver.findElement(By.partialLinkText("Create new account")).click();
	Thread.sleep(4000);
	driver.findElement(By.name("firstname")).sendKeys("Ganesh");
	Thread.sleep(4000);
	driver.findElement(By.name("lastname")).sendKeys("Malviya");
    Thread.sleep(4000);
	driver.findElement(By.name("reg_email__")).sendKeys("ganesh@gmail.com");
	Thread.sleep(4000);
	driver.findElement(By.name("reg_email_confirmation__")).sendKeys("ganesh@gmail.com");
	Thread.sleep(4000);
	driver.findElement(By.name("reg_passwd__")).sendKeys("ganesh@123");
	Thread.sleep(4000);
	driver.findElement(By.id("day")).sendKeys("29");
	Thread.sleep(4000);
	driver.findElement(By.id("month")).sendKeys("jun");
	Thread.sleep(4000);
	driver.findElement(By.id("year")).sendKeys("1999");
	Thread.sleep(4000);
    driver.findElement(By.xpath("//input[@value='2']")).click();
    Thread.sleep(4000);
    driver.findElement(By.name("websubmit")).click();
    Thread.sleep(4000);
    driver.quit();
	
			
	
	}

}
