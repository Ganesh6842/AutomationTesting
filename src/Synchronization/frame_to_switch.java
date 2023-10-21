package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class frame_to_switch {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.yatra.com/");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("webpush-onsite")));
	driver.findElement(By.id("allow")).click();
}
}
