package Element_handleing;
// working only srilanka & india final match
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class cricbuzz_india {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.cricbuzz.com/");
		Thread.sleep(2000);
//		WebElement option = driver.findElement(By.xpath(".//div[@id='seriesDropDown']"));
		  
		driver.findElement(By.xpath("(.//li[@class='cb-view-all-ga cb-match-card cb-bg-white'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//a[text()='Scorecard']")).click();
		List<WebElement> player = driver.findElements(By.xpath(".//div[@class='cb-col cb-col-25 ']"));
		Thread.sleep(2000);
		List<WebElement> run = driver.findElements(By.xpath(".//div[@class='cb-col cb-col-8 text-right text-bold']"));
		for (int i = 0; i < 11; i++) {
			String playername = player.get(i).getText();
			String player_run = run.get(i + 1).getText();
			System.out.println(playername + "-->" + player_run);
		}
		Thread.sleep(2000);
		WebElement total = driver.findElement(By.xpath("(.//div[@class='cb-col cb-col-100 cb-scrd-itms'])[13]"));
		System.out.println(total.getText());
		
		Thread.sleep(2000);
		WebElement score = driver.findElement(By.xpath(".//span[@class='pull-right']"));
		System.out.println(score.getText());
		
		Thread.sleep(2000);
		if (total.equals(score)) {
			System.out.println("both are same");
		} else {
			System.out.println("both are not same");
		}
		driver.quit();
		System.out.println("task");
	}
}
