package Target_Loctar_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multiple_frame {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("file:///D:/SeleniumMorning/Html/webmain.html");
		Thread.sleep(2000);
		WebElement mainpage = driver.findElement(By.id("fr_X"));
		driver.switchTo().frame(mainpage);
		driver.switchTo().frame(driver.findElement(By.id("fr_A")));
		Thread.sleep(2000);
		driver.findElement(By.id("user")).sendKeys("admin");
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.id("fr_AB")));
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("manager");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.id("fr_Y")));
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.id("fr_B")));
		Thread.sleep(2000);
		driver.findElement(By.id("mailid")).sendKeys("admin@gmail.com");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.id("fr_Z")));
		Thread.sleep(2000);
		driver.findElement(By.id("number")).sendKeys("7867886748");
	}
}
