package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class skip_methods {
	@Test
	public void createAccount() {
		Reporter.log("create account method exected", true);
	}
	@Test
	public void editAccount() {
		Reporter.log("edit account method exected", true);
	}
	@Test(enabled = false)
	public void deleteAccount() {
		Reporter.log("delete account method exected", true);
	}
	@Test
	public void saveAccount() {
		Reporter.log("save account method exected", true);
	}
}
