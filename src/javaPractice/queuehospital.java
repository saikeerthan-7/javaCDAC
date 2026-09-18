package javaPractice;

import java.util.*;

public class queuehospital {
	void addpatient(Queue<String> q,String patient) {
		q.offer(patient);
	}
	
	void treatpatient(Queue<String> q) {
		System.out.println(q.poll());
	}
	
	void viewNextpatient(Queue<String> q) {
		System.out.println(q.peek());
	}
	
	void displaywaitingpatients(Queue<String> q) {
		for(String a:q) {
			System.out.println(a);
		}
	}
	
	public static void main(String[] args) {
		Queue<String> q=new PriorityQueue<>();
		
		
		queuehospital d=new queuehospital();
		d.addpatient(q, "Nitin");
		d.addpatient(q, "Keerthan");
		d.addpatient(q, "Hashir");
		d.displaywaitingpatients(q);
		
		d.treatpatient(q);
		d.viewNextpatient(q);
		d.displaywaitingpatients(q);
		
	}
}
