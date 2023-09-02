
package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Absolute {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/Ganesh/OneDrive/Desktop/GitDemo/NEW/index.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("./html/body/div[1]/input[1]")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("./html/body/div[1]/input[2]")).sendKeys("rozman");
		Thread.sleep(3000);
		driver.findElement(By.xpath("./html/body/div[2]/a[1]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("./html/body/div[2]/input[1]")).sendKeys("admin123@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("./html/body/div[3]/a[1]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("./html/body/div[3]/input[1]")).sendKeys("maharashtra");
		Thread.sleep(3000);
		driver.findElement(By.xpath("./html/body/div[3]/a[2]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.quit();

	}
}
