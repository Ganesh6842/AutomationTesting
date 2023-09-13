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
		Thread.sleep(2000);
		chk.click();
		Thread.sleep(2000);
		if (chk.isSelected())
			System.out.println("check box male selected");
		Thread.sleep(4000);
		WebElement chk1 = driver.findElement(By.xpath(".//label[text()='Male']/following-sibling::input"));
		Thread.sleep(2000);
		chk1.click();
		Thread.sleep(2000);
		if (chk1.isSelected())
			System.out.println("check box female selected");
		WebElement chk2 = driver.findElement(By.xpath(".//label[text()='Custom']/following-sibling::input"));
		Thread.sleep(2000);
		chk2.click();
		Thread.sleep(2000);
		if (chk2.isSelected())
			System.out.println("check box custom selected");
		Thread.sleep(2000);
		System.out.println("task completed");
	}

}
