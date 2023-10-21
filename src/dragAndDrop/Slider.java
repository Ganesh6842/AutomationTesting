package dragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Slider {
	public static void main(String[] args) throws InterruptedException {
		RemoteWebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/slider/#colorpicker");
		WebElement outside_box = driver.findElement(By.xpath(".//iframe[@class='demo-frame']"));
		Thread.sleep(2000);
		driver.switchTo().frame(outside_box);
		WebElement greenslider = driver.findElement(By.xpath("/html/body/div[2]/span"));
		Thread.sleep(2000);

		Actions a = new Actions(driver);
		a.dragAndDropBy(greenslider, 125, 225).perform();
	}
}
