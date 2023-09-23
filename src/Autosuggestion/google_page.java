package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class google_page {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("selenium maven");
		Thread.sleep(2000);
		List<WebElement> serachfield = driver.findElements(By.xpath(".//div[@class='wM6W7d']"));
		System.out.println("total suggestion-->" + serachfield.size());
		String str = "selenium maven";
		
		
		for (int i = 0; i < serachfield.size(); i++) {
			String check = serachfield.get(i).getText();
			
			if (str.equals(check)) {
				System.out.println("present ");
				
			} 
			System.out.println("text-->" + check);
		}
		
		System.out.println("task over");
		driver.quit();

	}
}
