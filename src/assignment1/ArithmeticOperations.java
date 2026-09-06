package assignment1;
import java.util.*;
public class ArithmeticOperations {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int add = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b;
		int mod = a % b;
		
		System.out.println("Addition of "+a + " and " +b +" = " +add);
		System.out.println("Subtraction of "+a + " and " +b +" = " +sub);
		System.out.println("Multiplication of "+a + " and " +b +" = " +mul);
		System.out.println("Division of "+a + " and " +b +" = " +div);
		System.out.println("Modulo of "+a + " and " +b +" = " +mod);
		s.close();
	}
}
