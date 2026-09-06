package assignment2;

public class ProductDiscount {
	
	public static void calculateFinalprice(float amount) {
		float finalPrice;
		if(amount >= 10000) {
			finalPrice = amount - (amount * 20/100) ;
		}
		else if(amount >= 5000 && amount < 10000) {
			finalPrice = amount - (amount * 10/100);
		}
		else if(amount >= 2000 && amount < 5000) {
			finalPrice = amount - (amount * 5/100);
		}
		else {
			finalPrice = amount;
		}
		System.out.println(finalPrice);
	}

	public static void main(String[] args) {
		String productName = "aaa";
		int productId = 101;
		System.out.println(productId + " - " + productName);
		float price = 4000;
		calculateFinalprice(price);
	}

}
