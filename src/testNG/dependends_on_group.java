package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependends_on_group {
	@Test(groups = "s1")
	public void createAccount() {
		Reporter.log("create account method exected", true);
	}
	@Test(groups = "s1")
	public void editAccount() {
		Reporter.log("edit account method exected", true);
	}
	@Test(groups = "s1")
	public void deleteAccount() {
		Reporter.log("delete account method exected", true);
	}
	@Test(dependsOnGroups = "s1")
	public void saveAccount() {
		Reporter.log("save account method exected", true);
	}
}
