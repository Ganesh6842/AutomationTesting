package TestNG_saurce_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base_class {
WebDriver driver;
@Parameters("BrowserName")
@BeforeClass
public void openBrowser(String BrowserName) {
	if (BrowserName.equals("firefox")) {
		driver = new FirefoxDriver();
	} else if (BrowserName.equals("Chrome")) {
		driver = new ChromeDriver();
	} else {
		driver = new EdgeDriver();
	}
}
//@BeforeClass
//public void openBrowser()
//{
//   driver = new FirefoxDriver();	
//}
@BeforeMethod
public void openApp() 
{
	 driver.get("https://www.saucedemo.com/");
}
@AfterClass
public void closeBrowser() 
{
	driver.close();
}
@AfterMethod
public void testMethod(ITestResult result) 
{
	
		if(result.getStatus()==1) 
		{
			Reporter.log(result.getName()+"execution is pass",true);
			}
	     else {
		Reporter.log(result.getName()+"execution is fail",true);
	}
}
}
