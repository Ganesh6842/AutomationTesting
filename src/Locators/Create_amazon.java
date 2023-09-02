package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Create_amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		createaccount();
		
	}
	
	public static void createaccount() throws InterruptedException
	{
		WebDriver rv=new ChromeDriver();
		//open app
		rv.get("https://automationexercise.com/login");Thread.sleep(3000);
		rv.findElement(By.xpath(".//input[@name='name']")).sendKeys("ShubhamKale");Thread.sleep(3000);
		rv.findElement(By.xpath("(.//input[@name='email'])[2]")).sendKeys("shubhamk25@gmail.com");Thread.sleep(3000);
		rv.findElement(By.xpath(".//button[@data-qa='signup-button']")).click();Thread.sleep(3000);
		rv.findElement(By.xpath(".//div[@id='uniform-id_gender1']")).click();Thread.sleep(3000);
		rv.findElement(By.id("password")).sendKeys("MSdhoni07");Thread.sleep(3000);
		WebElement listBox_day = rv.findElement(By.name("days"));Thread.sleep(3000);
		Select s1=new Select(listBox_day);
		s1.selectByIndex(25);Thread.sleep(3000);
		WebElement listBox_month = rv.findElement(By.id("months"));
		Select s2=new Select(listBox_month);Thread.sleep(3000);
		s2.selectByVisibleText("June");Thread.sleep(3000);
		WebElement listBox_years = rv.findElement(By.id("years"));
		Select s3=new Select(listBox_years);Thread.sleep(3000);
		s3.selectByVisibleText("2000");
		rv.findElement(By.xpath("(.//input[@type='checkbox'])[1]")).click();Thread.sleep(3000);
		rv.findElement(By.xpath("(.//input[@type='checkbox'])[2]")).click();Thread.sleep(3000);
		rv.findElement(By.name("first_name")).sendKeys("Shubham");Thread.sleep(3000);
		rv.findElement(By.name("last_name")).sendKeys("Kale");Thread.sleep(3000);
		rv.findElement(By.xpath(".//input[@name='address1']")).sendKeys("Pune,India");Thread.sleep(3000);
		rv.findElement(By.name("country")).sendKeys("India");Thread.sleep(3000);
		rv.findElement(By.id("state")).sendKeys("Maharashtra");Thread.sleep(3000);
		rv.findElement(By.id("city")).sendKeys("Pune");Thread.sleep(3000);
		rv.findElement(By.name("zipcode")).sendKeys("111000");Thread.sleep(3000);
		rv.findElement(By.xpath(".//input[@id='mobile_number']")).sendKeys("1234567899");Thread.sleep(3000);
		rv.findElement(By.xpath(".//button[@data-qa='create-account']")).click();Thread.sleep(3000);
		rv.close();
	}

}