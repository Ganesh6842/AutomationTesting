package Data_provider_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class verify_field {
	@DataProvider
	public Object[][] testdata(){
		Object[][] rv= new Object [1][2];
		rv[0][0] = "ganeshmalviya";
		rv[0][1] = "ganeshmalviya@123";
		return rv;
	
}
	@Test(dataProvider = "testdata")
	public void testLogin(String name,String email) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("email")).sendKeys(email);
		
}
}						
