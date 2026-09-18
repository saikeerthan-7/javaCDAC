//package arrayList;
//import java.util.*;
//
//import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;
//import sun.jvm.hotspot.tools.SysPropsDumper;
//
//public class ProductOperation {
//	Scanner s = new Scanner(System.in);
//
//	ArrayList<Product> al = new ArrayList<>();
//	
//	void addProduct() {
//		System.out.println("Enter the number of products to add : ");
//		int n = s.nextInt();
//		while(n > 0) {
//			System.out.println("Enter product id : ");
//			int id = s.nextInt();
//			s.nextLine();
//			System.out.println("Enter the product name : ");
//			String p = s.nextLine();
//			System.out.println("Enter quantity of product : ");
//			int count = s.nextInt();
//			System.out.println("Enter price of prodduct : ");
//			double price = s.nextFloat();
//			al.add(new Product(id, p, n, price));
//			n--;
//		}
//		
//	}
//	
//	void diplayStock() {
//		for(Product ele:al) {
//			System.out.println(ele);
//		}
//	}
//	
//	
//	
//	void restockOrSellProduct() {
//		System.out.println("the 1 of restock and and enter the 2 for thesellproduct");
//		
//		int ch=s.nextInt();
//		switch(ch) {
//		case 1:{
//			System.out.println("Enter the product id : ");
//			int pId = s.nextInt();
//			System.out.println("Enter the quantity to add : ");
//			int q = s.nextInt();
//			if(al.contains(pId)) {
//				al.get(ch).quantity += q;
//			}
//			
//			
//		}
//			
//		}
//		
//	}
//}
//
//
//
//
//
//
//
