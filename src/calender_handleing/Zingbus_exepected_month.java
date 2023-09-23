package calender_handleing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Zingbus_exepected_month {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.navigate().to("https://www.zingbus.com");
		Thread.sleep(2000);
		driver.findElement(By.id("date")).click();
		Thread.sleep(2000);
//		change months
		String exp_month = "December 2023";
		while (true) {
			String exp_01 = "(.//div[contains(@class,'CalendarMonthGrid_month')])[2]/div/div/strong";
			String display_month = driver.findElement(By.xpath(exp_01)).getText();
			if (display_month.equals(exp_month)) {
				break;
			} else {
				driver.findElement(By.xpath(".//div[contains(@class,'_rightButton')]")).click();
			}
		}
		Thread.sleep(2000);
//		change date 
		String exp_date = "20";
		String exp_02 = "(.//table[contains(@class,'CalendarMonth_table ')])[2]//tr/td[text()='" + exp_date + "']";
		Thread.sleep(2000);
		driver.findElement(By.xpath(exp_02)).click();
		System.err.println("task");
	}

}

