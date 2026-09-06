package assignment3;

public class CountEvenOdd {

	public static void main(String[] args) {
		int[] arr = {14, 17, 10, 9, 2, 1};
		
		int evenCount = 0, oddCount = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				evenCount++;
			}
			else
				oddCount++;
		}
		System.out.println("Even Numbers in array : " + evenCount);
		System.out.println("Odd Numbers in array : " + oddCount);
	}

}
