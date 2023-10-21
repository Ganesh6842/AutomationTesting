package javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sel_loctaor {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location='https://www.facebook.com/'");
		Thread.sleep(4000);
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(4000);
		js.executeScript("history.go(-1)");
		Thread.sleep(4000);
		js.executeScript("history.go(1)");
		Thread.sleep(4000);
		js.executeScript("history.go(0)");
		Thread.sleep(4000);
		String title = js.executeScript("return document.title").toString();
		System.out.println("title of webpage" + title);
		Thread.sleep(4000);
		String url = js.executeScript("return document.URL").toString();
		System.out.println("url web page " + url);
		Thread.sleep(4000);
		js.executeScript("document.getElementById('username').value='admin'");
		Thread.sleep(4000);
		js.executeScript("document.getElementsByName('pwd')[0].value='manager'");
		Thread.sleep(4000);
		js.executeScript("document.getElementById('keepLoggedInCheckBox').checked=true");
		Thread.sleep(4000);
		WebElement login = driver.findElement(By.xpath(".//a[@id='loginButton']"));
		js.executeScript("arguments[0].click()",login);
		Thread.sleep(4000);
		driver.close();
	}
}
