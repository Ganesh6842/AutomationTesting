package javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class myntra_js_app {
	public static void main(String[] args)throws InterruptedException{
	WebDriver driver = new FirefoxDriver();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	Thread.sleep(2000);
	js.executeScript("window.location='https://www.myntra.com/'");
	Thread.sleep(2000);
	driver.manage().window().fullscreen();
	Thread.sleep(2000);
	WebElement tgt_ele = driver.findElement(By.xpath("(.//a[text()='Men'])[1]"));
	Actions a = new Actions(driver);
	a.moveToElement(tgt_ele).perform();
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath(".//a[text()='Sweatshirts']"));
	js.executeScript("arguments[0].click()",ele);
	Thread.sleep(2000);
	js.executeScript("document.getElementsByClassName('brand-more')[0].click();");
	Thread.sleep(2000);
	WebElement window = driver.findElement(By.xpath(".//div[@class='FilterDirectory-panel FilterDirectory-expanded']"));
	WebElement curser = window.findElement(By.xpath("(.//label[text()='Roadster'])[1]"));
	js.executeScript("arguments[0].scrollIntoView()", curser);
	Thread.sleep(2000);
	curser.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//span[contains(@class,'myntraweb-sprite FilterDirectory-close sprites-remove')]")).click();
	Thread.sleep(3000);
//	WebElement roadstar = driver.findElement(By.xpath("(.//div[@class='search-searchProductsContainer row-base']//img)[7]"));
//	Thread.sleep(2000);
//	roadstar.findElement(By.xpath(".//span[text()='ADD TO BAG']")).click();
	
	}
	
}
