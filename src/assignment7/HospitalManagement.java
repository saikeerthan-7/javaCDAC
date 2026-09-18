package assignment7;
import java.util.*;

public class HospitalManagement {
	
	public static void addPatient(Queue<String> q, String name) {
		q.offer(name);
	}
	public static void treatPatient(Queue<String> q) {
		q.poll();
		System.out.println(q);
	}
	public static void nextPatient(Queue<String> q) {
		
		System.out.println(q.peek());
	}
	public static void displayWaitingPatients(Queue<String> q) {
		for(String name : q) {
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
		PriorityQueue<String> q = new PriorityQueue<String>();
		addPatient(q, "Keerthan");
		addPatient(q, "Sai");
		addPatient(q, "Keeru");
		addPatient(q, "Ram");
		Scanner s = new Scanner(System.in); 
		int choice = 0;
		while(true) {
			System.out.println("Operations\n1. Add Patient\n2. Treat Patient\n3. View Next Patient\n4. Display Waiting Patients\n5. Exit");
			System.out.println("eNTeR the choice : ");
			choice = s.nextInt();
			
			switch(choice) {
			case 1 : 
				treatPatient(q);
				break;
			case 2:
				nextPatient(q);
				break;
			case 3 :
				displayWaitingPatients(q);
				break;
				
			case 4:
				System.exit(0);
			default:
				System.out.println("Enter choice between 1 to 4 ");
			}
		}
		
	}
	
	
}
