package javaPractice;

import java.util.*;

public class areacalculator {
	
	static Scanner sc=new Scanner(System.in);
	
	public static void areaofcircle() {
		System.out.println("Enter the radius : ");
		int r=sc.nextInt();
		double aoc=Math.PI*r*r;
		System.out.println("The area of circle is "+aoc);
	}
	
	
	public static void areaofrectangle() {
		System.out.println("Enter the length and breadth : ");
		int l = sc.nextInt();
		int b = sc.nextInt();
		int aor = l * b;
		System.out.println("Area of Rectangle : " + aor);
	}
	
	
	public static void areaoftriangle() {
		System.out.println("Enter the length and breadth : ");
		int length = sc.nextInt();
		int breadth = sc.nextInt();
		
		int aot = (1/2)* length *breadth;
		System.out.println("Area of Triangle : "+aot);
	}
	
	
	
	
}
