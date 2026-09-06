package assignment2;

public class LargestNum {
	
	public static int findLargest(int a,int b) {
		if(a>b) {
			return a;
		}
		else if(a<b) {
			return b;
		}
		else {
			return a;
		}
	}
	
	public static void main(String[] args) {
		int a=2;
		int b=4;
		System.out.println(findLargest(a, b));
	}

}
