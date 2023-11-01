package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocation_Count_keyword 
{

	@Test(invocationCount = 5)
	public void createAccount() {
		Reporter.log("create account method exected", true);
	}
}
