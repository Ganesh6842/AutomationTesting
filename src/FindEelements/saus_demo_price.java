package FindEelements;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class saus_demo_price {
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver rv = new ChromeDriver();
			rv.get("https://www.saucedemo.com/");
			Thread.sleep(1000);
			rv.manage().window().maximize();
			Thread.sleep(3000);
			rv.findElement(By.name("user-name")).sendKeys("standard_user");
			Thread.sleep(3000);
			rv.findElement(By.name("password")).sendKeys("secret_sauce");
			Thread.sleep(3000);
			rv.findElement(By.id("login-button")).click();
			Thread.sleep(3000);

			// products count
			List<WebElement> products = rv.findElements(By.xpath(".//div[@class='inventory_item']"));
			Thread.sleep(3000);
			int productcount = products.size();
			Thread.sleep(3000);
			System.out.println("products are displayed:- " + productcount);
			System.out.println("---------------------------------------------");
			// products name with price
			List<WebElement> prodcutName = rv.findElements(By.xpath(".//div[@class='inventory_item_name']"));
			Thread.sleep(3000);
			List<WebElement> productPrice = rv.findElements(By.xpath(".//div[@class='inventory_item_price']"));
			Thread.sleep(3000);
			for (int i = 0; i < prodcutName.size(); i++) {
				String nameOutput = prodcutName.get(i).getText();
				String priceOutput = productPrice.get(i).getText();
				System.out.println(nameOutput + ":- " + priceOutput);
			}
			System.out.println("---------------------------------------------");
			Thread.sleep(3000);

			// selecting low to high
			rv.findElement(By.className("product_sort_container")).click();
			Thread.sleep(3000);
			rv.findElement(By.xpath(".//option[@value='lohi']")).click();
			Thread.sleep(3000);
			// veerifying price low to high
			List<WebElement> prodect_price1 = rv.findElements(By.xpath(".//div[@class='inventory_item_price']"));
			Thread.sleep(3000);
			for (int i = 0; i < prodect_price1.size(); i++) {
				// we get price at 0 index
				String price1 = prodect_price1.get(i).getText();// $7.99
				String price1Output = price1.substring(1);// 7.99
				double op1 = Double.parseDouble(price1Output);// converting into double
				if (i + 1 < prodect_price1.size()) {
					prodect_price1.get(i + 1).getText();
					String price1Output1 = price1.substring(1);
					double op2 = Double.parseDouble(price1Output1);
					if (op1 <= op2) {
						System.out.println("price is showing ascending order");
						break;
					} else {
						System.out.println("price is not displayed in ascending order");
						break;
					}
				} else {

				}
			}

			System.out.println("---------------------------------------------");
			rv.findElement(By.className("product_sort_container")).click();
			Thread.sleep(3000);
			rv.findElement(By.xpath(".//option[@value='hilo']")).click();
			Thread.sleep(3000);
			// verifying price is showing desecending order
			List<WebElement> prodect_price2 = rv.findElements(By.xpath(".//div[@class='inventory_item_price']"));
			Thread.sleep(3000);
			for (int i = 0; i < prodect_price2.size(); i++) {
				// we get price at 0 index
				String price2 = prodect_price2.get(i).getText();// $7.99
				String price1Output = price2.substring(1);// 7.99
				double op1 = Double.parseDouble(price1Output);// converting into double
				if (i + 1 < prodect_price2.size()) {
					prodect_price2.get(i + 1).getText();
					String price1Output2 = price2.substring(1);
					double op2 = Double.parseDouble(price1Output2);
					if (op1 <= op2) {
						System.out.println("price is showing Desending order");
						break;
					} else {
						System.out.println("price is not displayed in Descending order");
						break;
					}
				} else {

				}
			}
			System.out.println("----------------------------------");
			// verifying cart is empty or not
			WebElement cart01 = rv.findElement(By.xpath(".//a[@class='shopping_cart_link']"));
			String value = cart01.getText();
			System.out.println("cart value is :" + value);
			if (value.isEmpty()) {
				System.out.println("cart is empty");
			} else {
				System.out.println("cart is not empty");
			}

			System.out.println("----------------------------------");
			Thread.sleep(3000);

			rv.findElement(By.xpath("(.//button[@class='btn btn_primary btn_small btn_inventory'])[1]")).click();
			WebElement cart = rv.findElement(By.xpath(".//span[@class='shopping_cart_badge']"));
			String count = cart.getText();
			if (count == value) {
				System.out.println("no product is added yet in cart");
			} else {
				System.out.println(" product is added in cart");
			}
			System.out.println("----------------------------------");

			// verify product is removing or not
			rv.findElement(By.xpath(".//button[text()='Remove']")).click();
			Thread.sleep(3000);
			WebElement cart02 = rv.findElement(By.xpath(".//a[@class='shopping_cart_link']"));
			Thread.sleep(3000);
			String value1 = cart02.getText();
			System.out.println("cart value is :" + value1);
			if (value1.isEmpty()) {
				System.out.println("product is removed from cart");
			} else {
				System.out.println("still prodcut is present in cart");
			}
			System.out.println("----------------------------------");
			Thread.sleep(3000);
			rv.close();

		}

	}

