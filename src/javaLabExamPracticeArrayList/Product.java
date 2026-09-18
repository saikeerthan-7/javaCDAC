package javaLabExamPracticeArrayList;

public class Product {
	int productId;
	String productName;
	String category;
	float price;
	int quantity;
	
	public Product(int productId, String productName, String category, float price, int quantity) {
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void productDetails() {
		System.out.println("Product ID : " + productId);
		System.out.println("Product Name : " + productName);
		System.out.println("Price : " + price);
	}
	

}
