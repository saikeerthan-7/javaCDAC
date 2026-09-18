package array;
import java.util.*;

public class ArrayProblem {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Array Size : ");
		int n = s.nextInt();
		int[] arr = new int[n];
		int highest = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
			if(arr[i] > highest) {
				highest = arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter the Key : ");
		int key = s.nextInt();
		for(int i = 0; i < n; i++) {
			
			if(key == arr[i]) {
				System.out.println(key + " found at index " + i);
			}
		}
		System.out.println("Highest Marks : " + highest);
		s.close();
	}
}
