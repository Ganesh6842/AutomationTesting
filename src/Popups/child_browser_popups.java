package Popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class child_browser_popups {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.abhibus.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='Login/SignUp']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='Sign in with google']")).click();
		Thread.sleep(2000);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> window_opt = windows.iterator();
		for (int i = 0; i < windows.size(); i++) {
			String page = window_opt.next();
			WebDriver page_01 = driver.switchTo().window(page);
//			System.err.println(page_01.getTitle());
			String title_name = page_01.getTitle();
			if (title_name.contains("Sign in - Google Accounts")) {
				Thread.sleep(2000);
				driver.findElement(By.id("identifierId")).sendKeys("admin@123gmail.com");
				Thread.sleep(2000);
				driver.findElement(By.xpath(".//span[text()='Next']")).click();
				} else {
				System.out.println("Title is not match");
				}

		}

	}
}
