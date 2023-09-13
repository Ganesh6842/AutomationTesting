package get_html_property;

import javax.swing.text.TabableView;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Filpkart_img_which_element {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	Thread.sleep(3000);
	driver.navigate().to("https://www.flipkart.com/");
	Thread.sleep(3000);
	driver.findElement(By.tagName("img"));
	Thread.sleep(3000);
	String s1 = "img";
	Thread.sleep(3000);
	WebElement image = driver.findElement(By.xpath(".//img[@alt='Flipkart']"));
	Thread.sleep(3000);
	String imagetag = image.getTagName();
	if(imagetag==s1) {
		System.out.println("tag name is same:"+imagetag);
	}
	WebElement search = driver.findElement(By.xpath(".//input[@class='Pke_EE']"));
	Thread.sleep(3000);
	 String text = search.getAttribute("placeholder");
	 
	     System.out.println(text);
	
	if(text.isEmpty()) {
		System.out.println("is empty");
	}
	Thread.sleep(3000);
	search.sendKeys("mobile");
	Thread.sleep(3000);
	String enter = search.getAttribute("Value");
	Thread.sleep(3000);
	System.out.println(enter);
	Thread.sleep(3000);
	driver.quit();
}
}
