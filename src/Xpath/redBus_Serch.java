package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class redBus_Serch {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.redbus.in");
		Thread.sleep(4000);
		WebElement from = driver.findElement(By.xpath(".//label[text()='From']"));
		Thread.sleep(2000);
		from.sendKeys("pune");
		Thread.sleep(2000);
		from.sendKeys(Keys.TAB+"Banglore"+Keys.TAB);
		Thread.sleep(2000);
		
		from.click();
		
	}
}
