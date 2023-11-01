package TestNG_verifaction;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_assert {

	@Test
	public void test_01() {
		SoftAssert s = new SoftAssert();
		Reporter.log("method execution started", true);
		String str = "babar azam";
		String str1 = "rizwan";
		Reporter.log("verifaction stared", true);
		s.assertEquals(str, str1);
		Reporter.log("verifaction complted", true);
		Reporter.log("verifaction1 stared", true);
		String st2 = "babar azam";
		s.assertEquals(str, st2);
		Reporter.log("verifaction1 complted", true);
		s.assertAll();
	}

	@Test
	public void test_2() {
		Reporter.log("jumma", true);
	}
}
