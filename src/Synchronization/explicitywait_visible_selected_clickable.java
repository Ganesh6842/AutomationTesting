package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitywait_visible_selected_clickable {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
//		driver.findElement(By.id("username")).sendKeys("admin");
//		driver.findElement(By.name("pwd")).sendKeys("manager");
//		driver.findElement(By.id("loginButton")).click();
//		verify element visiable or not 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		driver.findElement(By.id("username")).sendKeys("admin");
		WebElement check_box = driver.findElement(By.id("keepLoggedInLabel"));
		check_box.click();
		wait.until(ExpectedConditions.elementToBeSelected(check_box));
		System.out.println("checkbox selected");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("loginButton")));
		System.out.println("login button enable");
		
	}
}
