package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Create_atitime {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.actitime.com/free-online-trial");
		Thread.sleep(4000);
		driver.findElement(By.id("FirstName")).sendKeys("Ganesh");
		Thread.sleep(4000);
		driver.findElement(By.id("LastName")).sendKeys("Malviya");
		Thread.sleep(4000);
		driver.findElement(By.id("Email")).sendKeys("Malviya@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.id("Company")).sendKeys("Qsider");
		Thread.sleep(4000);
		driver.findElement(By.partialLinkText("Let's Go")).click();
		Thread.sleep(4000);
		driver.quit();
		
	}
	
}
