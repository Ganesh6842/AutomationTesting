package Mouse_Actoin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import Locators.Css_Selecter;

public class testautomationpratice {
public static void main(String[] args) throws InterruptedException {
	RemoteWebDriver driver = new FirefoxDriver();
	Thread.sleep(2000);
	driver.navigate().to("https://testautomationpractice.blogspot.com");
	driver.manage().window().fullscreen();
	WebElement drag_ele = driver.findElement(By.id("draggable"));
	Thread.sleep(2000);
	WebElement drop_ele = driver.findElement(By.id("droppable"));
	Thread.sleep(2000);
	
	Actions a = new Actions(driver);
	a.scrollByAmount(0,800).perform();
	a.dragAndDrop(drag_ele, drop_ele).perform();
	Thread.sleep(2000);
	WebElement tgt_ele = driver.findElement(By.id("country"));
	tgt_ele.click();
	Select s = new Select(tgt_ele);
	List<WebElement> all = s.getOptions();
	System.out.println(all.size());
//	print all option
	for (int i = 0; i < all.size(); i++) {
		String alllist = all.get(i).getText();
		System.out.println("country-->" + alllist);
	}
	s.selectByVisibleText("India");
	Thread.sleep(2000);
	a.scrollByAmount(0,-400).perform();
	
	List<WebElement> check_box = driver.findElements(By.xpath(".//label[@class='form-check-label']"));
	System.out.println("*******************");
	for(int i=2;i<check_box.size();i++) {
		String days_name = check_box.get(i).getText();
		System.out.println("daysname-->"+days_name);
	}
	
}
}
