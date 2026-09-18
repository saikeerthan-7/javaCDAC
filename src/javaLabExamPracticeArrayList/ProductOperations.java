package javaLabExamPracticeArrayList;
import java.util.*;

public class ProductOperations {
	
	ArrayList<Product> al = new ArrayList<Product>();
	Scanner s = new Scanner(System.in);
	
	
	public void addNewProducts() {
		System.out.println("Enter the product ID : ");
		int id = s.nextInt();
		for(Product p : al) {
			if(p.productId == id) {
				System.out.println("Product ID already exists try other");
				return;
			}
		}
			al.add(new Product(s.nextInt(), s.next(), s.next(), s.nextFloat(), s.nextInt()));
	}
	
	
	public void searchByProductId() {
		System.out.println("Enter product id : ");
		int id = s.nextInt();
		
		for(Product p : al) {
			if(p.productId == id) {
				p.productDetails();
				return;
			}
		}
		System.out.println("Product Not Found");
	}
	
	public void searchByProductName() {
		System.out.println("Enter product name : ");
		s.nextLine();
		String name = s.nextLine();
		for(Product p : al) {
			if(p.productName.equals(name)) {
				p.productDetails();
				return;
			}
		}
		System.out.println("Product Not Found");
	}
	
	public void updateProductDetails() {
		System.out.println("Enter Product ID to update : ");
		int id = s.nextInt();
		for(Product p : al) {

		    if(p.productId == id) {

		        System.out.println("Product ID found");

		        s.nextLine();

		        System.out.println("Enter the new product name : ");
		        String newName = s.nextLine();

		        System.out.println("Enter new Category : ");
		        String newCategory = s.nextLine();

		        System.out.println("Enter new Price : ");
		        float newPrice = s.nextFloat();

		        System.out.println("Enter new quantity : ");
		        int newQuan = s.nextInt();

		        p.productName = newName;
		        p.price = newPrice;
		        p.category = newCategory;
		        p.quantity = newQuan;

		        System.out.println("Product updated successfully");
		        return;
		    }
		}

		System.out.println("Product ID does not exist");
	}
	public void deleteProduct() {
	    System.out.println("Enter Product ID : ");

	    int id = s.nextInt();

	    Iterator<Product> i = al.iterator();

	    while(i.hasNext()) {

	        Product p = i.next();

	        if(p.productId == id) {
	            i.remove();
	            System.out.println("Product deleted successfully");
	            return;
	        }
	    }

	    System.out.println("Product ID does not exist");
	}
	
	public void sortByPriceAscending() {
		al.sort(Comparator.comparingDouble(p -> p.price));
		
		for(Product p : al) {
			p.productDetails();
		}
	}
	
	public void sortByPriceDescending() {
		al.sort(Comparator.comparingDouble((Product p) -> p.price).reversed());		
		for(Product p : al) {
			p.productDetails();
		}
	}
	
	public void sortProductsByName() {
		al.sort(Comparator.comparing(p -> p.productName));
		for(Product p : al) {
			p.productDetails();
		}
	}
	
}
