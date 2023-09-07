package Element_handleing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox_RadioBotton {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.actitime.com/login.do");
		Thread.sleep(4000);
		WebElement chk = driver.findElement(By.id("keepLoggedInCheckBox"));
		Thread.sleep(2000);
		chk.click();
		Thread.sleep(2000);
		boolean value = chk.isSelected();
		if (value)
			System.out.println("check box selected");
		else {
			System.out.println("check box not selected");
		}
		Thread.sleep(2000);
		chk.click();
		Thread.sleep(2000);
		boolean value_1 = chk.isSelected();
		if (value_1)
			System.out.println("check box not deselected");
		else {

			System.out.println("check box deselected");
		}
		System.out.println("task completed");
	}
}
