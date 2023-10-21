package thread_replace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitwaitDemo{
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.com.au/");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement tgt_ele = driver.findElement(By.xpath("(.//a[text()='Electronics'])[2]"));
		Actions a = new Actions(driver);
		a.moveToElement(tgt_ele).perform();
//		
//		WebDriverWait wait = new WebDriverWait(driver,10);
//		wait.until(ExpectedCondition.)
//		
	}
}



