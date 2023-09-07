package Element_handleing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookChekbox_radioBotton {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://	www.facebook.com");
		driver.findElement(By.partialLinkText("Create new account")).click();
		Thread.sleep(4000);
		WebElement chk = driver.findElement(By.xpath(".//label[text()='Female']/following-sibling::input"));
		Thread.sleep(4000);
		chk.click();
		Thread.sleep(4000);
		if (chk.isSelected())
		{
			System.out.println("check box selected");
		}else {
			System.out.println("Check box not selected");
		}
		Thread.sleep(4000);
		WebElement chk1 = driver.findElement(By.xpath(".//label[text()='Male']/following-sibling::input"));
		chk1.click();
		Thread.sleep(2000);
		if (chk.isSelected())
			System.out.println("check box selected");
		System.out.println("task completed");
	}

}
