package javaScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ssl_certificate {
	public static void main(String[] args) {
//	global profile
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setAcceptInsecureCerts(true);
		
		FirefoxOptions coptions = new FirefoxOptions();
		coptions.merge(dc);
		
		WebDriver driver = new FirefoxDriver(coptions);
		driver.get("https://expired.badssl.com/");

	}
}
