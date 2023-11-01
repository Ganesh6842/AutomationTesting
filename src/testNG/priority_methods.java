package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
// otherwise alphabetical order mentain
public class priority_methods 
{
	@Test(priority = 1)
	public void createAccount() {
		Reporter.log("create account method exected", true);
	}
	@Test(priority = 2)
	public void editAccount() {
		Reporter.log("edit account method exected", true);
	}
	@Test(priority = 3)
	public void deleteAccount() {
		Reporter.log("delete account method exected", true);
	}
	@Test(priority = 4)
	public void saveAccount() {
		Reporter.log("save account method exected", true);
	}
	
}
