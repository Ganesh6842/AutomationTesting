package Element_handleing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WithoutFindelementPaste {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
	
	driver.get("http://demo.actitime.com/login.do");
	Thread.sleep(2000);
    WebElement un = driver.findElement(By.id("username"));
    Thread.sleep(2000);
    un.sendKeys("ganesh malviya");
    Thread.sleep(2000);
	un.sendKeys(Keys.CONTROL,"a");
	Thread.sleep(2000);
	un.sendKeys(Keys.CONTROL,"c");
	Thread.sleep(2000);
	un.sendKeys(Keys.TAB+ " " + Keys.CONTROL,"v");
	Thread.sleep(2000);
	System.out.println("task is completed");
}
}
