package javaScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webpage_title {
	public static void main(String[] args) {
		
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.flipkart.com/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
//	print the title
	String str = "return document.title;";
	String title = (String) js.executeScript(str);
	System.out.println(title);
}}
