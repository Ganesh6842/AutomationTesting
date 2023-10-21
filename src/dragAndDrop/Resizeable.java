package dragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Resizeable {
	public static void main(String[] args) throws InterruptedException {
		RemoteWebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://jqueryui.com/resizable/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement outside_box = driver.findElement(By.xpath(".//iframe[@class='demo-frame']"));
		driver.switchTo().frame(outside_box);
		WebElement box_ele = driver.findElement(By.xpath(".//div/div[3]"));
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.dragAndDropBy(box_ele, 300, 150).perform();
	}
}
