package TestNG_verifaction;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class assert_equals 
{
	@Test
	public void test_01()
	{
		String str1 = "hi";
		String str2 = "hello";
	assertNotEquals(str1, str2);
	Reporter.log("jaishreeram",true);
//		assertEquals(str1, str2);
		
	}
}
