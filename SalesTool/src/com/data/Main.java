package com.data;
public class Main {

	public static void main(String[] args) {
		SalesData data = new SalesData();
		displayGreeting();
		data.display();
	}

	private static void displayGreeting() {
		System.out.println("Hello, Hi Sales People ...");
		System.out.println("This App shows sales data ...");
		System.out.println("Now it's Done!");
	}

}
