package assignment7;
import java.util.*;

public class TrainPassenger {
	
	public static void addAtFirst(LinkedList<String> l, String passenger) {
		l.addFirst(passenger);
	}
	public static void addAtEnd(LinkedList<String> l, String passenger) {
		l.addLast(passenger);
	}
	public static void removeAtFirst(LinkedList<String> l) {
		l.removeFirst();
	}
	public static void removeAtEnd(LinkedList<String> l) {
		l.removeLast();
	}
	public static void searchPassenger(LinkedList<String> l, String passenger) {
		int index = l.indexOf(passenger);
		if(index != -1) {
			System.out.println(passenger + " found at index " + index);
		}
		else
			System.out.println(passenger + " not found");
	}
	public static void displayPassengers(LinkedList<String> l) {
		for(String p : l) {
			System.out.println(p);
		}
	}
	
	
	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		
		l.add("Keerthan");
		l.add("Ram");
		l.add("Krishna");
		
		addAtFirst(l, "Sai");
		addAtEnd(l, "Keeru");
		
		displayPassengers(l);
		System.out.println("-------------------------------------------------");
		
		System.out.println("After Deleting Passengers");
		removeAtFirst(l);
		removeAtEnd(l);
		
		displayPassengers(l);

	}
}
