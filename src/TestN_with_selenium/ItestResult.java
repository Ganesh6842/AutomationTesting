package TestN_with_selenium;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Test

public class ItestResult {

	public void testcasefail() {
		fail("fail");
	}
	
	public void testcasepass() {
		  assertTrue(true);
		
	}
	@AfterMethod
	public void getstatus(ITestResult result) {
		if(result.getStatus()==ITestResult.SUCCESS) {
			Reporter.log("success= method status:"+ result.getStatus()+"method name:"+result.getName());
		}
		if(result.getStatus()==ITestResult.FAILURE) {
			Reporter.log("success= method status:"+ result.getStatus()+"method name:"+result.getName());
		}
	}
}
