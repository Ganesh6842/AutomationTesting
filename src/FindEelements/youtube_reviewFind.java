package FindEelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class youtube_reviewFind {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		WebElement browsing = driver.findElement(By.xpath("//input[@name='search_query']"));
		browsing.click();
		Thread.sleep(2000);
		browsing.sendKeys("demon slayer");
		Thread.sleep(3000);
		browsing.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		String search = ".//a[@id='video-title']";
		List<WebElement> searchname = driver.findElements(By.xpath(search));
		System.out.println("total:"+ searchname.size());
		String view = ".//a[@id='video-title']/ancestor::div[@id='dismissible']//div[@id='metadata']//span[@class='inline-metadata-item style-scope ytd-video-meta-block']";
		List<WebElement> view1 = driver.findElements(By.xpath(view));
		String time = ".//a[@id='video-title']/ancestor::div[@id='dismissible']//span[@class='inline-metadata-item style-scope ytd-video-meta-block']";
		List<WebElement> time1 = driver.findElements(By.xpath(time));
		for (int a = 0; a < searchname.size(); a++) {
			System.out.println("search name:" + searchname.get(a).getText());
			System.out.println("views:" + view1.get(a).getText());
			System.out.println("time:" + time1.get(a).getText());
		}
		Thread.sleep(3000);
		driver.close();
	}
}
