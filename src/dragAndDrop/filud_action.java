package dragAndDrop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class filud_action {
	public static void main(String[] args) throws InterruptedException {
		RemoteWebDriver driver = new FirefoxDriver();
		Thread.sleep(1000);
		driver.get("http://demo.actitime.com/login.do");
		Thread.sleep(1000);
		WebElement user = driver.findElement(By.id("username"));
		Thread.sleep(1000);
		Actions a = new Actions(driver);
		
//		without bulid &retun type action class there one method perform use multiple action at a time
		/*a.keyDown(Keys.SHIFT).sendKeys(user,"admin").keyUp(Keys.SHIFT).perform();*/
		
//		with bulid class
		/*a.keyDown(Keys.SHIFT).sendKeys(user,"admin").keyUp(Keys.SHIFT).build().perform();*/
		
//		pause method in actions class
		/*a.keyDown(Keys.SHIFT).pause(3000).sendKeys(user,"admin").keyUp(Keys.SHIFT).build().perform();*/
		
//		pause method in side one class duration
		/*a.keyDown(Keys.SHIFT).pause(Duration.ofMinutes(30)).sendKeys(user,"admin").keyUp(Keys.SHIFT).build().perform();*/
		
		
		WebElement pwd = driver.findElement(By.name("pwd"));
		a.sendKeys(pwd,"games").perform();
	}
	}

