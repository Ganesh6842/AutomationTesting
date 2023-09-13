package get_html_property;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Verify_imagetag_atitime {
	public static void main(String[] args) throws InterruptedException {
		WebDriver rv = new FirefoxDriver();
		rv.get("https://demo.actitime.com/login.do");

		Thread.sleep(2000);
		String s1 = "img";
		WebElement image = rv.findElement(By.className("atLogoImg"));
		String tagnameimage = image.getTagName();
		if (tagnameimage.equals(s1)) {
			System.out.println("logo is image tag");
		} else {
			System.out.println("logo is not image tag");
		}
		WebElement userField = rv.findElement(By.id("username"));
		String def = userField.getAttribute("placeholder");
		if (def.isEmpty()) {
			System.out.println("default test is not present");
		} else {
			System.out.println("default test is present");
		}
		userField.sendKeys("ganesh");
		String value1 = userField.getAttribute("value");
		System.out.println(value1);

		rv.findElement(By.id("loginButton")).click();
		Thread.sleep(8000);
		WebElement error = rv.findElement(By.id("errorMessagesArea"));
		String output = error.getText();
		System.out.println(output);

		rv.quit();
		System.out.println("task completed");
	}

}
