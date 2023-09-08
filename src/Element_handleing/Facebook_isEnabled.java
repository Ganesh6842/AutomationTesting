package Element_handleing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_isEnabled {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://	www.facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Create new account")).click();
		Thread.sleep(8000);
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("ganesh@gmail.com");
		Thread.sleep(3000);
		WebElement re_enter = driver.findElement(By.name("reg_email_confirmation__"));
		Thread.sleep(3000);
		if (re_enter.isDisplayed()) 
			System.out.println("is displayed");
		 else {System.out.println("Not displayed");}
				Thread.sleep(3000);
		email.sendKeys(Keys.CONTROL, "a" + Keys.DELETE);
		Thread.sleep(3000);
		WebElement re_enter1 = driver.findElement(By.name("reg_email_confirmation__"));
		if (re_enter1.isDisplayed())
			System.out.println("Not displayed");
		else {System.out.println("displayed");}
				driver.quit();
		System.out.println("Task Completed");
	}
}
