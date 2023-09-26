package FindEelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Redbus_ticket_price {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.redbus.in");
		Thread.sleep(4000);
		WebElement from = driver.findElement(By.id("src"));
		Thread.sleep(2000);
		from.sendKeys("pune");
		Thread.sleep(2000);
		from.sendKeys(Keys.TAB + "Banglore" + Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='18']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//button[text()='SEARCH BUSES']")).click();
		Thread.sleep(8000);
		List<WebElement> allbus = driver.findElements(By.xpath(".//div[@class='clearfix bus-item']"));
            System.out.println(allbus.size());
	}

}
