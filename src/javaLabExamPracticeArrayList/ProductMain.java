package javaLabExamPracticeArrayList;
import java.util.*;

public class ProductMain {	

	public static void main(String[] args) {

	    Scanner s = new Scanner(System.in);

	    ProductOperations po = new ProductOperations();

	    while(true) {

	        System.out.println("1. Add Product");
	        System.out.println("2. Search Product by ID");
	        System.out.println("3. Search Product by Name");
	        System.out.println("4. Update Product");
	        System.out.println("5. Delete Product");
	        System.out.println("6. Sort Price Ascending");
	        System.out.println("7. Sort Price Descending");
	        System.out.println("8. Sort Product Name");
	        System.out.println("9. Exit");

	        int choice = s.nextInt();

	        switch(choice) {

	            case 1:
	                po.addNewProducts();
	                break;

	            case 2:
	                po.searchByProductId();
	                break;

	            case 3:
	                po.searchByProductName();
	                break;

	            case 4:
	                po.updateProductDetails();
	                break;

	            case 5:
	                po.deleteProduct();
	                break;

	            case 6:
	                po.sortByPriceAscending();
	                break;

	            case 7:
	                po.sortByPriceDescending();
	                break;

	            case 8:
	                po.sortProductsByName();
	                break;

	            case 9:
	                System.out.println("Thank you!");
	                System.exit(0);

	            default:
	                System.out.println("Invalid choice");
	        }
	    }
	}
	

}
