package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple_Browser {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
	    driver.get("http://www.facebook.com");
	    WebDriver driver1 = new ChromeDriver();
	    driver1.get("http://www.amazon.com");
	    WebDriver driver3 = new EdgeDriver();
	    driver3.get("http://www.Redbus.com");
	   
	     
	}

}
