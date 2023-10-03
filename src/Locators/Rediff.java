package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediff {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://register.rediff.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//a[@title='Create Rediffmail Account']")).click();
	Thread.sleep(4000);
	driver.findElement(By.tagName("input")).sendKeys("Ganesh malviya");
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//input[starts-with(@name,'login')]")).sendKeys("ganesh@123");
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//input[@id='newpasswd']")).sendKeys("admin@123");
	Thread.sleep(2000);
	driver.findElement(By.id("newpasswd1")).sendKeys("admin@123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(.//input[contains(@name,'alte')])[1]")).sendKeys("ganesh@567");
	Thread.sleep(2000);
	WebElement chek = driver.findElement(By.xpath("(.//input[contains(@name,'alte')])[2]"));
	chek.click();
	if(chek.isSelected()) {
		System.out.println("selected");
	}else {
		System.out.println("not selected");
	}
	Thread.sleep(2000);
    driver.findElement(By.xpath(".//select[contains(@name,'hint')]")).click();
	Thread.sleep(2000);
   
    
	
	

	

	}

}
