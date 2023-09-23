package FindEelements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Filpkart_findElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);

		driver.findElement(By.xpath(".//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);

		WebElement title = driver.findElement(By.name("q"));
		Thread.sleep(3000);
		title.sendKeys("APPLEiphone 14");
		Thread.sleep(3000);
		title.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> value = driver.findElements(By.xpath(".//div[@class='_4rR01T']"));
		List<WebElement> price = driver.findElements(By.xpath(".//div[starts-with(text(),'APPLEiphone 14(')]/ancestor::div[@class='_3pLy-c row']//div[@class='_30jeq3 _1_WHN1']"));
		ArrayList<Integer> ref = new ArrayList<>();// create array object
		for (int i = 0; i < price.size(); i++) {
			String output = price.get(i).getText();// $79,9999
			String output1 = output.substring(1);// 79,999
			String output2 = output1.replaceAll(",", "");// 799999
			int price1 = Integer.parseInt(output2);
			ref.add(price1);

		}
		System.out.println(ref.size());
		// do sorting
		Thread.sleep(3000);
		Collections.sort(ref);
		for (int i = 0; i < ref.size(); i++) {
			Integer rv1 = ref.get(i);// sort the value
			System.out.println(rv1);// print the sorted value
		}
		Thread.sleep(5000);
		// print highest and lowset value
//		System.out.println("===========================");
//		System.out.println("Iphone 14 lowest price:- " + ref.get(0));
//		System.out.println("Iphone 14 Highest price:- " + ref.get(ref.size() - 1));
//		System.out.println("===========================");
//		Thread.sleep(3000);

		int count = 0;
		for (int i = 0; i < price.size() || i < value.size(); i++) {
			WebElement amount = price.get(i);

			String totalamount = amount.getText();
			WebElement text = value.get(i);

			String modal = text.getText();
			System.out.println("text :  " + totalamount + "== " + modal);
			count++;
		}

		System.out.println(count);
		driver.quit();
		System.out.println("task");
	}
}
