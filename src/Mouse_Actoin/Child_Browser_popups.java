package Mouse_Actoin;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Child_Browser_popups {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.abhibus.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='Login/SignUp']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("login-google-link")).click();
		Thread.sleep(2000);
		String main = driver.getWindowHandle();
		WebDriver mainpage = driver.switchTo().window(main);
		System.out.println(mainpage.getTitle());
		Set<String> refwind = driver.getWindowHandles();
		Iterator<String> ref = refwind.iterator();
		System.out.println(refwind.size());
		for(int i=0;i<refwind.size();i++) {
			System.out.println(ref.next());
		if(ref.next().contains(main)) {
			System.out.println("same");
		}
		else {
			WebDriver second = driver.switchTo().window(ref.next());
			
		}
		}
		


	}

}
