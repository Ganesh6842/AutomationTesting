package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
@Test
public class all_methods_run {
	public void test_01() {
		Reporter.log("Test_01 method exected", true);
	}

	public void test_02() {
		Reporter.log("Test_01 method exected", true);
	}
}
