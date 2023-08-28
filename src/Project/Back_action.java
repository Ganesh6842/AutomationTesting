package Project;

import org.openqa.selenium.chrome.ChromeDriver;

public class Back_action {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver rv = new ChromeDriver();
	Thread.sleep(3000);
	rv.get("http://www.facebook.com");
	Thread.sleep(3000);
	rv.get("http://www.google.com");
	Thread.sleep(3000);
	rv.get("http://www.amazon.com");
	Thread.sleep(3000);
	rv.get("http://www.filpkart.com");
	Thread.sleep(3000);
	rv.get("http://www.youtube.com");
	Thread.sleep(3000);
	
	String exp = "http://www.google.com";
	while(true)
	{
		String title = rv.getTitle();
		if(title.equals(exp))
		{		
		
			break;
		}
		else 
		
			rv.navigate().back();
		
	}
	
}

}


