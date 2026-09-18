package arrayList;

public class Product {
	 int productId;
	 String productName;
	 int quantity;
	 double price;
	
	Product(int productId, String productName, int quantity, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Id : "+productId+"Name  : " + productName + "Quantity : " + quantity + "Price : "+ price;
	}
	
}
