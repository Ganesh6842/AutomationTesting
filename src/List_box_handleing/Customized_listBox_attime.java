package List_box_handleing;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Customized_listBox_attime {
	public static void main(String[] args) throws InterruptedException {

		{
			WebDriver rv = new FirefoxDriver();
			rv.get("https://demo.actitime.com/login.do");
			Thread.sleep(2000);
			rv.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(2000);
			rv.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			rv.findElement(By.id("loginButton")).click();
			Thread.sleep(8000);
			rv.findElement(By.id("addTaskButtonId")).click();
			Thread.sleep(5000);
			rv.findElement(By.xpath("(.//div[@class='dropdownButton'])[5]")).click();
			Thread.sleep(2000);
			rv.findElement(By.xpath("(.//div[text()='Galaxy Corporation'])[1]")).click();
			Thread.sleep(2000);
			rv.findElement(By.xpath("(.//div[@class='dropdownButton'])[6]")).click();
			Thread.sleep(2000);
			rv.findElement(By.xpath("(.//div[text()='Android testing'])[1]")).click();
			Thread.sleep(2000);
			rv.findElement(By.xpath("(.//input[contains(@placeholder,'Enter task name')])[1]")).sendKeys("selenium");
			Thread.sleep(2000);
//			rv.findElement(By.xpath("(.//input[contains(@placeholder,'not needed')])[1]")).sendKeys("29sep");
//			Thread.sleep(2000);
			rv.findElement(By.xpath(".//div[contains(text(),'Create Tasks')]")).click();
			Thread.sleep(2000);
			System.out.println("task completed");
		}
	}
}
