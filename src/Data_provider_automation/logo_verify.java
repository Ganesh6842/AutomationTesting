package Data_provider_automation;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

@Test
public class logo_verify {
	WebDriver driver = new FirefoxDriver();

	public void logo() {
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement logo_ele = driver.findElement(By.xpath(".//img"));
		String str = "img";
		assertNotEquals(logo_ele, str);
	}

	public void verify_text() {
		String exp ="Automation Testing Practice";
		WebElement text = driver.findElement(By.xpath(".//h1"));
		String current_text = text.getText();
		assertEquals(exp, current_text);
				
	}
	
	public void text_field() {
		WebElement field_01 = driver.findElement(By.xpath(".//input[@id='field1']"));
		WebElement field_02 = driver.findElement(By.xpath(".//input[@id='field2']"));
		String value_field = field_01.getAttribute("value");
		Reporter.log(value_field,true);
		assertNotEquals(field_01, field_02);
	}

	
}
