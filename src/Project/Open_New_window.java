package Project;

import org.openqa.selenium.chrome.ChromeDriver;

public class Open_New_window {
public static void main(String[] args) {
	ChromeDriver rv = new ChromeDriver();
	rv.get("http://www.facebook.com");
	System.out.println(rv.getTitle());
	ChromeDriver rv1 = new ChromeDriver();
	rv1.get("http://www.amazon.com");
	System.out.println(rv1.getCurrentUrl());
	rv.close();
	rv1.close();
	
}
}
