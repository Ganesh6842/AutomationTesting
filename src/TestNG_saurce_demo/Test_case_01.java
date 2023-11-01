package TestNG_saurce_demo;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
@Test
public class Test_case_01 extends Base_class{
	
	@DataProvider
	public Object[][] testdata() {
		Object[][] rv = new Object[1][2];
		rv[0][0] = "standard_user";
		rv[0][1] = "secret_sauce";
		return rv;

	}

	@Test(dataProvider = "testdata")
	public void login(String username, String password)  {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(".//input[contains(@id,'user-name')]")).sendKeys(username);
		driver.findElement(By.xpath(".//input[contains(@id,'password')]")).sendKeys(password);
		driver.findElement(By.xpath(".//input[contains(@id,'login-button')]")).click();
		
	}
}
