package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class descripition {
	@Test(description = "used to create account")
	public void signup() 
	{
		Reporter.log("signup methods executed",true);
	}
}
