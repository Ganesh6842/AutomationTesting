package FindEelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_count_Links {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		List<WebElement> value = driver.findElements(By.tagName("a"));
		System.out.println(value.size());
		int count1 = 0, count2 = 0;

		for (WebElement link : value) {

			String str = link.getText();
			System.out.println("Total Text" + str);
			String attribute = link.getAttribute("href");
			System.out.println("all attriute:" + attribute);
			if (str.length() > 0) {
				count1++;
			} else {
				count2++;
			}
		}

		System.out.println("visible:" + count1);
		System.out.println("not visible:" + count2);
		driver.quit();
	}
}
