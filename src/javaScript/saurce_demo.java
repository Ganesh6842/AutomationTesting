package javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class saurce_demo {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	Thread.sleep(2000);
	js.executeScript("window.location='https://www.saucedemo.com/'");
	Thread.sleep(2000);
	js.executeScript("document.getElementById('user-name').value='standard_user'");
	Thread.sleep(2000);
	js.executeScript("document.getElementsByName('password')[0].value='secret_sauce'");
	Thread.sleep(3000);
//	js.executeScript("document.getElementById('login-button').click();");
     driver.findElement(By.id("login-button")).click();

}
}
