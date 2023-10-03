package FindEelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class abhibus_text_01 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		driver.get("https://www.abhibus.com/");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(".//a[@id='bus-link']")).click();
		Thread.sleep(6000);
		driver.findElement(By.tagName("svg")).click();
		driver.findElement(By.xpath(".//input[@placeholder='From Station']")).sendKeys("PUNE", Keys.ENTER);
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//input[@placeholder='To Station']")).sendKeys("Banglore", Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//a[text()='Tomorrow']")).click();
		Thread.sleep(3000);
//		List<WebElement> busname = driver.findElements(By.xpath(".//h5[@class='title']"));
	List<WebElement> busname = driver.findElements(By.xpath(".//div[starts-with(@id,'service-operator')]/.."));
       List<WebElement> busprice = driver.findElements(By.xpath(".//strong[@class='h5 fare']"));
       for(int i=0;i<busname.size();i++) {
    	   System.out.println("bus:"+busname.get(i).getText());
    	   System.out.println("price:"+busprice.get(i).getText());
	}
      
}
}