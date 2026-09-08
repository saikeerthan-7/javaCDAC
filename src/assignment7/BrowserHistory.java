package assignment7;
import java.util.*;

public class BrowserHistory {
	static Scanner sc = new Scanner(System.in);
	public static void visitNewPage(Stack<String> s,String name) {
		s.push(name);
		displayHistoryPage(s);
		
	}
	public static void goBack(Stack<String> s) {
		System.out.println(s.pop());
	}
	
	public static void viewCurrentPage(Stack<String> s) {
		System.out.println(s.peek());
	}
	public static void displayHistoryPage(Stack<String> s) {
		for(String page : s) {
			System.out.println(page);
		}
	}
	
	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		visitNewPage(s, "Google");
		visitNewPage(s, "YouTube");
		visitNewPage(s, "GitHub");
		
		while(true) {
			System.out.println("eNTeR the Choice\n1. Visit New page\n2. Go BAAck\n3. View Current Page\n4. Display History\n5. Exit");
			int choice = sc.nextInt();
			switch(choice) {
			case 1 :
				visitNewPage(s, sc.next());
			case 2 :
				goBack(s);
				break;
			case 3 :
				viewCurrentPage(s);
				break;
			case 4 :
				displayHistoryPage(s);
				break;
			case 5 :
				System.exit(0);
			}
			
		}
	}
}


