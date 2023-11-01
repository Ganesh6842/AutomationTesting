package TestN_with_selenium;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listner.class)
public class Script_01 {

	@Test
	public void login() 
	{
		Reporter.log("login method",true);
	}
}
