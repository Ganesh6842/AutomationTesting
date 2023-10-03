package List_box_handleing;

import java.awt.AWTException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_month_listbox {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(4000);
		WebElement month_list = driver.findElement(By.id("month"));
			Thread.sleep(2000);
		String[] str = { "jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec" };
		Select s = new Select(month_list);
		List<WebElement> ref = s.getOptions();
		ArrayList<String> ref1 = new ArrayList<>();
		for (int i = 0; i < ref.size(); i++) {
			String months = ref.get(i).getText();
			ref1.add(months);
			String exp_opt = str[i];
			if (months.equalsIgnoreCase(exp_opt)) {
				System.out.println("exp order mantain");
			} else {
				System.err.println("Exp order");
				break;
			}
		}
		Collections.sort(ref1);
		System.out.println(ref1);

	}
}