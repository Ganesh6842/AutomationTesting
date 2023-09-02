package Util;

import java.util.Scanner;

public class MainApp {
	private static Scanner scanner = new Scanner(System.in);
	private static String adminName = "admin", password = "admin123";
	private static String userName = "user", userpass = "user123";
	private static DataAccessObject dao = new DataAccessObject();

	public static void main(String[] args) {
		operation();
	}

	private static void operation() {
		boolean status = true;

		while (status) {
			System.out.println("1.ADMIN lOGIN");
			System.out.println("2.USER lOGIN");
			System.out.println("3.EXIT");
			System.out.println("ENTER UR CHOICE");
			int choice = scanner.nextInt();
			if (choice == 1) {
				acceptAdminDeatils();
			} else if (choice == 2) {
				UserDeatils();
			} else if (choice == 3) {
				status = false;
			} else {
				System.out.println("INVALID CHOICE");
			}
		}
	}

	private static void acceptAdminDeatils() {
		System.out.println("ENTER USER NAME");
		String tempName = scanner.next();
		System.out.println("ENTER PASSWORD");
		String userPass = scanner.next();
		if (adminName.equals(tempName) && password.equals(userPass)){
			
			System.out.println("successful login");
			System.out.println("1. ADD PRODUCTS");
			System.out.println("2. DISPLAY PRODUCTS");
			System.out.println("SELECT UR CHOICE");
			int choice1 = scanner.nextInt();
			if (choice1 == 1) {
				dao.addProduct();
			} else if (choice1 == 2) {
				dao.displayProduct();
			} else {
				System.out.println("INVALID CHOICE");
			}
		} else {
			System.out.println("INVALID USERNAME OR PASSWORD");
		}
	}
	private static void UserDeatils() {
		System.out.println("ENTER USER NAME");
		String tempName = scanner.next();
		System.out.println("ENTER PASSWORD");
		String userPass = scanner.next();
		if (userName.equals(tempName) && userpass.equals(userPass)) {
			System.out.println("successful login");
			System.out.println("1. ADD PRODUCTS");
			System.out.println("2. DISPLAY PRODUCTS");
			System.out.println("SELECT UR CHOICE");
			int choice1 = scanner.nextInt();
			if (choice1 == 1) {
				dao.addProduct();
			} else if (choice1 == 2) {
				dao.displayProduct();
			} else {
				System.out.println("INVALID CHOICE");
			}
		} else {
			System.out.println("INVALID USERNAME OR PASSWORD");
		}
}
}
