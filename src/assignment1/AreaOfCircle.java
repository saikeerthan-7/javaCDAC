package assignment1;

import java.util.*;

public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float r=sc.nextFloat();
		
		double area=3.14*r*r;
		double circumference = 2*3.14*r;
		System.out.println("area of cirle : "+area);
		System.out.println("circumference of cirle : "+circumference);
		
		sc.close();
	}

}
