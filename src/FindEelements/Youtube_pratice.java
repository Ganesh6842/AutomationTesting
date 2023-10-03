package FindEelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class Youtube_pratice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		WebElement browsing = driver.findElement(By.xpath("//input[@name='search_query']"));
		browsing.click();
		Thread.sleep(2000);
		browsing.sendKeys("demon slayer", Keys.ENTER);
		Thread.sleep(3000);
	    driver.navigate().refresh();
		Thread.sleep(3000);
		int a=1;
		while(a!=0) {
		String search = ".//ytd-two-column-search-results-renderer [@class=\"style-scope ytd-search\"]//yt-formatted-string[@class='style-scope ytd-video-renderer']";
		List<WebElement> searchname = driver.findElements(By.xpath(search));
		String view = ".//ytd-two-column-search-results-renderer [@class=\"style-scope ytd-search\"]//yt-formatted-string[@class='style-scope ytd-video-renderer']/ancestor::div[@id='dismissible']//span[@class='inline-metadata-item style-scope ytd-video-meta-block']";
		List<WebElement> view1 = driver.findElements(By.xpath(view));
		String time = ".//ytd-two-column-search-results-renderer [@class=\"style-scope ytd-search\"]//yt-formatted-string[@class='style-scope ytd-video-renderer']/ancestor::div[@id='dismissible']//span[@class='inline-metadata-item style-scope ytd-video-meta-block']";
		List<WebElement> time1 = driver.findElements(By.xpath(time));
         		for (int i = 0; i < searchname.size(); i++) {
			System.out.println("search name:" + searchname.get(i).getText());
			System.out.println("views:" + view1.get(i).getText());
			System.out.println("time:" + time1.get(i).getText());
			Thread.sleep(500);
		}
         	
		}
		
		driver.close();
	}
}
