package TestNG_verifaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider_facebook {
	
	@DataProvider
	public Object[][] testdata(){
		Object[][] rv= new Object [1][2];
		rv[0][0] = "ganeshmalviya@123";
		rv[0][1] = "manager";
		return rv;
	
}
	@Test(dataProvider = "testdata")
	public void testLogin(String email,String pwd) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		
		
	}
	
	
}
