package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependends_methods 
{
	@Test
	public void signup() 
	{
		Reporter.log("signup methods executed",true);
	}
	@Test(dependsOnMethods = "signup")
	public void login() 
	{
		Reporter.log("login methods executed",true);
	}

}
