package FindEelements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipkart_String_to_int {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(8000);

//		driver.findElement(By.xpath(".//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		WebElement title = driver.findElement(By.name("q"));
		Thread.sleep(3000);
		title.sendKeys("iphone 14");
		Thread.sleep(3000);
		title.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		String exp_01 = ".//div[@class='_4rR01T'and contains(text(),'iphone 14(')]";
		List<WebElement> ref1 = driver.findElements(By.xpath(exp_01));
//		 matching with iphone
		System.out.println("total count;" + ref1.size());
		System.out.println("****************");
		List<WebElement> ref2 = driver.findElements(By.xpath(".//div[@class='_4rR01T']"));
		String exp_02 = ".//div[@class='_4rR01T']/../..//div[@class='_30jeq3 _1_WHN1']";
		List<WebElement> ref_03 = driver.findElements(By.xpath(exp_02));

		for (int i = 0; i < ref2.size(); i++) {
			String name = ref2.get(i).getText();
			String price = ref_03.get(i).getText();
			System.out.println(name + "-" + price);
//
		}
////		 ArrayList
		ArrayList<Integer> ref4 = new ArrayList<Integer>();
		for (int a = 0; a < ref_03.size(); a++) {
			String str = ref_03.get(a).getText().substring(1).replaceAll(",", "");
			int price = Integer.parseInt(str);
			ref4.add(price);
		}
		Collections.sort(ref4);
		System.out.println("lowest price:" + ref4.get(0));
		System.out.println("higgest price:" + ref4.get(ref4.size() - 1));

//		set
		TreeSet<Integer> ref5 = new TreeSet<Integer>();
		for (int a = 0; a < ref_03.size(); a++) {
			String str = ref_03.get(a).getText().substring(1).replaceAll(",", "");
			int price = Integer.parseInt(str);
			ref5.add(price);
		}
		System.out.println("lowest price:" + ref5.first());
		System.out.println("higgest price:" + ref5.last());

	}

}
