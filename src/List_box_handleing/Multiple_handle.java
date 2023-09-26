package List_box_handleing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_handle {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("file:///D:/SeleniumMorning/Html/handle.html");
	WebElement tgt = driver.findElement(By.id("list"));
	Select s = new Select(tgt);
	Boolean value = s.isMultiple();
	if(value) {
		System.out.println("listbox is multi Selectable");
	}else {
		System.out.println("listbox is single Selectable");
	}
}
}
