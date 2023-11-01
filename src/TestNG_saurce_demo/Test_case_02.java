package TestNG_saurce_demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test_case_02 extends Base_class{
	@Test
	@DataProvider
	public Object[][] testdata_01(){
		Object[][] rv= new Object [1][2];
		rv[0][0] = "admin";
		rv[0][1] = "admin@123";
		return rv;
	
}

	@Test(dataProvider = "testdata_01")
	public void invalidlogin(String username,String password)  {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(".//input[contains(@id,'user-name')]")).sendKeys(username);
		driver.findElement(By.xpath(".//input[contains(@id,'password')]")).sendKeys(password);
		driver.findElement(By.xpath(".//input[contains(@id,'login-button')]")).click();
		WebElement error_msg = driver.findElement(By.xpath(".//div[@class='error-message-container error']"));
		if (error_msg.isDisplayed()) {
			System.out.println(error_msg.getText());
		}
		

	}
}
