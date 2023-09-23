package table_script_perform;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class books {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/SeleniumMorning/Html/book.html");
		List<WebElement> row = driver.findElements(By.xpath(".//tr"));
		System.out.println("row-->" + row.size());
		System.out.println("******************");
		List<WebElement> book = driver.findElements(By.xpath(".//tr/td[2]"));
		List<WebElement> cost = driver.findElements(By.xpath(".//tr/td[3]"));
		
       int sum =0;
		for (int i = 0; i < 4; i++) {
			String text = book.get(i).getText();
			String amount = cost.get(i).getText();
			   int o= Integer.parseInt(amount);
			   sum+=o;
			System.out.println(text+"-->"+amount);
		}
		System.out.println("************************8");
		System.out.println(sum);
	}
}
