package TestN_with_selenium;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listner implements ITestListener
{
	
	public void onTestsuccess(ITestResult result) 
	{
		Reporter.log(result.getName()+"method is pass",true);
	}
	@Override
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log(result.getName()+"method is fail",true);
	}
}
