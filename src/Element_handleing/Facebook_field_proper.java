package Element_handleing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_field_proper {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.actitime.com/login.do");
		Thread.sleep(3000);
		WebElement userfield = driver.findElement(By.id("username"));
		int userfieldh = userfield.getSize().height;
		int userfieldw = userfield.getSize().width;
		int userxloc = userfield.getLocation().getX();
		int useryloc = userfield.getLocation().getY();
		int space = 10;
		int total = userfieldh + useryloc + space;
		WebElement passfield = driver.findElement(By.name("pwd"));
		int passfieldh = passfield.getRect().height;
		int passfieldw = passfield.getRect().width;
		int passxloc = passfield.getLocation().getX();
		int passyloc = passfield.getLocation().getY();
		if ((userfieldh == passfieldh && userfieldw == passfieldw)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}
		if (userxloc == passxloc && total < passyloc)
			System.out.println("pwd field present un field");
		else {
			System.out.println("Both are not same");
		}
		driver.quit();
		System.out.println("task Completed");

	}
}
