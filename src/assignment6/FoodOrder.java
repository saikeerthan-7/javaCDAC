package assignment6;

public class FoodOrder {
	public static double calculateBill(double foodPrice) {
		return foodPrice;
	}
	
	public static double calculateBill(double foodPrice, int quantity) {
		return foodPrice * quantity;
	}
	public static double calculateBill(double foodPrice, int quantity, double deliveryCharge) {
		return (foodPrice * quantity) + deliveryCharge;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(calculateBill(250));
		System.out.println(calculateBill(250, 3));
		System.out.println(calculateBill(250));
		
	}
	
	
}
