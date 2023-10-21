package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class implicitlywait {
	public static void main(String[] args) {
		WebDriver rv = new FirefoxDriver();
		rv.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		rv.get("http://demo.actitime.com/login.do");
		rv.findElement(By.id("username")).sendKeys("admin");
		rv.findElement(By.name("pwd")).sendKeys("manager");
		rv.findElement(By.id("loginButton")).click();
		WebElement error_msg = rv.findElement(By.xpath("(.//span[contains(text(),Username)])[1]"));
		System.out.println(error_msg.getText());
	}
}
