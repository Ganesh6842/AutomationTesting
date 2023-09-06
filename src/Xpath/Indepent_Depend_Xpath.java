package Xpath;
// Xpath expression iphone 14 midnight 128gb
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Indepent_Depend_Xpath {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.amazon.in");
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//input[@id='twotabsearchtextbox']")).sendKeys("Apple iphone 14 midnight 128");
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//input[@id='nav-search-submit-button']")).click();
	Thread.sleep(3000);
//	driver.findElement(By.xpath(".//span[text()='Apple iPhone 14 (128 GB) - Midnight']/ancestor::div[@class='sg-col-inner']//span[text()='66,999']")).click();
	driver.findElement(By.xpath(".//span[text()='Apple iPhone 14 (128 GB) - Midnight']/ancestor::div[@class='sg-col-inner']/../../../..]")).click();
	Thread.sleep(3000);
	System.out.println("Task is completed");
}

}
