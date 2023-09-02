package Util;

import java.util.Scanner;

import module.Product;

public class DataAccessObject {
	private static Scanner scanner = new Scanner(System.in);
	Product[] productList = new Product[5];
	Product product = null;
	int i = 0;

	void addProduct() {
		System.out.println("DO U WANT ADD PRODUCT Y|N");
		String ans = scanner.next().charAt(0) + "";
		if (ans.equalsIgnoreCase("Y")) {
			System.out.println("ENTER PRODUCT ID");
			int id = scanner.nextInt();
			System.out.println("ENTER PRODUCT NAME");
			String name = scanner.next();
			System.out.println("ENTER PRODUCT PRICE");
			double price = scanner.nextDouble();
			System.out.println("ENTER PRODUCT QTY");
			int qty = scanner.nextInt();
			product = new Product(id, name, price, qty);
			for (; i < productList.length; i++) {
								productList[i] = product;
				System.out.println("PRODUCT ADDED SUCCESFULLY");
								addProduct();
			}
		}else {

			System.out.println("bss kar bassi");
		} 
		
		if (i >= productList.length) {
			System.out.println("WE CAN'T MORE PRODUCTS");
		}
	}

	void displayProduct() {
		for (int j = 0; j < productList.length; j++) {
			if (productList[j] != null) {
				System.out.println(productList[j]);
			} else {
				break;
			}
		}
	}
}
