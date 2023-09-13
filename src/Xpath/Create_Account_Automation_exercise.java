package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_Account_Automation_exercise {
		public static void main(String[] args) throws InterruptedException {
			WebDriver rv=new ChromeDriver();
			//open app
			rv.get("https://automationexercise.com/login");Thread.sleep(2000);
			rv.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("Ganesh");Thread.sleep(2000);
			rv.findElement(By.cssSelector("#form > div > div > div:nth-child(3) > div > form > input[type=email]:nth-child(3)")).sendKeys("ganesh7@gmail.com");
			Thread.sleep(2000);
			rv.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();Thread.sleep(2000);
			//select mr
			rv.findElement(By.xpath(".//input[@id='id_gender1' or @value='Mr']")).click();Thread.sleep(2000);
			//password filed
			rv.findElement(By.id("password")).sendKeys("MSdhoni07");Thread.sleep(2000);
			//birth day
			rv.findElement(By.name("days")).sendKeys("25");Thread.sleep(2000);
			//birth month
			rv.findElement(By.name("months")).sendKeys("June");Thread.sleep(2000);
			//birth year
			rv.findElement(By.id("years")).sendKeys("2000");Thread.sleep(2000);
			
			//selecting checkbox1
			//rv.findElement(By.name("newsletter")).click();
			WebElement checkbox1=rv.findElement(By.name("newsletter"));checkbox1.click();Thread.sleep(2000);
			//verifying checkbox1 is selected or not
			boolean value1=checkbox1.isSelected();Thread.sleep(2000);
			if (value1) {
				System.out.println("CheckBox is Selected");
			} else {
				System.out.println("CheckBox is not Selected");
			}
			Thread.sleep(2000);
			//selecting checkbox2
			//rv.findElement(By.id("optin")).click();
			WebElement checkbox2=rv.findElement(By.id("optin"));checkbox2.click();Thread.sleep(2000);
			//verifying checkbox2 is selected or not
			boolean value2=checkbox2.isSelected();Thread.sleep(2000);
			if (value2) {
				System.out.println("CheckBox is Selected");
			} else {
				System.out.println("CheckBox is not Selected");
			}
			
			Thread.sleep(2000);
			//first_name filed
			rv.findElement(By.id("first_name")).sendKeys("Shubham k");Thread.sleep(2000);
			//last_name filed
			rv.findElement(By.name("last_name")).sendKeys("123");Thread.sleep(2000);
			//company filed
			rv.findElement(By.id("company")).sendKeys("Qspider");Thread.sleep(2000);
			//address1 filed
			rv.findElement(By.cssSelector("#address1")).sendKeys("Hadpsar,pune");Thread.sleep(2000);
			//country filed
			rv.findElement(By.xpath(".//*[@id=\"country\"]")).sendKeys("India");Thread.sleep(2000);
			//state filed
			rv.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("Maharastra");Thread.sleep(2000);
			//city field
			rv.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Pune");Thread.sleep(2000);
			//zipcode filed
			rv.findElement(By.id("zipcode")).sendKeys("413004");Thread.sleep(2000);
			//mobile_number
			rv.findElement(By.cssSelector("#mobile_number")).sendKeys("1234567899");Thread.sleep(2000);
			// click on create button
			rv.findElement(By.xpath(".//button[contains(text(),'Create Account')]")).click();Thread.sleep(2000);
			//click on countinue
			rv.findElement(By.xpath(".//a[@class='btn btn-primary']")).click();Thread.sleep(00);
			//verify user logged in User name
			WebElement userName = rv.findElement(By.xpath(".//a[contains(.,'Logged in as')]//b[.='Shubham k']"));Thread.sleep(2000);
			String output = userName.getText();
			
			if (output.contains("Shubham k")) {
				System.out.println("Yess..user logged with it's name");
			} else {
				System.out.println("Nooo..user not logged with it's name");
			}
			Thread.sleep(2000);
			rv.findElement(By.xpath(".//a[@href='/delete_account']")).click();Thread.sleep(2000);
			WebElement text = rv.findElement(By.xpath(".//h2[contains(.,'Account Deleted!')]//b[.='Account Deleted!']"));
			String DeleteText = "Account Deleted!";
			Thread.sleep(2000);
			if (text.equals(DeleteText)) {
				System.out.println("Yess.. Your account delete successfullly");
			} else {
				System.out.println("Noo.. Your account still not deleted.. Please try again....");
			}
			Thread.sleep(2000);
			rv.findElement(By.xpath(".//a[@class='btn btn-primary']")).click();
			rv.close();
			
			
		}

	}
