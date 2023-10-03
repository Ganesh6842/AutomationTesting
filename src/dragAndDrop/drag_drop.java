package dragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	Thread.sleep(2000);
	driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	Thread.sleep(2000);
	WebElement drag_ele = driver.findElement(By.id("draggable"));
	WebElement drop_ele = driver.findElement(By.id("droppable"));
	Actions a = new Actions(driver);
	Thread.sleep(2000);
//	approach -01
//	a.clickAndHold(drag_ele).perform();
//	Thread.sleep(2000);
//	a.moveToElement(drop_ele).perform();
//	Thread.sleep(2000);
//	a.release();
	
//	a.clickAndHold(drag_ele).perform();
//	Thread.sleep(2000);
//	a.release(drop_ele).perform();
	
//	a.clickAndHold(drag_ele).perform();
//	a.moveByOffset(500,500).perform();
	
	
	a.dragAndDropBy(drag_ele, 500, 500).perform();
	
	
}
}
