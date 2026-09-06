package oops;

public class ProductBillArrayOfObj {
	int productId;
	String productName;
	float price;
	int quantity;
	ProductBillArrayOfObj(int productId, String productName, float price, int quantity) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	void display() {
		System.out.println("Product Id : " + productId);
		System.out.println("Product Name : " + productName);
		System.out.println("Price : " + price);
		System.out.println("Quantity : " + quantity);
		float totalAmount = calculateBill(price, quantity);
		System.out.println("Total Amount : " + totalAmount);
		float discount = discount(totalAmount); 
		float finaldiscount=totalAmount *(discount/100);
		
		System.out.println("Discount : " + finaldiscount);
		System.out.println("Final Amount : " + (totalAmount - finaldiscount));
		
	}
	
	float calculateBill(float price, int quantity) {
		float total = price * quantity;
		return total;
	}
	
	
	int discount(float total) {
		if(total > 10000) {
			return 10;
		}
		else {
			return 0;
		}
	}
	
	}
	
	

