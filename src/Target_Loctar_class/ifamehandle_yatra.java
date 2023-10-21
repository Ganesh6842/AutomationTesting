package Target_Loctar_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ifamehandle_yatra {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.yatra.com/");
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.id("webpush-onsite")));
		Thread.sleep(2000);
		driver.findElement(By.id("deny")).click();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[contains(@src,'/accounts.google.com')]")));
		Thread.sleep(2000);
		driver.findElement(By.id("close")).click();
		
	}

}
