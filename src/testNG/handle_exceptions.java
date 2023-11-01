package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class handle_exceptions {
	@Test(invocationTimeOut = 3000,expectedExceptions = ThreadTimeoutException.class)
	public void signup() throws InterruptedException 
	{
		Thread.sleep(5000);
		Reporter.log("signup methods executed",true);
	}
}
