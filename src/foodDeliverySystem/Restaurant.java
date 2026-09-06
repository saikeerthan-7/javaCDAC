package foodDeliverySystem;

import java.util.*;
public class Restaurant {
	String restaurantName;
	ArrayList<String> items = new ArrayList<>();
	
	void addItems(String itemName) {
		items.add(itemName);
		}
	void displayMenu() {
		System.out.println(items);
	}
}
