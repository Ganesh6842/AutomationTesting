package FindEelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Atitime_chcekbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.actitime.com/login.do");
		WebDriver rv = new FirefoxDriver();
		rv.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		rv.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		rv.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		rv.findElement(By.id("loginButton")).click();
		Thread.sleep(8000);
		rv.findElement(By.xpath(".//div[@id='container_tasks']")).click();
		Thread.sleep(3000);
		List<WebElement> checkbox = rv.findElements(By.xpath(".//div[@class='checkbox inactive']"));
		int count=0;
		for(WebElement total : checkbox) {
			WebElement ind = checkbox.get(0);
						System.out.println(ind.getText());
						count++;
		}
		System.out.println(count);
		System.out.println("task is completed");
	}
}
