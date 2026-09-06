package oops;
import java.util.*;
public class ProductBillDemoArrayOfObj {

	public static void main(String[] args) {
		ProductBillArrayOfObj[] p = new ProductBillArrayOfObj[3];
		
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			p[i] =new ProductBillArrayOfObj(s.nextInt(), s.next(), s.nextFloat(), s.nextInt());
		}
		for(ProductBillArrayOfObj i : p) {
			
			i.display();
		}
		s.close();

	
	}

}
