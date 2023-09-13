package get_html_property;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class atitime_error_print {
	public static void main(String[] args) throws InterruptedException {
		WebDriver rv = new FirefoxDriver();
		rv.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		rv.findElement(By.id("loginButton")).click();
		Thread.sleep(8000);
		WebElement error = rv.findElement(By.id("errorMessagesArea"));
   if(error.isDisplayed()) {
	   System.out.println("error msg displyed");
	   String errortext = error.getText();
	   System.out.println("error text-"+errortext);
	   
   }
  
   rv.quit();
   System.out.println("task completed");
	}
	
	
}
