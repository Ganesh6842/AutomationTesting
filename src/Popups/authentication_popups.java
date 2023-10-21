package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class authentication_popups {
public static void main(String[] args) throws InterruptedException, AWTException {
	 WebDriver driver = new FirefoxDriver();
	 Thread.sleep(2000);
	 driver.get("https://the-internet.herokuapp.com/basic_auth");
//	 driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	 Thread.sleep(2000);
	 Robot r = new Robot();
	 r.keyPress(KeyEvent.VK_A);
	 r.keyPress(KeyEvent.VK_D);
	 r.keyPress(KeyEvent.VK_M);
	 r.keyPress(KeyEvent.VK_I);
	 r.keyPress(KeyEvent.VK_N);
	 Thread.sleep(2000);
	 r.keyPress(KeyEvent.VK_TAB);
	 Thread.sleep(2000);
	 r.keyPress(KeyEvent.VK_A);
	 r.keyPress(KeyEvent.VK_D);
	 r.keyPress(KeyEvent.VK_M);
	 r.keyPress(KeyEvent.VK_I);
	 r.keyPress(KeyEvent.VK_N);
	 Thread.sleep(2000);
	 r.keyPress(KeyEvent.VK_TAB);
	 Thread.sleep(2000);
	 r.keyPress(KeyEvent.VK_ENTER);
}
}
