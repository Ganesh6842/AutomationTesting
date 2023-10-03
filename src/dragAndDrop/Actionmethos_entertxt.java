package dragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Actionmethos_entertxt {
public static void main(String[] args) throws InterruptedException {
	RemoteWebDriver driver = new FirefoxDriver();
	Thread.sleep(1000);
	driver.get("http://demo.actitime.com/login.do");
	Thread.sleep(1000);
	WebElement user = driver.findElement(By.id("username"));
	Thread.sleep(1000);
	Actions a = new Actions(driver);
	a.keyDown(Keys.SHIFT).perform();
	Thread.sleep(1000);
	a.sendKeys(user, "admin").perform();
	a.keyUp(Keys.SHIFT).perform();
	Thread.sleep(1000);
	WebElement pwd = driver.findElement(By.name("pwd"));
	a.sendKeys(pwd,"games").perform();
}
}
